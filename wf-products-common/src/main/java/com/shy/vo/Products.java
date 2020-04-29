package com.shy.vo;

import java.io.Serializable;

public class Products implements Serializable {

  private Integer id;
  private String productname;
  private String productString;
  private Integer productsum;
  private String productdesc;
  private double productprice;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getProductname() {
    return productname;
  }

  public void setProductname(String productname) {
    this.productname = productname;
  }


  public String getProductString() {
    return productString;
  }

  public void setProductString(String productString) {
    this.productString = productString;
  }


  public Integer getProductsum() {
    return productsum;
  }

  public void setProductsum(Integer productsum) {
    this.productsum = productsum;
  }


  public String getProductdesc() {
    return productdesc;
  }

  public void setProductdesc(String productdesc) {
    this.productdesc = productdesc;
  }


  public double getProductprice() {
    return productprice;
  }

  public void setProductprice(double productprice) {
    this.productprice = productprice;
  }

  @Override
  public String toString() {
    return "Products{" +
            "id=" + id +
            ", productname='" + productname + '\'' +
            ", productString='" + productString + '\'' +
            ", productsum=" + productsum +
            ", productdesc='" + productdesc + '\'' +
            ", productprice=" + productprice +
            '}';
  }
}
