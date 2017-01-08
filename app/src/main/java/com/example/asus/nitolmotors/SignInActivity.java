package com.example.asus.nitolmotors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        TextView textViewLogIn=(TextView)findViewById(R.id.textView_log_in);
        textViewLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentNextPrimaryInformation= new Intent(getApplicationContext(),PrimaryInformationActivity.class);
                startActivity(intentNextPrimaryInformation);
            }
        });
    }
}
