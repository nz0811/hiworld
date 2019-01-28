package com.niu.bean;

/**
 * Created by Administrator on 2019/1/27.
 */
public class TestBean {

    private String id;
    private String name;

    public TestBean() {
    }

    public TestBean(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

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
}
