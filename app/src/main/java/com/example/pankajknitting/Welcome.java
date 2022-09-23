package com.example.pankajknitting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class Welcome extends AppCompatActivity {
private Button wlcbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        getSupportActionBar().hide();
        wlcbtn= findViewById(R.id.wlcbtn);

    }
}