package com.example.ramanvir.paychektracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Proceed = (Button) findViewById(R.id.proceed);
        Proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent multintent1 = new Intent(MainActivity.this, layout2.class);
                startActivity(multintent1);
            }
        });



    }
}
