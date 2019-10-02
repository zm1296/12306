package cn.train.mapper;

import cn.train.enity.SoldTicket;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SoldTicketMapper {
    List<SoldTicket>getAll();
    int deleteByPrimaryKey(Integer id);

    int insert(SoldTicket record);

    int insertSelective(SoldTicket record);

    SoldTicket selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SoldTicket record);

    int updateByPrimaryKey(SoldTicket record);

    List<SoldTicket> selectByOrderid(Integer orderid);

    int getIdBySoldTicket(SoldTicket soldTicket);
}