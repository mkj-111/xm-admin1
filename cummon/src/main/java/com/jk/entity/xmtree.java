package com.jk.entity;

import lombok.Data;

import java.util.List;

@Data
public class xmtree {
    private Integer id;

    private String text;

    private String herf;

    private Integer pid;

    private Boolean selectable;

    private List<xmtree> nodes;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public String getHerf() {
        return herf;
    }

    public void setHerf(String herf) {
        this.herf = herf == null ? null : herf.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}