package com.example.zh.myapplication.models;

import android.app.Activity;
import android.content.Context;

/**
 * Created by ZH on 2016/8/3.
 */
public class Demo {
    private Object demoActivity;
    private String demoName;
    private String demoDescription;

    public Demo(Object activity){
        demoActivity = activity;
    }

    public Object getDemoActivity() {
        return demoActivity;
    }

    public void setDemoActivity(Object demoActivity) {
        this.demoActivity = demoActivity;
    }

    public String getDemoName() {
        return demoName;
    }

    public void setDemoName(String demoName) {
        this.demoName = demoName;
    }

    public String getDemoDescription() {
        return demoDescription;
    }

    public void setDemoDescription(String demoDescription) {
        this.demoDescription = demoDescription;
    }
}
