package com.example.ahmed.radiogroup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    RadioGroup rg_orientation, rg_gravity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg_orientation = (RadioGroup) findViewById(R.id.rg_orienration);
        rg_gravity = (RadioGroup) findViewById(R.id.rg_garvity);

        rg_orientation.setOnCheckedChangeListener(this);
        rg_gravity.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (i) {
            case R.id.rb_vertical:
                rg_orientation.setOrientation(LinearLayout.VERTICAL);
                break;
            case R.id.rb_horizontal:
                rg_orientation.setOrientation(LinearLayout.HORIZONTAL);
                break;

            case R.id.rb_right:
                rg_gravity.setGravity(Gravity.RIGHT);
                break;
            case R.id.rb_center:
                rg_gravity.setGravity(Gravity.CENTER);
                break;
            case R.id.rb_left:
                rg_gravity.setGravity(Gravity.LEFT);
                break;
        }
    }
}
