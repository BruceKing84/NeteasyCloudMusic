package com.ctrlqun.neteasycloudmusic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ctrlqun.view.BottomBarView;

public class VideoActivity extends BottomBarListenerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        ((BottomBarView) findViewById(R.id.id_BottomBarView)).setOnBottomBarListener(this);
    }
}
