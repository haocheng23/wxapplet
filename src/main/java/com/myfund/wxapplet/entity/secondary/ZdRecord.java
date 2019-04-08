package com.myfund.wxapplet.entity.secondary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zdrecord")
public class ZdRecord {
    @Id
    private String id;
    @Column
    private String username;
    @Column
    private String fundcode;
    @Column
    private String fundname;
    @Column
    private String zddate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getZddate() {
        return zddate;
    }

    public void setZddate(String zddate) {
        this.zddate = zddate;
    }


    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", fundcode='" + fundcode + '\'' +
                ", fundname='" + fundname + '\'' +
                ", zddate='" + zddate + '\'' +
                '}';
    }
}
