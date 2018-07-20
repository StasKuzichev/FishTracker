package com.rdc.fishtracker.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

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

    // MVPView methods
    @Override
    public void showSignInScreen() {
        Toast.makeText(this, "Taking user to Sign In screen", Toast.LENGTH_SHORT)
                .show();
    }

    @Override
    public void showSignUpScreen() {
        Toast.makeText(this, "Taking user to Sign Up screen", Toast.LENGTH_SHORT)
                .show();
    }
}
