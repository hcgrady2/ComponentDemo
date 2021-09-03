package com.loong.componentdemo.arouterdemo.samples;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.loong.componentdemo.R;

/**
 * 使用Scheme跳转
 */
@Route(path = FiveActivity.PATH)
public class FiveActivity extends AppCompatActivity {

    public static final String PATH = "/test/fiveActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
    }
}
