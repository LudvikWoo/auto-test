package com.guoyasoft.autotest.java.bean.order.addOrder;

import java.util.List;

public class AddOrderReq {

  private int ordeerPrice;
  private List<OrderLine> orderLineList;
  private String receiver;
  private String receiverPhone;
  private String receivingAddress;
  private String userName;

  public int getOrdeerPrice() {
    return ordeerPrice;
  }

  public void setOrdeerPrice(int ordeerPrice) {
    this.ordeerPrice = ordeerPrice;
  }

  public List<OrderLine> getOrderLineList() {
    return orderLineList;
  }

  public void setOrderLineList(
      List<OrderLine> orderLineList) {
    this.orderLineList = orderLineList;
  }

  public String getReceiver() {
    return receiver;
  }

  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }

  public String getReceiverPhone() {
    return receiverPhone;
  }

  public void setReceiverPhone(String receiverPhone) {
    this.receiverPhone = receiverPhone;
  }

  public String getReceivingAddress() {
    return receivingAddress;
  }

  public void setReceivingAddress(String receivingAddress) {
    this.receivingAddress = receivingAddress;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  @Override
  public String toString() {
    return "AddOrderReq{" +
        "ordeerPrice=" + ordeerPrice +
        ", orderLineList=" + orderLineList +
        ", receiver='" + receiver + '\'' +
        ", receiverPhone='" + receiverPhone + '\'' +
        ", receivingAddress='" + receivingAddress + '\'' +
        ", userName='" + userName + '\'' +
        '}';
  }

}
