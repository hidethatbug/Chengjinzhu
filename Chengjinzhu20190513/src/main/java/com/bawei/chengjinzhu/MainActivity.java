package com.bawei.chengjinzhu;

import com.bawei.chengjinzhu.base.BaseActivity;
import com.bawei.chengjinzhu.mvp.Qiyue;
/*作者:程金柱
 *时间:2019年5月13日09:20:27
 * 功能:主界面
 */
public class MainActivity extends BaseActivity implements Qiyue.QView {

//分支
    @Override
    public int BindView() {
        return R.layout.activity_main;
    }

    @Override
    public void FindId() {

    }

    @Override
    public void GetDatas() {

    }

    @Override
    public void BindLinter() {

    }
}
