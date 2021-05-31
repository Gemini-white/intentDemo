package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.intentdemo.databinding.ActivityMainBinding;

/**
 * @author 韩志城
 */
public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
    }
}