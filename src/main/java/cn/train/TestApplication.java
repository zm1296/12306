package cn.train;

import cn.train.config.Redis;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.solr.SolrAutoConfiguration;


@SpringBootApplication(exclude = SolrAutoConfiguration.class)
@MapperScan("cn.train.mapper")
public class TestApplication {

    public static void main(String[] args)  {
        SpringApplication.run(TestApplication.class, args);
        Redis consumer=new Redis();
        consumer.start();
    }

}
