package cn.train.mapper;

import cn.train.enity.SoldTicket;
import cn.train.enity.UnsoldTicket;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UnsoldTicketMapper {
    int get_page_unsold();
    List<UnsoldTicket>onepage(int pageNumber,int pageSize);
    int deleteByPrimaryKey(Integer id);

    int insert(UnsoldTicket record);

    int insertSelective(UnsoldTicket record);

    UnsoldTicket selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UnsoldTicket record);

    int updateByPrimaryKey(UnsoldTicket record);

    List<UnsoldTicket> getUnsoldTicketByTrainid(int trainid);

    List<UnsoldTicket> getUnsoldTicketByLevelSeat(SoldTicket soldTicket);
}