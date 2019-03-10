package com.example.menga.ubervoicereca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class driver extends AppCompatActivity {
private String password;
private String input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver);

        Bundle bundle = getIntent().getExtras();
        password = bundle.getString("password");
        System.out.println(password);


        EditText txtIn = findViewById(R.id.editText2);
        input = txtIn.getText().toString();

        Button btn = (Button) findViewById(R.id.button5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkCondition();
            }
        });
    }

    public void checkCondition(){
        EditText txtIn = findViewById(R.id.editText2);
        input = txtIn.getText().toString();
        Intent intent = new Intent(this, condition.class);
        System.out.println("input:"+input+"password:"+password);
        if(input.equals(password)){
            intent.putExtra("condition","Success");
            startActivity(intent);
        }
        else{
            intent.putExtra("condition","Failure");
            startActivity(intent);
        }
    }
}
