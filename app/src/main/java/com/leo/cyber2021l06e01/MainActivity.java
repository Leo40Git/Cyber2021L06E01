package com.leo.cyber2021l06e01;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private Switch sw;
    private ToggleButton tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sw = findViewById(R.id.sw);
        tb = findViewById(R.id.tb);
    }

    public void onClick_btnApply(View view) {
        int colId;
        if (tb.isChecked()) {
            if (sw.isChecked())
                colId = android.R.color.holo_red_dark;
            else
                colId = android.R.color.holo_red_light;
        } else {
            if (sw.isChecked())
                colId = android.R.color.holo_blue_dark;
            else
                colId = android.R.color.holo_blue_bright;
        }
        setBackColor(colId);
    }

    private void setBackColor(int colId) {
        int color;
        if (Build.VERSION.SDK_INT < 23)
            color = getResources().getColor(colId);
        else
            color = getResources().getColor(colId, getTheme());
        getWindow().getDecorView().setBackgroundColor(color);
    }
}
