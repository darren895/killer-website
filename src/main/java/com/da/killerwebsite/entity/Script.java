package com.da.killerwebsite.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "t_script")
public class Script {

    @Id
    private Integer id;

    private String name;

    private Integer userNum;

    private String comment;

    private Date crtTime;
}
