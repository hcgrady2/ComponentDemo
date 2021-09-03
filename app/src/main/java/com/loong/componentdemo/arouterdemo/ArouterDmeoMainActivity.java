package com.loong.componentdemo.arouterdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;
import com.loong.componentdemo.R;
import com.loong.componentdemo.arouterdemo.samples.FirstActivity;
import com.loong.componentdemo.arouterdemo.samples.ForeActivity;
import com.loong.componentdemo.arouterdemo.samples.SecondActivity;
import com.loong.componentdemo.arouterdemo.samples.ThreeActivity;
import com.loong.componentdemo.arouterdemo.service.ServiceManage;
import com.loong.componentdemo.arouterdemo.service.SingleService;

public class ArouterDmeoMainActivity extends AppCompatActivity implements  View.OnClickListener {
    Button btnFirstActivity;
    Button btnSecondActivity;
    Button btnThreeActivity;
    Button btnForeActivity;
    Button btnModuleOne;
    Button btnModuleTwo;
    Button btnService;
    Button btnServiceManage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arouter_main);

         btnFirstActivity = findViewById(R.id.btnFirstActivity);
         btnSecondActivity = findViewById(R.id.btnSecondActivity);
         btnThreeActivity = findViewById(R.id.btnThreeActivity);
         btnForeActivity = findViewById(R.id.btnForeActivity);
         btnModuleOne = findViewById(R.id.btnModuleOne);
         btnModuleTwo = findViewById(R.id.btnModuleTwo);
         btnService = findViewById(R.id.btnService);
         btnServiceManage = findViewById(R.id.btnServiceManage);


        btnFirstActivity.setOnClickListener(this);
                btnSecondActivity.setOnClickListener(this);
        btnThreeActivity.setOnClickListener(this);
                btnForeActivity.setOnClickListener(this);
                        btnModuleOne.setOnClickListener(this);
        btnModuleTwo.setOnClickListener(this);
        btnService.setOnClickListener(this);
        btnServiceManage.setOnClickListener(this);
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 && resultCode == RESULT_OK) {
            Toast.makeText(ArouterDmeoMainActivity.this, data.getStringExtra(ThreeActivity.PARAM_RESULT), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnFirstActivity:
                //应用内跳转
                ARouter.getInstance()
                        .build(FirstActivity.PATH)
                        .navigation();
                break;
            case R.id.btnSecondActivity:
                //应用内携带参数跳转
                ARouter.getInstance()
                        .build(SecondActivity.PATH)
                        .withString(SecondActivity.PARAM, "这是跳转携带的参数")
                        .navigation();
                break;
            case R.id.btnThreeActivity:
                //Activity返回结果处理
                ARouter.getInstance()
                        .build(ThreeActivity.PATH)
                        .navigation(this, 100);
                break;
            case R.id.btnForeActivity:
                // 通过Uri跳转及参数解析
                ARouter.getInstance()
                        .build(ForeActivity.PATH)
                        .navigation();
                break;
            case R.id.btnModuleOne:
                //跳转Module-one
                ARouter.getInstance()
                        .build(Module.MODULE_ONE)
                        .navigation();
                break;
            case R.id.btnModuleTwo:
                //跳转Module-two
                ARouter.getInstance()
                        .build(Module.MODULE_TWO)
                        .navigation();
                break;
            case R.id.btnService:
                //通过服务类class调用
                ARouter.getInstance().navigation(SingleService.class).showMessage();
                //通过服务类Path调用
                ((SingleService) ARouter.getInstance().
                        build(SingleService.PATH)
                        .navigation())
                        .showMessage();
                break;
            case R.id.btnServiceManage:
                //服务管理，通过依赖注入的方式获取服务
                ServiceManage manage = new ServiceManage();
                manage.getService();
                break;
        }
    }
}
