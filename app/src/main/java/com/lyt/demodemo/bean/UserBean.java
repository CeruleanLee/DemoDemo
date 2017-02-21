package com.lyt.demodemo.bean;

/**
 * Created by Lee on 2017/2/21.
 * 说明：
 */
public class UserBean {
String name;
    String id;

    public UserBean(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
