package cn.train.mapper;

import cn.train.enity.ContactInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactInfoMapper {
    List<ContactInfo>get_contact(Integer userid);
    int selectByUserid(Integer userid);
    int deleteByUserid(Integer id);
    int deleteByPrimaryKey(Integer id);

    int insert(ContactInfo record);

    int insertSelective(ContactInfo record);

    ContactInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ContactInfo record);

    int updateByPrimaryKey(ContactInfo record);

    List<ContactInfo> getCotactByUserid(Integer userid);
}