package unithon4.com.posefairy.utils;

import android.app.Application;

/**
 * Created by jeongahri on 2018. 7. 28..
 */

public class BaseActivity extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        TypeFaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/IropkeBatangM.ttf");
    }


}
