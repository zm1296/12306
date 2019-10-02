package cn.train.service;

import cn.train.enity.ContactInfo;
import cn.train.enity.UserInfo;
import cn.train.mapper.ContactInfoMapper;
import cn.train.mapper.UserInfoMapper;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    ContactInfoMapper contactInfoMapper;
    @Autowired
    MailService mailService;
    @Autowired
    AliyunSmsService aliyunSmsService;

    public int ActivateEmail(UserInfo userInfo){

        String content = new String();

        content = "尊敬的" + userInfo.getName() + "：\n";
        content = content + "\t欢迎您注册使用中国铁路客户服务系统！\n";
        content = content + "\t该邮件旨在确认以下用户个人信息已成功创建：\n";
        content = content + "\t\t电子邮件：" + userInfo.getEmail() + "\n";
        content = content + "\t\t账户名：" + userInfo.getUsername() + "\n";
        content = content + "\t\t客户代码：" + userInfo.getId() + "\n";
        content = content + "\t请务必先点击下方链接激活您的账户，方便您使用我们的各项服务！\n";
        content = content + "\t\thttp://127.0.0.1:8080\n";

        mailService.sendMail(userInfo.getEmail(), "激活邮件", content);

        return 1;
    }

    @Override
    public int Userregsiter(UserInfo userInfo) {
        int n = 0;

        int count = userInfoMapper.checkInfo(userInfo);
        if(count != 0){
            System.out.println("用户信息已被注册！");
            return -1;//用户信息已存在
        }else{
            System.out.println("用户信息可注册！");
        }

        userInfo.setStatus(0);
        //开始插入信息
        if(userInfoMapper.insert(userInfo) == 1){
            //获取用户id
            n = userInfoMapper.selectIdByidnumber(userInfo.getIdnumber());
            //插入常用联系人信息
            ContactInfo contactInfo = new ContactInfo();
            contactInfo.setUserid(n);
            userInfo.setId(n);
            contactInfo.setName(userInfo.getName());
            contactInfo.setEmail(userInfo.getEmail());
            contactInfo.setIdnumber(userInfo.getIdnumber());
            contactInfo.setPhone(userInfo.getPhone());
            contactInfo.setSex(userInfo.getSex());
            contactInfo.setTraveltype(userInfo.getTraveltype());
            contactInfo.setDiscountcard(userInfo.getDiscountnumber());
            if(contactInfoMapper.insert(contactInfo)==1) {
                System.out.println("联系人信息插入成功");
            }
            else{
                System.out.println("联系人信息插入出现错误！");
                return -2;
            }
        }else{
            System.out.println("用户id获取失败");
            return -2;
        }

        //发送激活邮件
        int m = ActivateEmail(userInfo);
        if(m == 1){
            System.out.println("激活邮件发送成功！");
        }

        return n;
    }

    @Override
    public UserInfo logincheck(UserInfo userInfo) {

        UserInfo userInfo1 = userInfoMapper.checklogin(userInfo);
        System.out.println(userInfo1);
        return userInfo1;
    }
    @Override
    public List<UserInfo> Get_AllUser() {
        return userInfoMapper.getAlluser();
    }

    @Override
    public int AddContact(ContactInfo contactInfo) {
        int m = contactInfoMapper.insert(contactInfo);
        System.out.println(m);
        return m;
    }

    @Override
    public UserInfo getInfo(int id) {
        UserInfo temp = userInfoMapper.selectByPrimaryKey(id);
        temp.setPassword(null);
        return temp;
    }

    @Override
    public int UserActivate(UserInfo userInfo) {
        int temp  = 0;
        UserInfo userInfo1= userInfoMapper.checkEmail(userInfo);
        System.out.println(userInfo1);
        if (userInfo1 != null){
            if(userInfo1.getStatus() != 0){
                temp = -1;
            }else{
                userInfoMapper.activateStatus(userInfo1.getId());
                System.out.println("激活完成！ID：" + userInfo1.getId());
                temp = 1;
            }
        }else {
            temp = -2;
        }
        return temp;
    }

    @Override
    public List<ContactInfo> getCotactByUserid(int userid) {
        return contactInfoMapper.getCotactByUserid(userid);
    }

    @Override
    public int deleteContactByUserid(int id) {
        int m = contactInfoMapper.deleteByPrimaryKey(id);
        return m;
    }

    @Override
    public String changePhone(UserInfo userInfo) {
        int u = userInfoMapper.changePhoneCheck(userInfo);
        if (userInfo.getStatus() == 1 && u == 1){
            UserInfo temp = userInfoMapper.selectByPrimaryKey(userInfo.getId());
            temp.setPhone(userInfo.getPhone());
            int r = userInfoMapper.updateByPrimaryKey(temp);
            if (r == 1){
                return "success";
            }
        }else if (userInfo.getStatus() == 0 && u == 1){
            try {
                String Code = aliyunSmsService.sendSmsVerifyCode(userInfo.getPhone());
                return Code;
            } catch (ClientException e) {
                e.printStackTrace();
            }
        }else {
            return "error";
        }
        return null;
    }
}
