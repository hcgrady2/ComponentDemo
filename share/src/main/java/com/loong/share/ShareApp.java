package com.loong.share;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.loong.base.BaseApp;
import com.loong.componentbase.ServiceFactory;

public class ShareApp extends BaseApp {

    @Override
    public void onCreate() {
        super.onCreate();
        initModuleApp(this);
        initModuleData(this);
    }

    @Override
    public void initModuleApp(Application application) {
        ARouter.init(this);
    }

    @Override
    public void initModuleData(Application application) {

    }
}
