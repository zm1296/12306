package cn.train.service;

import cn.train.enity.ContactInfo;
import cn.train.enity.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    int Userregsiter(UserInfo userInfo);

    UserInfo logincheck(UserInfo userInfo);

    List<UserInfo>Get_AllUser();

    int AddContact(ContactInfo contactInfo);

    UserInfo getInfo(int id);

    int UserActivate(UserInfo userInfo);

    List<ContactInfo> getCotactByUserid(int userid);

    int deleteContactByUserid(int id);

    String changePhone(UserInfo userInfo);
}
