package com.example.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by pc on 2017/8/31.
 */

public class HttpUtil {

    // 发送Http请求，与服务器进行交互 在回调中处理服务器响应
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();

        // 执行
        client.newCall(request).enqueue(callback);
    }
}
