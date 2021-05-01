package com.demo.controller.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.magician.web.core.annotation.Verification;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DemoVO {

    private int id;

    @Verification(notNull = true, msg = "name不可以为空", apis = "/*/demo")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
