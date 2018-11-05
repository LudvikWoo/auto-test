package com.guoyasoft.autotest.java.testCase;

import java.util.ArrayList;
import java.util.List;
import org.testng.annotations.Test;

public class SignUPTest {


  @Test
  public void testMethod() {
    //第一步：把1个接口用例的数据，自定义类打包
    SignUpReq req=new SignUpReq();
    req.setUserName("测试用户");
    req.setPhone("18767889987");
    req.setPwd("12345");
    req.setRePwd("12345");

    //第二步：用一个容器，把所有测试用例打包存储
    List<SignUpReq> reqs=new ArrayList<SignUpReq>();
    reqs.add(req);

    //第三步：使用容器存放的测试用例，调用接口
    SignUpReq item=reqs.get(0);
    System.out.println(item.toString());
  }


  @Test
  public void testBatch() {
    //第一步：把1个接口用例的数据，自定义类打包
    List<SignUpReq> reqs=new ArrayList<SignUpReq>();

    for(int i=0;i<20;i++){
      SignUpReq req=new SignUpReq();
      req.setUserName("测试用户"+i);
      req.setPhone("18767889987"+i);
      req.setPwd("12345");
      req.setRePwd("12345");

      //第二步：用一个容器，把所有测试用例打包存储
      reqs.add(req);
    }

    //第三步：使用容器存放的测试用例，调用接口
    for(int i=0;i<reqs.size();i++){
      SignUpReq item=reqs.get(i);
      System.out.println(item.toString());
    }

  }
}
