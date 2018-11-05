package com.guoyasoft.autotest.java.variable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;

public class Collection {

  @Test
  public void array(){
      //固定大小，存单个数据
    int[] scores=new int[20];
    scores[0]=0;
    scores[1]=1;
    System.out.println("数组长度："+scores.length);
    System.out.println("第1个："+scores[0]);
  }

  @Test
  public void list(){
    List<Integer> l=new ArrayList<Integer>();
    System.out.println("list的大小："+l.size());
    l.add(3);
    l.add(5);
    System.out.println("list的大小："+l.size());
    System.out.println(l.get(1));
  }

  @Test
  public void map(){
    Map<String,Integer> m=new HashMap<String,Integer>();
    m.put("孙佳佳", 90);
    m.put("张渊", 95);

    System.out.println("张渊的成绩："+m.get("张渊"));
  }

  public void set(){

  }

  @Test
  public void testMethod(){
    Student s1=new Student();
    s1.setName("孙佳佳");
    s1.setSalary(20000);

    Student s2=new Student();
    s2.setName("戈维维");
    s2.setSalary(25000);

    Map<String,Student> map=new HashMap<String,Student>();
    map.put("1", s1);
    map.put("2", s2);

    Student s=map.get("1");
    System.out.println(s.getSalary());
  }
}
