package com.originalstocks.facebooklogindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.facebook.login.LoginManager;

public class HomeActivity extends AppCompatActivity {

    private LoginManager mLoginManager;
    private Button logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mLoginManager = LoginManager.getInstance();

        logoutButton = findViewById(R.id.button_logout);

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLoginManager.logOut();
            }
        });


    }



    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
