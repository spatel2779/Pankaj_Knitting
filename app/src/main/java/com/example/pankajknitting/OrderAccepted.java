package com.example.pankajknitting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.pankajknitting.databinding.ActivityOrderAcceptedBinding;

public class OrderAccepted extends AppCompatActivity {
    ActivityOrderAcceptedBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderAcceptedBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

    }
}