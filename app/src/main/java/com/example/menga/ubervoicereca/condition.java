package com.example.menga.ubervoicereca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class condition extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condition);

        Bundle bundle = getIntent().getExtras();
        String finalCond = (String) bundle.get("condition");

        TextView view = (TextView) findViewById(R.id.textView8);
        view.setText(finalCond);

    }
}
