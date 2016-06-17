package com.example.zh.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import java.net.Inet4Address;

/**
 * Created by ZH on 2016/6/15.
 */
public class SecondActivity extends Activity {
    public static void actionStart(Context context,String data1,String data2){
        Intent intent = new Intent(context,SecondActivity.class);
        intent.putExtra("param1",data1);
        intent.putExtra("param2",data2);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d("singleTask-Second",this.toString());
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.secondactivity);
        Intent intent = getIntent();
        String data = intent.getStringExtra("param1");
        Log.d("SecondActivity",data);

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(SecondActivity.this,FirstActivity.class);
                startActivity(intent);
                //intent.putExtra("data_return","Hello FirstActivity");
                //setResult(RESULT_OK,intent);
                //finish();
            }
        });
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("singleTask-Second","onDestroy");
    }
}
