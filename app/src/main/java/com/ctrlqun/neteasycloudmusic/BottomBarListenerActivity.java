package com.ctrlqun.neteasycloudmusic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.ctrlqun.view.BottomBarView;

public class BottomBarListenerActivity extends Activity implements BottomBarView.OnBottomBarListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public void onDiscoverPage() {
        Intent intent = new Intent(BottomBarListenerActivity.this, DiscoverActivity.class);
        startActivity(intent);
    }

    @Override
    public void onVideoPage() {
        Intent intent = new Intent(BottomBarListenerActivity.this, VideoActivity.class);
        startActivity(intent);
    }

    @Override
    public void onMymusicPage() {
        Intent intent = new Intent(BottomBarListenerActivity.this, MymusicActivity.class);
        startActivity(intent);
    }

    @Override
    public void onFriendsPage() {
        Intent intent = new Intent(BottomBarListenerActivity.this, FriendsActivity.class);
        startActivity(intent);
    }

    @Override
    public void onAccountPage() {
        Intent intent = new Intent(BottomBarListenerActivity.this, AccountActivity.class);
        startActivity(intent);
    }
}
