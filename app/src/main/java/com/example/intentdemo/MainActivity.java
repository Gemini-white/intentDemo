package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
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

        mBinding.ButtonToMain.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,HelloActivity.class);
            startActivity(intent);
        });

        mBinding.ButtonToBaidu.setOnClickListener(v -> {
            //设置意图
            Intent intent = new Intent(Intent.ACTION_VIEW);
            //意图的目的地(将一个字符串转化为URI地址对象)
            Uri uri = Uri.parse("https://www.baidu.com/");
            //将网址URI地址对象设置到意图上
            intent.setData(uri);
            startActivity(intent);
        });

        mBinding.ButtonToBing.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            //将输入的文字转换出来
            String i= mBinding.editKey.getText().toString();
            //意图的目的地(将一个字符串转化为URI地址对象)
            intent.setData(Uri.parse("https://cn.bing.com/search?q="+i));
            startActivity(intent);
        });
    }
}