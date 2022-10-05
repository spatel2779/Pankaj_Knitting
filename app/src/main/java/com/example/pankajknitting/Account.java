package com.example.pankajknitting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.pankajknitting.databinding.ActivityAccountBinding;

import java.util.Objects;

public class Account extends AppCompatActivity {
ActivityAccountBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAccountBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Objects.requireNonNull(getSupportActionBar()).hide();
    }
}