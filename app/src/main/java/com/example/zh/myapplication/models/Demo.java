package com.example.zh.myapplication.models;

import android.app.Activity;
import android.content.Context;

/**
 * Created by ZH on 2016/8/3.
 */
public class Demo {
    private String demoName;
    private String demoDescription;

    public Class<? extends Activity> getDemoClass() {
        return demoClass;
    }

    private Class<? extends android.app.Activity> demoClass;

    public Demo(Class<? extends android.app.Activity> demoClass){
        this.demoClass = demoClass;
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
