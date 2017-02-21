package com.lyt.demodemo.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.lyt.demodemo.R;
import com.lyt.demodemo.presenter.UserPresenter;

public class UserActivity extends AppCompatActivity implements IUserView, View.OnClickListener {
UserPresenter mpresenter;
    EditText idet;
    EditText nameet;
    Button save,load;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mpresenter=new UserPresenter();
        setContentView(R.layout.activity_user);
//        findViewById(R.id.id).setOnClickListener(this);
//        findViewById(R.id.name).setOnClickListener(this);

        idet = (EditText)findViewById(R.id.id);
        nameet = (EditText) findViewById(R.id.name);
        save = (Button) findViewById(R.id.save);
        load = (Button) findViewById(R.id.load);

        findViewById(R.id.save).setOnClickListener(this);
        findViewById(R.id.load).setOnClickListener(this);
    }

    @Override
    public String getID() {
        return idet.getText().toString();
    }

    @Override
    public String getName() {
        return nameet.getText().toString();
    }

    @Override
    public void setId(String id) {
idet.setText(id);
    }

    @Override
    public void setName(String name) {
nameet.setText(name);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
//            case R.id.id:
//
//
//                break;
//            case R.id.name:
//
//
//                break;
            case R.id.save:

mpresenter.saveUser(getID(),getName());
                break;
            case R.id.load:
mpresenter.load(getID());

                break;

        }
    }
}
