package com.example.aroutermodule;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;


@Route(path = "/testtest/one")
public class ArouterOneActivity extends AppCompatActivity {

    public static final String PARAM_RESULT = "param_result";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_one);

        Intent intent = getIntent();
        //setResult
        intent.putExtra(PARAM_RESULT,"这是返回携带的参数");
        setResult(RESULT_OK,intent);


    }
}
