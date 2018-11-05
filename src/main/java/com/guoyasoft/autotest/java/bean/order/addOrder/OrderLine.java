package com.guoyasoft.autotest.java.bean.order.addOrder;

public class OrderLine {
  private int qty;
  private String skuCode;

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public String getSkuCode() {
    return skuCode;
  }

  public void setSkuCode(String skuCode) {
    this.skuCode = skuCode;
  }

  @Override
  public String toString() {
    return "OrderLine{" +
        "qty=" + qty +
        ", skuCode='" + skuCode + '\'' +
        '}';
  }
}
