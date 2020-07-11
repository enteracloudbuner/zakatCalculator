package com.example.zakat;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.provider.Settings;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.net.URL;

import static java.security.AccessController.getContext;

public class Nisab extends AppCompatActivity {


    private WebView vwnisab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nisab);

        vwnisab= findViewById(R.id.nisab);
        vwnisab.loadUrl("file:///android_asset/assets.html");
        vwnisab.getSettings().setJavaScriptEnabled(true);
        vwnisab.setBackgroundColor(Color.parseColor("#379540"));


    }
}
