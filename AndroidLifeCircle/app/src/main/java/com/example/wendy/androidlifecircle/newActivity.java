package com.example.wendy.androidlifecircle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class newActivity extends AppCompatActivity {


    private TextView tw;
    private EditText et;
    private Button sb;
    public static final String ACTION = "com.example.wendy.androidlifecircle.newAty";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Intent i = getIntent();
        tw = (TextView) findViewById(R.id.dataText);
        tw.setText(i.getStringExtra("data"));

        sb = (Button) findViewById(R.id.sendButton);
        et = (EditText) findViewById(R.id.newEdittext);
        sb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent j = new Intent();
                j.putExtra("backdata",et.getText().toString());
                setResult(1,j);
                finish();
            }
        });


    }
}
