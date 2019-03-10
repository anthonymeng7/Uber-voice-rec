package com.example.menga.ubervoicereca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer;
import com.uber.sdk.android.core.UberSdk;
import com.uber.sdk.android.rides.RideRequestButton;
import com.uber.sdk.rides.client.ServerTokenSession;
import com.uber.sdk.rides.client.SessionConfiguration;

import org.w3c.dom.Text;

public class rider extends AppCompatActivity {
    private EditText password;
    private Button btnSubmit;
    private EditText address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rider);

        SessionConfiguration config = new SessionConfiguration.Builder()
                // mandatory
                .setClientId("XwHDjIS7HjdxqYqxnEiouw7LHgIuVFMG")
                // required for enhanced button features
                .setServerToken("veXKsHW3d4jx_MmqPrAhIpsKAxZk0S2mP22TCF8X")
                // required for implicit grant authentication
                .setRedirectUri("https://hacktech-uber-password.herokuapp.com/")
                // optional: set sandbox as operating environment
                .setEnvironment(SessionConfiguration.Environment.SANDBOX)
                .build();
        UberSdk.initialize(config);
        addListenerOnButton();

        RideRequestButton requestButton = new RideRequestButton(getApplicationContext());
        RelativeLayout layout = (RelativeLayout) getLayoutInflater().inflate(R.layout.activity_rider,null);
        layout.addView(requestButton);

    }
    public void addListenerOnButton(){
        password = (EditText) findViewById(R.id.editText);
        address = (EditText) findViewById(R.id.addressInput);
        btnSubmit = (Button) findViewById(R.id.button3);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchPass();
            }
        });
    }
    public String getPassword(){
        return password.getText().toString();
    }
    public void switchPass(){
        Intent intent = new Intent(this, pass.class);
        intent.putExtra("password", getPassword());
        startActivity(intent);
    }
}
