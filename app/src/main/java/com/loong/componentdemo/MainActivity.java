package com.loong.componentdemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.loong.componentdemo.arouterdemo.ArouterDmeoMainActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 跳登录界面
     *
     * @param view
     */
    public void login(View view) {
        ARouter.getInstance().build("/account/login").navigation();
    }

    /**
     * 跳分享界面
     *
     * @param view
     */
    public void share(View view) {
        ARouter.getInstance().build("/share/share").withString("share_content", "分享的数据数据").navigation();

    }

    /**
     * 跳 FragmentActivity
     *
     * @param view
     */
    public void fragment(View view) {
        startActivity(new Intent(this, FragmentActivity.class));
    }

    public void ArouterOne(View view) {
        // 应用内跳转
        ARouter.getInstance()
                .build("/testtest/one")
                //.withTransition() 带动画
                .navigation(this, 100);

//        ARouter.getInstance().
//                build("/share/share")
//                .withString("share_content", "分享数据到微博").navigation();



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        try {
            String result = data.getStringExtra("param_result");

            Log.i(TAG, "onActivityResult: result :" + result);

        }catch (Exception e){

        }


    }

    public void ArouterDemo(View view) {
        startActivity(new Intent(MainActivity.this, ArouterDmeoMainActivity.class));
    }
}
