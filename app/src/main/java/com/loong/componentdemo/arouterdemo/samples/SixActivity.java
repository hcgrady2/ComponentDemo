package com.loong.componentdemo.arouterdemo.samples;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.loong.componentdemo.R;
import com.loong.componentdemo.arouterdemo.bean.ScoreBean;


@Route(path = SixActivity.PATH)
public class SixActivity extends AppCompatActivity {
    public static final String PATH = "/test/sixActivity";
    @Autowired
    public String name;
    @Autowired
    public int age;
    @Autowired
    //如果要在Uri中传递自定义对象，在参数中要使用json字符串(encodeURI转码)传递，创建一个实现了SerializationService接口的类完成json的解析
    public ScoreBean score;
    TextView tvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);

        tvData = findViewById(R.id.tvData);

        //参数自动依赖注入
        ARouter.getInstance().inject(this);
        String info = "name=" + name + ",age=" + age + ",score=" + score;
        tvData.setText(info);
        Log.i("SixActivity", info);
    }
}
