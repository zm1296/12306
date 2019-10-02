package cn.train.alipay;
 
import java.io.FileWriter;
import java.io.IOException;
 
/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */
 
public class AlipayConfig {
 
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
 
	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016101200667170";
 
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCHEoosEX/JZlQzM6WI9X/JYXMISQzQMK2AxfLNkH1B5GvBa9IYuQJyH/BAC8XUhjl7qpHKxet9//IkliqyqUrmBAQYDg4ZQCYL0OJNW7avs70MRzRIgOLeWpbCrbDoe83pTzo2IYz+rdA0y11U8mx6zl+7cTPYyHVZnZ6xiJzL6h8HmfyHANafd0kq/ci4dirU2r7REYnND0NyuY8ycMNv8U5tczB4dW3DS2enUz3gbvA80u/9wqwL6hg4HVN8D8UjGSvbeQKE+hAsjWb5OpbjsiwYs3vmgHaqaz0istR1i6FSh9hXUes2lA8lheTKr+Ps3DejKySdrdDWMWdd/BtzAgMBAAECggEAWhDuuXvhrbXiJ1Ik6zJoRywHvFqZhKkwyFE2GgRiwXFCuPLgYUPccaUCWnJ/M7tc0S1nkcJvyNDF8ceAKSnhm4bKBBA7LnMr620ZuWOSaY58XJeOMVpf7MyTArU25Y7IOu5tbnLoxVm5H7sLPP15gFnkU+SkIcVpGpyTmOXzR7SYMPnAoh0KCUS56iCh3LOP5i2TJ+NwRoqWfUxCaP16mRo4eg2J4kjCnf9Mc+cWZtVl1Ae5/4XVyUiRhesdZPsAQCM+zSzHM4lZWdsRZF3hMfFghGjN9Z5yL/0W/kJIphwZLRMAfPKfsiNqSyEv9TIPQK3+Q8JmkBbKBFA9grOQoQKBgQDORl6N/Qmz3qr4Vph3m7yV6idVqjlWzgFiM++/aCJ+qMUoRsJ502e76rJlkI1JWWg5Zk9JnZIcUOK7fvoJuKjuzXBufLevf4jX6sdrYQnvJqx9hWo6TlV9ruyTZlagv4j6Vr0e/owrw9FQB0cl04vxtxy0uPG61aFIVKVdOF1zbwKBgQCnoiA3nSuTqSl29geoP/WEvPmzTpgiQP/6dZSxIhuiKjGBfUj0afD2ELsQjS4rXyUyLaCNwKmJJrXw90zuhD+yoOdhiSWi+JkYvrCF5XmFaSpo4GsOMVf8z6IlUpQSSz9eu/vyT7uTCgvOeZaHiJj3I16ly7AVzughVokBk60GPQKBgQC5i7TsFcvPfyDdZ8+X73+wfkLJnOgc/AtkkYE79Gjq89b9BsFSomYyM8gq8d8VNpY44524g0N1sxBwRaSWcAONY0CaMhdshtTKHAcrwMsV0vzfn83RCrt95YYqhKixyfhl7vYJVkEx8N9sFE/cZ7D/SY5Jxf6y6A0+qd1hwBzXgwKBgFw1KMWOlZa+eQlvoZyhudpO3IcN108YM/W/0Y9xtIOJ8/tHP+b5k0q2vz8GeXvv9RTZ1jPC4z6G5ZNrZIzaf/Mw4LVc7C/t0MC0u4KbTDHfPC2+LAT9jWmJiKZA+yPo8i2Y96g8xW/HGeF0LiHVOFbQxNIr7WrBihw0bl5Ireb9AoGAGaYH1IAqZ8MRZdMKioSAv5sfPzqhM8dvy0ilROsS3louEDpU7n3X2umqK91RYqjUP3DNN5GFd004tlDqUw/uydBuwZ1CNcfw+jkjonSkr9F7wfR+K563ogt9RxrJjnZEWcmiaky6BTqL6+03jki6/BuGh6iMSn66l+Q1JxswUUE=";

	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuAQVH20jzM68Yy38hVzrGbI2aXtPjoVeLdPjywdzZumNEeWsvHn171lsUF3Ts579gaGuFUDrLzUy3x4Cdn5ZVJNEU9fLQPA/CYRdSDYdQwJS+vlmMDmYzLuhTLoUi3LDsHCcyCeF864bgJprALvyVyau9kdgYWWF1jQ6yXjtECvnY/krjBdD0nfdzV2m9nxKbhjZummMiFtyZ4at+uV6onqu8w5MKrvR/GQMo6/zxhViWhHb3Oc9vbCYUook5xIMvIeBF1z+/Hwd2tRxUBJIkoKaTHSAjkLbf8S8KpJEUhMzpVPVuPO+XIw2qWTTV/BMwksYHdWNI4jea5LH41aOfQIDAQAB";
 
	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/html/12306/Index/index.html";
 
	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问  return_url.jsp
	public static String return_url ="http://localhost:8080/html/12306/Index/index.html";
 
	// 签名方式
	public static String sign_type = "RSA2";
 
	// 字符编码格式
	public static String charset = "utf-8";
 
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
 
	// 支付宝网关
	public static String log_path = "C:\\";
 
 
//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
 
    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
