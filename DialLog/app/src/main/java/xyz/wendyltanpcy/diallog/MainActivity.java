package xyz.wendyltanpcy.diallog;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button dial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dial = (Button) findViewById(R.id.dial);
        dial.setOnClickListener(new View.OnClickListener() {
            @Override
//            *#*#2846579#*#*
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:"+Uri.encode("*#*#2846579#*#*")));

                startActivity(i);
            }
        });
    }
}
