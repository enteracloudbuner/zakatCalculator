package com.example.zakat;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Mustahiq extends AppCompatActivity {


    private WebView wvmustahiq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mustahiq);

        wvmustahiq= findViewById(R.id.mutahiqid);
        wvmustahiq.loadUrl("file:///android_asset/mustahiqeen.html");
        wvmustahiq.getSettings().setJavaScriptEnabled(true);
        wvmustahiq.setBackgroundColor(Color.parseColor("#379540"));


    }
}
