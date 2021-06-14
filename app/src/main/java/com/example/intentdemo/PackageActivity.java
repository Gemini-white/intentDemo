package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.intentdemo.databinding.ActivityPackageBinding;

public class PackageActivity extends AppCompatActivity {

    private ActivityPackageBinding mBinding;
    private static final String INTENT_TEXT1="intent_text1";
    private static final String INTENT_TEXT2="intent_text2";
    private static final String INTENT_TEXT3="intent_text3";
    private String text1,text2,text3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityPackageBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        initIntent();
        initView();
    }
    public static Intent newIntent(Activity activity,String te, String te2,String te3){
        Intent intent=new Intent(activity,PackageActivity.class);

        intent.putExtra(INTENT_TEXT1,te);

        intent.putExtra(INTENT_TEXT2,te2);

        intent.putExtra(INTENT_TEXT3,te3);

        return intent;

    }
    private void initIntent(){
        text1="账号："+getIntent().getStringExtra(INTENT_TEXT1);
        text2="密码："+getIntent().getStringExtra(INTENT_TEXT2);
        text3="是否为管理员："+getIntent().getStringExtra(INTENT_TEXT3);
    }
    private void initView() {
        mBinding.userText1.setText(text1);
        mBinding.pwdText1.setText(text2);
        mBinding.isAdminText1.setText(text3);
    }
}