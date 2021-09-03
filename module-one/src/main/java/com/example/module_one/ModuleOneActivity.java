package com.example.module_one;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;


@Route(path = ModuleOneActivity.PATH)
public class ModuleOneActivity extends AppCompatActivity {

    public static final String PATH = "/module1/module-one";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module_one_activity_one_module);
        Button btnModuleTwoActivity = findViewById(R.id.btnModuleTwoActivity);

        btnModuleTwoActivity.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        ARouter.getInstance().build("/module2/module-two").navigation();

                    }
                }
        );
    }


}
