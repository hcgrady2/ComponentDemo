package com.loong.componentdemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.loong.componentbase.ServiceFactory;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        ServiceFactory.getInstance().getAccountService().newUserFragment(this, R.id.layout_fragment, getSupportFragmentManager(), null, "");
    }
}
