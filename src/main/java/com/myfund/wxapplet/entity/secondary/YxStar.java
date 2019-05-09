package com.myfund.wxapplet.entity.secondary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "yxstar")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class YxStar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String fundcode;

    private Integer level;


}
