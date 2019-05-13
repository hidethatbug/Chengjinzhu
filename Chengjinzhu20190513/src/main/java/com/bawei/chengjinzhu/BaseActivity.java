package com.bawei.chengjinzhu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(BindView());
        FindId();
        GetDatas();
        BindLinter();
    }


    public abstract int BindView();

    public abstract void FindId();

    public abstract void GetDatas();

    public abstract void BindLinter();

}
