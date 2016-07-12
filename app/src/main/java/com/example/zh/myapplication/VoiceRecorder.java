package com.example.zh.myapplication;

import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

/**
 * Created by ZH on 7/12/16.
 */
public class VoiceRecorder extends AppCompatActivity implements View.OnClickListener {

    private Button mButtonStart;
    private Button mButtonStop;
    private MediaRecorder recorder;
    private final String FilePath = "/test.3gp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.voicerecorder_layout);

        mButtonStart= (Button) findViewById(R.id.button_start);
        mButtonStop= (Button) findViewById(R.id.button_stop);
        mButtonStop.setOnClickListener(this);
        mButtonStart.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_start:
                recorder=new MediaRecorder();
                recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
                recorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
                recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
                recorder.setOutputFile(Environment.getExternalStorageDirectory() + FilePath);

                try {
                    recorder.prepare();
                    recorder.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.button_stop:
                recorder.stop();
                recorder.reset();
                recorder.release();
                break;

            default:break;
        }
    }
}
