package com.guoyasoft.autotest.java.variable;

import org.testng.annotations.Test;

public class BasicVars {

  @Test
  public void basicVarsTest(){
    //布尔类型，一般用来做标识和判断
    boolean result=true;//false
    //数字：整数
    byte b=3;//8位
    short s=1231;//16位
    int i=231231231;//32位
    long l=21312312312222l;//64位，后面带小写的L
    //数字：小数
    float f=23423.23f;//32位，后面带个小写的f
    double d=2342342.23232;//64位
    //字符
    char c='a';//16位
  }

}
