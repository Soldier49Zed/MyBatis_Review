package com.houx.pojo;

import java.io.Serializable;

/**
 * @Author: HouX
 * @Date: 2020/11/8
 * @Description:
 */
public class Role implements Serializable {

    public static final long serialVersionUID = 598736524547906734L;

    private long id;
    private String roleName;
    private String note;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
