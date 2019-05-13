package com.bawei.chengjinzhu.http;

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

}
