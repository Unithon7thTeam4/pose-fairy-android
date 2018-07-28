package unithon4.com.posefairy.ui.main;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import unithon4.com.posefairy.R;
import unithon4.com.posefairy.ui.main.qrcode.QrcodeActivity;

/**
 * Created by jeongahri on 2018. 7. 28..
 */

public class MainActivity extends AppCompatActivity {

    ActionBar actionBar;
    FragmentManager fm;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        actionBar = getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false);

        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Intent intent;

        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_qrcode:
                intent = new Intent(MainActivity.this, QrcodeActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_alarm:

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

}
