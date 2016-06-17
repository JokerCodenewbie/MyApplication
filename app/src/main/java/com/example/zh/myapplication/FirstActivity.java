package com.example.zh.myapplication;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by ZH on 2016/6/15.
 */
public class FirstActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d("singleTask-First",this.toString());
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.firstactivity);
        Button button_1 = (Button)findViewById(R.id.button);
        //Button button_2 = (Button)findViewById(R.id.button2);
        button_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                SecondActivity.actionStart(FirstActivity.this,"data1","data2");
                /*Intent intent = new Intent("com.example.zh.myapplication.ACTION_START");
                intent.addCategory("com.example.zh.myapplication.MY_CATEGORY");
                startActivity(intent);*/
                //String data = "Hello SecondActivity";
                //Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                //intent.putExtra("extra_data",data);
                //startActivityForResult(intent,1);
                //startActivity(intent);
            }
        });
        /*button_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });*/
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("singleTask-First","onRestart");
    }

}
