package com.myfund.wxapplet.entity.secondary;

import javax.persistence.*;

@Entity
@Table(name = "zxlist")
public class ZxList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String fundcode;

    @Column
    private String fundname;


    @Column
    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "ZxList{" +
                "id=" + id +
                ", fundcode='" + fundcode + '\'' +
                ", fundname='" + fundname + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
