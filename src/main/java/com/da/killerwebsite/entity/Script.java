package com.da.killerwebsite.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "t_script")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Script implements Serializable {

    private static final long serialVersionUID = -3061015092439583379L;
    @Id
    private Integer id;

    private String name;

    private Integer userNum;

    private String comment;

    private Date crtTime;
}
