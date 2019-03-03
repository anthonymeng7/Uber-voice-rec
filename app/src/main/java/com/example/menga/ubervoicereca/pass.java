package com.example.menga.ubervoicereca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass);

        Bundle bundle = getIntent().getExtras();
        String password = bundle.getString("password");

        TextView thePass = findViewById(R.id.textView7);
        thePass.setText(password);

        Button home = (Button) findViewById(R.id.button4);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnHome();
            }
        });
    }
    public void returnHome(){
        Intent intent = new Intent(this, MainActivity.class);
        Bundle bundle = getIntent().getExtras();
        String password = bundle.getString("password");
        intent.putExtra("password",password);
        startActivity(intent);
    }
}
