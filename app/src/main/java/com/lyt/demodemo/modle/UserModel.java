package com.lyt.demodemo.modle;

import android.util.SparseArray;

import com.lyt.demodemo.bean.UserBean;

/**
 * Created by Lee on 2017/2/22.
 * 说明：
 */
public class UserModel implements IUserModle {
    String id,name;
    SparseArray<UserBean> ayyayBean=new SparseArray<UserBean>();
    @Override
    public void setId(String id) {
        this.id=id;
    }

    @Override
    public void setName(String name) {
this.name=name;
        UserBean bean=new UserBean(id,name);

ayyayBean.append(Integer.parseInt(id),bean);
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public UserBean load(String id) {
        this.id=id;
        UserBean userBean = ayyayBean.get(Integer.parseInt(id), new UserBean("not found", "not found"));


        return userBean;
    }
}
