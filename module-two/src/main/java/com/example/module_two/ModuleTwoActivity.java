package com.example.module_two;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;

@Route(path = ModuleTwoActivity.PATH)
public class ModuleTwoActivity extends AppCompatActivity {

    public static final String PATH = "/module2/module-two";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module_two_activity_two_module);
    }
}
