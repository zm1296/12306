package cn.train.service;

import cn.train.enity.OrderInfo;
import cn.train.enity.Search;
import cn.train.enity.SoldTicket;
import cn.train.enity.UnsoldTicket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TicketService {

    List<UnsoldTicket> SingleSearch(Search search);

    int[] getUnsoldTicketNum(Search search);

    OrderInfo submitTicket(SoldTicket soldTicket);
    public float CalculatePrice(int[] path,int m,int n);

}
