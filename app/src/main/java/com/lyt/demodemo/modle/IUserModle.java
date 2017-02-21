package com.lyt.demodemo.modle;

import com.lyt.demodemo.bean.UserBean;

/**
 * Created by Lee on 2017/2/21.
 * 说明：
 */
public interface IUserModle {
    //对id 和name 读写操作 并且存储在某个载体里（内存 文件 数据库 服务器）
    void setId(String id);
    void setName(String name);
    String getId();
    UserBean load(String id);//通过id获得一个user
}
