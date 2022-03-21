package com.neocaptainnemo.activity21march;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        if (savedInstanceState == null) {
            logEvent("onCreate first");

        } else {
            logEvent("onCreate relaunch");
        }

    }

    @Override
    protected void onStart() {
        super.onStart();

        logEvent("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        logEvent("onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();

        logEvent("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        logEvent("onStop");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        logEvent("onSaveInstanceState");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        logEvent("onDestroy");

    }

    private void logEvent(String event) {
        Log.d("MainLog2", event);
    }

}
