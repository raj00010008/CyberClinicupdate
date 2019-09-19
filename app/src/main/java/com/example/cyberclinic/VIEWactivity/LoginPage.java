package com.example.cyberclinic.VIEWactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.example.cyberclinic.R;
import com.example.cyberclinic.VIEWfragment.LoginFragment;
import com.example.cyberclinic.VIEWfragment.RegisterAccountFragment;

public class LoginPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        getSupportActionBar().hide();
        callFragmentRegistration(); }
        public void callFragmentLogin() {
        FragmentManager fragmentManager= getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.frameLayout,new LoginFragment())
                .addToBackStack(null)
                .commit(); }
    public void callFragmentRegistration() {
        FragmentManager fragmentManager= getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.frameLayout,new RegisterAccountFragment())
                .addToBackStack(null)
                .commit(); }

    boolean doubleBackToExitPressedOnce = false;

    public void exitOnClick() {
        if (doubleBackToExitPressedOnce) {
            finish();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }

    @Override
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() <= 1) {
            exitOnClick();
            return;
        }
        super.onBackPressed();
    }
}

