package com.neocaptainnemo.activity21march;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class CounterActivity extends AppCompatActivity {

    private static final String COUNT = "count";
    private Counter counter;

    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        counter = new Counter();

        result = findViewById(R.id.count);

        if (savedInstanceState != null) {
            counter = savedInstanceState.getParcelable(COUNT);
        }

        showResult();

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (view.getId()) {
                    case R.id.increase:
                        counter.increase();

                        showResult();

                        break;

                    case R.id.finish:

                        finish();
                        break;

                }
            }
        };

        findViewById(R.id.increase).setOnClickListener(clickListener);

        findViewById(R.id.finish).setOnClickListener(clickListener);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putParcelable(COUNT, counter);
    }

    private void showResult() {
        result.setText(String.valueOf(counter.getValue()));
    }
}