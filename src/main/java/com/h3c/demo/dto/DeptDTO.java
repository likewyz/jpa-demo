package com.h3c.demo.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class DeptDTO implements Serializable {

    private static final long serialVersionUID = 2L;

    private Long parentId;

    private String deptName;

    public DeptDTO(Long parentId, String deptName) {
        this.parentId = parentId;
        this.deptName = deptName;
    }
}
