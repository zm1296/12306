package cn.train.mapper;

import cn.train.enity.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserInfoMapper {
    List<UserInfo>getAlluser();
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    int checkInfo(UserInfo userInfo);

    int selectIdByidnumber(String string);

    UserInfo checklogin(UserInfo userInfo);

    UserInfo checkEmail(UserInfo userInfo);

    int activateStatus(Integer id);

    int changePhoneCheck(UserInfo userInfo);
}