package com.example.initialsetup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.initialsetup.login.LoginActivity;
import com.example.initialsetup.R;
public class SplashActivity extends AppCompatActivity {
long delayMillis =5*1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

         new android.os.Handler().postDelayed(new Runnable() {

            // Using handler with postDelayed called runnable run method

            @Override
            public void run() {
                android.content.Intent i = new android.content.Intent(SplashActivity.this, LoginActivity.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, delayMillis); // wait for 5 seconds

    }


}
