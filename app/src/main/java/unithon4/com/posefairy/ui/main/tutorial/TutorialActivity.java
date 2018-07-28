package unithon4.com.posefairy.ui.main.tutorial;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import unithon4.com.posefairy.R;

/**
 * Created by jeongahri on 2018. 7. 28..
 */

public class TutorialActivity extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }
}
