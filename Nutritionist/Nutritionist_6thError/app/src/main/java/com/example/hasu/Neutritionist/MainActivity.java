package com.example.hasu.Neutritionist;

//Jannathul Maowa Hasi
//17701026

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView mBMITextView, mHeartRateTextView;
    private Button btn,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBMITextView = findViewById(R.id.bmi_text_view);
        mBMITextView.setOnClickListener(this);

        mHeartRateTextView = findViewById(R.id.heart_rate_text_view);
        mHeartRateTextView.setOnClickListener(this);

        btn = findViewById(R.id.count_calorie);
        btn.setOnClickListener(this);

        btn2 = findViewById(R.id.go_to_search);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bmi_text_view:
                Intent startBMIActivity = new Intent(MainActivity.this, BMIActivity.class);
                startActivity(startBMIActivity);
                break;
            case R.id.heart_rate_text_view:
                Intent startHeartRateActivity = new Intent(MainActivity.this, HeartRatesActivity.class);
                startActivity(startHeartRateActivity);
                break;
            case R.id.count_calorie:
                Intent silent = new Intent(MainActivity.this, CalorieCount.class);
                startActivity(silent);
                break;
            case R.id.go_to_search:
                Intent silent2 = new Intent(MainActivity.this, CalorieInputTracker.class);
                startActivity(silent2);
                break;
        }
    }
}
