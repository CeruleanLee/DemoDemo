package com.lyt.demodemo.presenter;

import com.lyt.demodemo.bean.UserBean;
import com.lyt.demodemo.modle.UserModel;
import com.lyt.demodemo.view.IUserView;

/**
 * Created by Lee on 2017/2/21.
 * 说明：
 */
public class UserPresenter {

    //通过Presenter 通过接口与view和modle 交互
    UserModel iUserModle;
    IUserView iUserView;

    public  UserPresenter() {
    }

    public UserPresenter(IUserView view) {
        iUserView = view;
        iUserModle = new UserModel();
    }

    public void saveUser(String id,String name){
        iUserModle.setId(id);
        iUserModle.setName(name);


    }

    public void load(String id){
        UserBean userBean = iUserModle.load(id);
        iUserView.setName(userBean.getName());
        iUserView.setId(userBean.getId());

    }


}
