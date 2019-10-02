package cn.train.config;

import cn.train.controller.TicketController;
import cn.train.enity.SoldTicket;
import cn.train.service.TicketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public  class Redis extends Thread{

    @Autowired
    private RedisTemplate redisTemplate;
    private static String it=new String ("me");

    private static ListOperations<String, SoldTicket> listRedis;

    @PostConstruct
    private void init(){
        listRedis = redisTemplate.opsForList();
    }

    public static void publishMessage(Integer id,SoldTicket soldTicket) {
            synchronized (it) {
                listRedis.leftPush(id.toString(), soldTicket);
                try {
                    it.notifyAll();
                } catch (Exception e) {
                    System.out.println("出现了异常");
                    e.printStackTrace();
                }
            }
        }

    @Override
    public  void run() {
            while (true) {
                synchronized (it) {
                    SoldTicket soldTicket = listRedis.rightPop(TicketController.id);
                    if (soldTicket == null) {
                        System.out.println("消息队列为空");
                        try {
                            System.out.println("进入等待");
                            it.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("目前处于执行状态");
                    TicketController.soldTicket = soldTicket;
                    System.out.println("message: " + soldTicket);
                }
            }
        }

}