package com.example.hasu.Neutritionist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class CalorieInputTracker extends AppCompatActivity {

    public WebView w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_input_tracker);


        w = findViewById(R.id.webVIEW2);
        w.getSettings().setJavaScriptEnabled(true);
        w.getSettings().setDomStorageEnabled(true);
        w.loadUrl("file:///android_asset/hh/cc.html");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.action_search:
                DialogFragment bmr_menu = new BmrMenu();
                bmr_menu.show(getSupportFragmentManager(), "bmr_defination");
                break;

            case R.id.expanded_menu:
                Intent tryThis = new Intent(CalorieInputTracker.this, ViewListContents.class);
                startActivity(tryThis);
                break;

            case android.R.id.home:
                this.onBackPressed();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}