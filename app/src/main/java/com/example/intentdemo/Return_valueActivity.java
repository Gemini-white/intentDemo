package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.intentdemo.databinding.ActivityReturnValueBinding;

public class Return_valueActivity extends AppCompatActivity {

    private ActivityReturnValueBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding= ActivityReturnValueBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        Intent intent = getIntent();
        //获取传过来的数据
        String user = "账号："+intent.getStringExtra("user");
        String pwd = "密码："+intent.getStringExtra("pwd");
        String isAdmin = "是否为管理员："+intent.getStringExtra("isAdmin");
        //将数据显示到界面上
        mBinding.userText2.setText(user);
        mBinding.pwdText2.setText(pwd);
        mBinding.isAdminText2.setText(isAdmin);

        mBinding.buttonOk.setOnClickListener(v -> {
            String R = mBinding.ReturnValue.getText().toString();
            Intent intent1=LoginActivity.newIntent(Return_valueActivity.this,R);
            startActivity(intent1);
        });
    }
}