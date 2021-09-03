package com.loong.componentdemo.arouterdemo.samples;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.loong.componentdemo.R;

@Route(path = FirstActivity.PATH)
public class FirstActivity extends AppCompatActivity {

    public static final String PATH = "/test/firstActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }
}
