package com.bawei.chengjinzhu.http;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

/*作者:程金柱
 *时间:2019年5月13日09:20:27
 * 功能:网络工具包
 */
public class HttpUtiles {
    private HttpUtiles() {
    }
    private static HttpUtiles httpUtiles;
    public static synchronized HttpUtiles httpUtiles(){
        if (httpUtiles==null){
            httpUtiles=new HttpUtiles();
        }
        return httpUtiles;
    }
    //网络判断
    public boolean IsNet(Context context){
        ConnectivityManager manager= (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = manager.getActiveNetworkInfo();
        if (info!=null){
            return info.isAvailable();
        }
        return false;
    }
    //获取数据
    public String GetData(String path){
        try {
            URL url=new URL(path);
            HttpsURLConnection connection= (HttpsURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setReadTimeout(5000);
            connection.setConnectTimeout(5000);
            if (connection.getResponseCode()== HttpURLConnection.HTTP_OK){
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String s="";
                StringBuffer buffer=new StringBuffer();
                while ((s=bufferedReader.readLine())!=null){
                    buffer.append(s);
                }
                return buffer.toString();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public void My(String path, final LCallBack callBack){
        new AsyncTask<String, Integer, String>() {
            @Override
            protected String doInBackground(String... strings) {
                return GetData(strings[0]);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                callBack.GetDataH(s);
            }
        }.execute(path);
    }




}
