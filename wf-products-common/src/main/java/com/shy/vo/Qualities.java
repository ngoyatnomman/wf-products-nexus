package com.shy.vo;

import java.io.Serializable;

public class Qualities implements Serializable {

  private Integer id;
  private Integer sore;
  private String qualitydesc;
  private Integer productid;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getSore() {
    return sore;
  }

  public void setSore(Integer sore) {
    this.sore = sore;
  }


  public String getQualitydesc() {
    return qualitydesc;
  }

  public void setQualitydesc(String qualitydesc) {
    this.qualitydesc = qualitydesc;
  }


  public Integer getProductid() {
    return productid;
  }

  public void setProductid(Integer productid) {
    this.productid = productid;
  }

  @Override
  public String toString() {
    return "Qualities{" +
            "id=" + id +
            ", sore=" + sore +
            ", qualitydesc='" + qualitydesc + '\'' +
            ", productid=" + productid +
            '}';
  }
}
