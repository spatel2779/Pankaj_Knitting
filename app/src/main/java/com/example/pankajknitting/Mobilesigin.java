package com.example.pankajknitting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mobilesigin extends AppCompatActivity {

    private Button otp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobilesigin);
    otp=findViewById(R.id.otpbtn);
    otp.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i =new Intent(Mobilesigin.this,Otpverify.class);
            startActivity(i);
        }
    });
    }
}