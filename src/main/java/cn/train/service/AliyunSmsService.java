package cn.train.service;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import org.springframework.stereotype.Service;

@Service
public interface AliyunSmsService {
    public String sendSmsVerifyCode(String telephone) throws ClientException;
}
