package com.bawei.chengjinzhu.mvp;

import com.bawei.chengjinzhu.http.HttpUtiles;
import com.bawei.chengjinzhu.http.LCallBack;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/*作者:程金柱
 *时间:2019年5月13日09:20:27
 * 功能:Model的实现类
 */
public class QModelImpl implements Qiyue.QModol {
    @Override
    public void GetData(final String m) {
        HttpUtiles.httpUtiles().My("https://code.aliyun.com/598254259/FristProject/raw/master/bw_list.txt", new LCallBack() {
            @Override
            public void GetDataH(String s) {
                try {
                    JSONObject jsonObject = new JSONObject(s);
                    JSONArray items = jsonObject.getJSONArray("items");
                    for (int i = 0; i < items.length(); i++) {
                        JSONObject jsonObject1= (JSONObject) items.get(i);
                        String title = jsonObject1.getString("title");
                        String desc = jsonObject1.getString("desc");
                        String image = jsonObject1.getString("image");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });

    }
}
