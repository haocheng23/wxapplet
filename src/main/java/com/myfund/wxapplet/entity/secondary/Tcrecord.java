package com.myfund.wxapplet.entity.secondary;

import lombok.Data;

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
  private String created;
  private String updated;
  private String status;
  private String level;


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

  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public String getUpdated() {
    return updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  @Override
  public String toString() {
    return "Tcrecord{" +
            "id=" + id +
            ", fundcode='" + fundcode + '\'' +
            ", fundname='" + fundname + '\'' +
            ", reason='" + reason + '\'' +
            ", created='" + created + '\'' +
            ", updated='" + updated + '\'' +
            ", status='" + status + '\'' +
            ", level='" + level + '\'' +
            '}';
  }
}
