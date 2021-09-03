package com.loong.componentdemo.arouterdemo.samples;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.loong.componentdemo.R;

@Route(path = ThreeActivity.PATH)
public class ThreeActivity extends AppCompatActivity {

    public static final String PATH = "/test/threeActivity";
    public static final String PARAM_RESULT = "param_result";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        Intent intent = getIntent();
        //setResult
        intent.putExtra(PARAM_RESULT,"这是返回携带的参数");
        setResult(RESULT_OK,intent);
    }
}
