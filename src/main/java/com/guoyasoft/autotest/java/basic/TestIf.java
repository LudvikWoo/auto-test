package com.guoyasoft.autotest.java.basic;

import org.testng.annotations.Test;

public class TestIf {


  @Test
  public void testIf(){
      int a=5;
      if(a<10){
        System.out.println("a小于10");
      }
  }

  @Test
  public void testIfElse(){
    int a=13;
    if (a<10){
      System.out.println("a小于10");
    }else{
      System.out.println("a大于等于10");
    }
  }

  @Test
  public void testEleseif(){
      int a=13;
      if(a<10){
        System.out.println("a小于10");
      }else if(a==10){
        System.out.println("a等于10");
      }else{
        System.out.println("a大于10");
      }
  }
}
