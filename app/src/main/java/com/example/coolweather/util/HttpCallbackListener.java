package com.example.coolweather.util;

/**
 * Created by 赖上罗小贱 on 2016/2/2.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
