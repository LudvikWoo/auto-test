package com.guoyasoft.autotest.java.bean.user.realName;

import java.util.Date;

public class RealNameReq {
  private String birthday;
  private String certno;
  private String city;
  private int cstId;
  private String cstName;
  private String email;
  private String province;
  private int sex;


  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public String getCertno() {
    return certno;
  }

  public void setCertno(String certno) {
    this.certno = certno;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public int getCstId() {
    return cstId;
  }

  public void setCstId(int cstId) {
    this.cstId = cstId;
  }

  public String getCstName() {
    return cstName;
  }

  public void setCstName(String cstName) {
    this.cstName = cstName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public int getSex() {
    return sex;
  }

  public void setSex(int sex) {
    this.sex = sex;
  }

  @Override
  public String toString() {
    return "RealNameReq{" +
        "birthday=" + birthday +
        ", certno='" + certno + '\'' +
        ", city='" + city + '\'' +
        ", cstId=" + cstId +
        ", cstName='" + cstName + '\'' +
        ", email='" + email + '\'' +
        ", province='" + province + '\'' +
        ", sex=" + sex +
        '}';
  }
}
