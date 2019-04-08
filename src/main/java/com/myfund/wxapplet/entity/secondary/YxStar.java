package com.myfund.wxapplet.entity.secondary;

import javax.persistence.*;

@Entity
@Table(name = "yxstar")
public class YxStar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String fundcode;


    public YxStar() {
    }

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


    @Override
    public String toString() {
        return "YxStar{" +
                "id=" + id +
                ", fundcode='" + fundcode + '\'' +
                '}';
    }
}
