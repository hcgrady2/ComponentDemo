package com.loong.componentdemo.arouterdemo.samples;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.loong.componentdemo.R;


@Route(path = ForeActivity.PATH)
public class ForeActivity extends AppCompatActivity {
    public static final String PATH = "/test/foreActivity";

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fore);

        webView = findViewById(R.id.webView);
        //加载 assets 目录下的 HTML 文件
        webView.loadUrl("file:///android_asset/scheme-test.html");
    }
}
