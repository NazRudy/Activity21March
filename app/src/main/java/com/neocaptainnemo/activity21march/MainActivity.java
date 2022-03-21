package com.neocaptainnemo.activity21march;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            logEvent("onCreate first");

        } else {
            logEvent("onCreate relaunch");
        }

        findViewById(R.id.launch_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondActivityIntent = new Intent(MainActivity.this, CounterActivity.class);
                startActivity(secondActivityIntent);
            }
        });
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
        Log.d("MainLog", event);
    }
}