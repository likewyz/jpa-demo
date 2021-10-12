package com.h3c.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "t_dept")
public class Dept implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "DEPT_ID")
    private Long deptId;

    @Column(name = "PARENT_ID")
    private Long parentId;

    @Column(name = "DEPT_NAME")
    private String deptName;

    @Column(name = "ORDER_NUM")
    private Double orderNum;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "MODIFY_TIME")
    private Date modifyTime;

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Double getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Double orderNum) {
        this.orderNum = orderNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}
