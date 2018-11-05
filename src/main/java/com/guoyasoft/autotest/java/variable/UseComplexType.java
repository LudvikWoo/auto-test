package com.guoyasoft.autotest.java.variable;

import org.testng.annotations.Test;

public class UseComplexType {

  @Test
  public void testMethod(){
    Student s=new Student();


    System.out.println(s.toString());
  }
}
