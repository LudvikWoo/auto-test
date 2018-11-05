package com.guoyasoft.autotest.java.basic;

import org.testng.annotations.Test;

public class TestLoop {

  @Test
  public void testWhile() {
    int i = 0;
    //循环次数：初始值、最大值、增量、结束判断
    while (i < 5) {
      System.out.println("i=" + i);
      i++;
      /*
      i=i+1;  i+=1;  i++
      i=i+2;  i+=2;
      i=j+3;
       */
    }
  }

  @Test
  public void testFor(){
    for (int i=0;i<5;i++){
      System.out.println("i="+i);
    }
  }
}
