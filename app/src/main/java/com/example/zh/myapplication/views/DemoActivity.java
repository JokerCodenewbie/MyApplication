package com.example.zh.myapplication.views;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.zh.myapplication.FirstActivity;
import com.example.zh.myapplication.R;
import com.example.zh.myapplication.adapters.DemoAdapter;
import com.example.zh.myapplication.models.Demo;
import com.example.zh.myapplication.models.Fruit;
import com.example.zh.myapplication.utils.VoiceRecorder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZH on 2016/8/3.
 */
public class DemoActivity extends AppCompatActivity {
    private List<Demo> demoList = new ArrayList<Demo>();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        initDemos();
        DemoAdapter demoAdapter = new DemoAdapter(DemoActivity.this,R.layout.item_demo,demoList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        if(listView !=null){
            listView.setAdapter(demoAdapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {
                    Demo demo = demoList.get(position);
                    Intent intent = new Intent(DemoActivity.this,demo.getDemoClass());
                    startActivity(intent);
                }
            });
        }

    }

    private void initDemos() {
        Demo androidVoice = new Demo(VoiceRecorderActivity.class);
        androidVoice.setDemoName("AndroidVoiceRecorder");
        androidVoice.setDemoDescription("语音功能，测试android系统自带的录音功能demo");
        demoList.add(androidVoice);

        Demo main = new Demo(MainActivity.class);
        main.setDemoDescription("第一行代码书本样例");
        main.setDemoName("First Code");
        demoList.add(main);

    }
}
