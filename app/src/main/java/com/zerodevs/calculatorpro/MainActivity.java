package com.zerodevs.calculatorpro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zerodevs.calculatorpro.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

        ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //on click listeners (numbers)
        binding.butn1.setOnClickListener(v ->  binding.output.setText(binding.output.toString().concat(String.valueOf(1))) );
        binding.butn2.setOnClickListener(v -> setOutput(2));
        binding.butn3.setOnClickListener(v -> setOutput(3));
        binding.butn4.setOnClickListener(v -> setOutput(4));
        binding.butn5.setOnClickListener(v -> setOutput(5));
        binding.butn6.setOnClickListener(v -> setOutput(6));
        binding.butn7.setOnClickListener(v -> setOutput(7));
        binding.butn8.setOnClickListener(v -> setOutput(8));
        binding.butn9.setOnClickListener(v -> setOutput(9));
        binding.butn0.setOnClickListener(v -> setOutput(0));
    }

    public void setOutput(int input) {
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());

            binding.output.setText(binding.output.toString().concat(String.valueOf(input)));


    }
}