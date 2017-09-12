package com.example.wendy.androidlifecircle;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, ServiceConnection {

    private Button openButton;
    private Button actionButton;
    private TextView tw;
    private Button openServicebtn;
    private Button stopServicebtn;
    private Button bindServicebtn;
    private Button unbindServicebtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openButton = (Button) findViewById(R.id.openActivity);
        openButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,newActivity.class);

                i.putExtra("data","Hello world!");
                //startActivity(i);
                startActivityForResult(i,0);
            }
        });

        actionButton = (Button)findViewById(R.id.actionButton);
        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(newActivity.ACTION);
                startActivity(j);
            }
        });

        openServicebtn = (Button) findViewById(R.id.openService);
        stopServicebtn = (Button) findViewById(R.id.stopService);
        bindServicebtn = (Button) findViewById(R.id.bindService);
        unbindServicebtn = (Button) findViewById(R.id.unbindService);

        openServicebtn.setOnClickListener(this);
        stopServicebtn.setOnClickListener(this);
        bindServicebtn.setOnClickListener(this);
        unbindServicebtn.setOnClickListener(this);


    }


    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data ){
        super.onActivityResult(requestCode,resultCode,data);
        tw = (TextView) findViewById(R.id.textView);
        tw.setText(data.getStringExtra("backdata"));
    }


    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.openService:
                startService(new Intent(MainActivity.this,MyService.class));
                break;
            case R.id.stopService:
                stopService(new Intent(MainActivity.this,MyService.class));
                break;
            case R.id.bindService:
                bindService(new Intent(MainActivity.this,MyService.class),this,BIND_AUTO_CREATE);
                break;
            case R.id.unbindService:
                unbindService(this);
                break;
            default:
        }
    }

    @Override
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        System.out.println("service connected");
    }

    @Override
    public void onServiceDisconnected(ComponentName componentName) {
        System.out.println("service disconnected");
    }
}
