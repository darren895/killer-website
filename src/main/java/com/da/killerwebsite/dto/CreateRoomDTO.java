package com.da.killerwebsite.dto;

import lombok.Data;

import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table
public class CreateRoomDTO implements Serializable {

    private static final long serialVersionUID = -1699235193937316482L;
    private Long scriptId;

    private Boolean random;
}
