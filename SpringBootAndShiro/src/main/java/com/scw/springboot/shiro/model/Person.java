package com.scw.springboot.shiro.model;

/**
 * @author scw
 * @create 2018-01-03 10:33
 * @desc 对应数据库中的实体类
 **/
public class Person {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
