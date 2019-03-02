package com.example.menga.ubervoicereca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                riderActivity();
            }
        });
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                driverActivity();
            }
        });
    }
    public void riderActivity(){
        Intent intent = new Intent(this, rider.class);
        startActivity(intent);
    }
    public void driverActivity(){
        Intent intent = new Intent(this,driver.class);
        startActivity(intent);
    }
}
