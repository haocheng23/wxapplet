package com.myfund.wxapplet.entity.secondary;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tcrecord {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String fundcode;
  private String fundname;
  private String reason;
  private java.sql.Timestamp created;
  private java.sql.Timestamp updated;
  private String status;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getFundcode() {
    return fundcode;
  }

  public void setFundcode(String fundcode) {
    this.fundcode = fundcode;
  }


  public String getFundname() {
    return fundname;
  }

  public void setFundname(String fundname) {
    this.fundname = fundname;
  }


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  public java.sql.Timestamp getCreated() {
    return created;
  }

  public void setCreated(java.sql.Timestamp created) {
    this.created = created;
  }


  public java.sql.Timestamp getUpdated() {
    return updated;
  }

  public void setUpdated(java.sql.Timestamp updated) {
    this.updated = updated;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "Tcrecord{" +
            "id=" + id +
            ", fundcode='" + fundcode + '\'' +
            ", fundname='" + fundname + '\'' +
            ", reason='" + reason + '\'' +
            ", created=" + created +
            ", updated=" + updated +
            ", status='" + status + '\'' +
            '}';
  }
}
