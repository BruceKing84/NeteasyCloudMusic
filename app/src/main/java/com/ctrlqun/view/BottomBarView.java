package com.ctrlqun.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.ctrlqun.neteasycloudmusic.R;

public class BottomBarView extends RelativeLayout implements View.OnClickListener {

    OnBottomBarListener buttonListener;

    public BottomBarView(Context context) {
        super(context);
        inflateView();
    }

    public BottomBarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflateView();
    }

    private void inflateView() {
        inflate(getContext(), R.layout.view_bottombar, this);
        ((Button) findViewById(R.id.id_bottom_bar_discover)).setOnClickListener(this);
        ((Button) findViewById(R.id.id_bottom_bar_video)).setOnClickListener(this);
        ((Button) findViewById(R.id.id_bottom_bar_mymusic)).setOnClickListener(this);
        ((Button) findViewById(R.id.id_bottom_bar_friends)).setOnClickListener(this);
        ((Button) findViewById(R.id.id_bottom_bar_account)).setOnClickListener(this);
    }

    public void setOnBottomBarListener(OnBottomBarListener buttonListener) {
        this.buttonListener = buttonListener;
    }

    @Override
    public void onClick(View v) {
        if (buttonListener == null) {
            return;
        }
        if (v.getId() == R.id.id_bottom_bar_discover) {
            buttonListener.onDiscoverPage();
        } else if (v.getId() == R.id.id_bottom_bar_video) {
            buttonListener.onVideoPage();
        } else if (v.getId() == R.id.id_bottom_bar_mymusic) {
            buttonListener.onMymusicPage();
        } else if (v.getId() == R.id.id_bottom_bar_friends) {
            buttonListener.onFriendsPage();
        } else if (v.getId() == R.id.id_bottom_bar_account) {
            buttonListener.onAccountPage();
        }
    }

    public interface OnBottomBarListener {
        public void onDiscoverPage();
        public void onVideoPage();
        public void onMymusicPage();
        public void onFriendsPage();
        public void onAccountPage();
    }
}
