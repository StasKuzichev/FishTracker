package com.rdc.fishtracker.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rdc.fishtracker.R;

/**
 * Displays the main screen
 */
public class MainActivity extends AppCompatActivity implements MainContract.MVPView {
    private MainPresenter mPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new MainPresenter(this);
    }
}
