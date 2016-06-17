package com.example.zh.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

/**
 * Created by ZH on 2016/6/17.
 */
public class ThirdChapter_3_2 extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdchapter_3_2);
        button = (Button)findViewById(R.id.button_edit_text);
        editText = (EditText)findViewById(R.id.edit_text);
        imageView = (ImageView)findViewById(R.id.imageView);
        progressBar = (ProgressBar)findViewById(R.id.progressbar);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button_edit_text:
                /*String text = editText.getText().toString();
                Toast.makeText(ThirdChapter_3_2.this,text,Toast.LENGTH_SHORT).show();*/
                if (progressBar.getVisibility() == View.GONE) {
                    progressBar.setVisibility(View.VISIBLE);
                } else {
                    progressBar.setVisibility(View.GONE);
                }
                break;
            default:
                break;
        }
    }
}
