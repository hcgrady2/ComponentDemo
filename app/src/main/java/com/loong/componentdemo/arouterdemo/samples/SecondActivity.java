package com.loong.componentdemo.arouterdemo.samples;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.loong.componentdemo.R;

@Route(path = SecondActivity.PATH)
public class SecondActivity extends AppCompatActivity {

    public static final String PATH = "/test/secondActivity";
    public static final String PARAM = "param";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        if (intent!=null){
            String param = intent.getStringExtra(PARAM);
            Toast.makeText(this, param, Toast.LENGTH_SHORT).show();
        }
    }
}
