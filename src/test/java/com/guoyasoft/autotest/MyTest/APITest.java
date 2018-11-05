package com.guoyasoft.autotest.MyTest;

import com.alibaba.fastjson.JSON;
import com.guoyasoft.autotest.java.Tools.HttpClientUtils;
import com.guoyasoft.autotest.java.bean.user.login.LoginReq;
import com.guoyasoft.autotest.java.bean.user.login.LoginResp;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APITest {
  @Test
  public void loginTest(){
      //第一步：生成请求javabean
    LoginReq loginReq=new LoginReq();
    loginReq.setUserName("wuling23");
    loginReq.setPwd("wl123456");
      //第二步：转换成json请求报文
    String reqJson= JSON.toJSONString(loginReq,true);
    System.out.println("----------------请求报文：----------------------");
    System.out.println(reqJson);
      //第三步：发送http请求
    String result=HttpClientUtils.doPostByJson("http://qa.guoyasoft.com:8080/user/login", reqJson, "UTF-8");
    System.out.println("----------响应报文：------------------");
    System.out.println(result);
    //第四步：响应json转成javabean
    LoginResp loginResp=JSON.parseObject(result,LoginResp.class);
      //第五步：响应断言
    Assert.assertEquals(loginResp.getRespCode(), "0000");

  }
}
