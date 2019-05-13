package com.bawei.chengjinzhu.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


/*作者:程金柱
 *时间:2019年5月13日09:20:27
 * 功能:基类的抽取
 */
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
