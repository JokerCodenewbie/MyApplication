package com.example.zh.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by ZH on 2016/6/15.
 */
public class ThirdActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.thirdactivity);
    }
}
