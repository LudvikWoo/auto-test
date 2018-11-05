package com.guoyasoft.autotest.MyTest;

import com.alibaba.fastjson.JSON;
import com.guoyasoft.autotest.java.bean.order.addOrder.AddOrderReq;
import com.guoyasoft.autotest.java.bean.order.addOrder.OrderLine;
import com.guoyasoft.autotest.java.bean.user.login.LoginReq;
import com.guoyasoft.autotest.java.bean.user.login.LoginResp;
import com.guoyasoft.autotest.java.bean.user.realName.RealNameReq;
import com.guoyasoft.autotest.java.bean.user.signUp.RespBase;
import com.guoyasoft.autotest.java.bean.user.signUp.SignUpResp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JsonTest {

  @Test
  public void bean2json(){
    LoginReq loginReq=new LoginReq();
    loginReq.setUserName("wuling");
    loginReq.setPwd("123456");
    //第二个参数：是否格式化json，可不填，默认一行不格式化，若需格式化，传true
    String request=JSON.toJSONString(loginReq, true);
    System.out.println(request);
  }

  @Test
  public void json2bean(){
      String result="{\n"
          + "  \"respCode\": \"0000\",\n"
          + "  \"respDesc\": \"登录成功\"\n"
          + "}";
      //第一个参数：要转换的json；第二个参数：要转换成的类，其中.class表示类型
    LoginResp response=JSON.parseObject(result,LoginResp.class);
    System.out.println("响应编码="+response.getRespCode());
    Assert.assertEquals(response.getRespCode(), "0000");
  }

  @Test
  public void testMethod(){
    SignUpResp signUpResp=new SignUpResp();
    signUpResp.setUserName("wuling");
    signUpResp.setUserId(123);
    signUpResp.setCstId(222);
    signUpResp.setAccoutId(2223);

    RespBase respBase=new RespBase();
    respBase.setRespDesc("成功");
    respBase.setRespCode("0000");
    signUpResp.setRespBase(respBase);

    String json=JSON.toJSONString(signUpResp,true);
    System.out.println(json);
  }

  @Test
  public void bean2json3(){
    List<OrderLine> lineList=new ArrayList<OrderLine>();

    for(int i=0;i<4;i++){
      OrderLine orderLine=new OrderLine();
      orderLine.setSkuCode("1000"+i);
      orderLine.setQty(1+i);
      lineList.add(orderLine);
    }

    AddOrderReq addOrderReq=new AddOrderReq();
    addOrderReq.setOrderLineList(lineList);
    addOrderReq.setUserName("wuling");
    addOrderReq.setReceivingAddress("上海");
    addOrderReq.setReceiverPhone("18616765946");
    addOrderReq.setOrdeerPrice(3000);

    String json=JSON.toJSONString(addOrderReq,true);
    System.out.println(json);
  }


}
