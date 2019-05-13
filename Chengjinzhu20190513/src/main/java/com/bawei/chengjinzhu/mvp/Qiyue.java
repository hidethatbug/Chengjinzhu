package com.bawei.chengjinzhu.mvp;
/*作者:程金柱
*时间:2019年5月13日09:20:27
* 功能:契约类
 */
public interface Qiyue {
    //M层
    public interface QModol{
        void GetData(String s);

    }
    //V层
    public interface QView{

    }
    //P层
    public interface QPresenter{
        public void Screen(QView qView);
        public void Fail();


    }
}
