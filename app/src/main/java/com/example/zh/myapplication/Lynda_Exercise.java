package com.example.zh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.support.design.widget.Snackbar;
import android.widget.TextView;
import android.widget.Toast;

public class Lynda_Exercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lynda__exercise);

        /*Button button = (Button) findViewById(R.id.buttoncollect);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText et = (EditText) findViewById(R.id.edit1);
                String value = et.getText().toString();

                Snackbar.make(view, "You entered: " + value, Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }

        });*/

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            builder.append(getString(R.string.longtext) + "\n\n");
        }
        TextView tv = (TextView) findViewById(R.id.scrolltext);
        tv.setText(builder.toString());

    }

    public void another(View view) {
        Toast.makeText(Lynda_Exercise.this, "Handle View in layout file.", Toast.LENGTH_SHORT).show();
    }
}
