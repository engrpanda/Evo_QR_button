package com.evo.qrbutton;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("http://global-robotmp.orionstar.com/capi/v1/lot/webhook/ab411a02eef61d26308c1b223da87579/d41b10e55fc191b10e5e006136a8e2d1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("http://global-robotmp.orionstar.com/capi/v1/lot/webhook/b0864937ea7bb0e22479ca710b4098df/d41b10e55fc191b10e5e006136a8e2d1");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("http://global-robotmp.orionstar.com/capi/v1/lot/webhook/255f1b7b87d1135054803f7915084861/d41b10e55fc191b10e5e006136a8e2d1");
            }
        });
    }

    private void openLink(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}
