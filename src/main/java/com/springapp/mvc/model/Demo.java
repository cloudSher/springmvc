package com.springapp.mvc.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Administrator on 2016/8/22.
 */
public class Demo {


    @NotNull( message = "id is not null")
    private String id;
    @NotNull (message = "name is not null")
    @Size(min = 0,max = 3)
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
