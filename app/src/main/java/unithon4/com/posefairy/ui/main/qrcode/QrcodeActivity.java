package unithon4.com.posefairy.ui.main.qrcode;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import unithon4.com.posefairy.R;

/**
 * Created by jeongahri on 2018. 7. 28..
 */

public class QrcodeActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton cancel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_qrcode);

        initView();

    }

    private void initView(){
        cancel = findViewById(R.id.cancel);
        cancel.setOnClickListener(this);

    }

    public void onClick(View v) {
        this.finish();
    }







}
