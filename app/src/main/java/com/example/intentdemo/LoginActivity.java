package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.intentdemo.databinding.ActivityLoginBinding;

/**
 * @author cheng
 */
public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding mBinding;
    private static final String INTENT_TEXT1="intent_text1";
    private String text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        //普通的传值方法
        mBinding.ButtonLogin1.setOnClickListener(v -> {
            String user = mBinding.user.getText().toString();
            String pwd = mBinding.pwd.getText().toString();
            String isAdmin = mBinding.isAdmin.isChecked() ? "是" : "否";
            if ("".equals(user)|| "".equals(pwd)){
                Toast.makeText(LoginActivity.this,"请填写账号和密码",Toast.LENGTH_SHORT).show();
            }else {
                Intent intent = new Intent(LoginActivity.this,HomeActivity.class);
                intent.putExtra("user",user);
                intent.putExtra("pwd",pwd);
                intent.putExtra("isAdmin",isAdmin);
                startActivity(intent);
            }
        });

        mBinding.ButtonLogin2.setOnClickListener(v -> {
            String user = mBinding.user.getText().toString();
            String pwd = mBinding.pwd.getText().toString();
            String isAdmin = mBinding.isAdmin.isChecked() ? "是" : "否";
            if ("".equals(user)|| "".equals(pwd)){
                Toast.makeText(LoginActivity.this,"请填写账号和密码",Toast.LENGTH_SHORT).show();
            }else {
                Intent intent=PackageActivity.newIntent(LoginActivity.this,user,pwd,isAdmin);
                startActivity(intent);
            }
        });

        mBinding.ButtonLogin3.setOnClickListener(v -> {
            String user = mBinding.user.getText().toString();
            String pwd = mBinding.pwd.getText().toString();
            String isAdmin = mBinding.isAdmin.isChecked() ? "是" : "否";
            if ("".equals(user)|| "".equals(pwd)){
                Toast.makeText(LoginActivity.this,"请填写账号和密码",Toast.LENGTH_SHORT).show();
            }else {
                Intent intent = new Intent(LoginActivity.this,Return_valueActivity.class);
                intent.putExtra("user",user);
                intent.putExtra("pwd",pwd);
                intent.putExtra("isAdmin",isAdmin);
                startActivity(intent);
            }

            initIntent();
        });
    }



    public static Intent newIntent(Activity activity, String te){
        Intent intent=new Intent(activity,LoginActivity.class);

        intent.putExtra(INTENT_TEXT1,te);

        return intent;

    }
    private void initIntent(){
        text1=getIntent().getStringExtra(INTENT_TEXT1);
        Toast.makeText(this,text1,Toast.LENGTH_LONG).show();
    }
}