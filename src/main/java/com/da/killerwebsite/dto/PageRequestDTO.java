package com.da.killerwebsite.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class PageRequestDTO implements Serializable {

    private static final long serialVersionUID = 1224580892336339518L;
    @NotNull
    private Integer page;

    @NotNull
    private Integer pageSize;
}
