package com.example.skybreaker.csci490_lab_04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //WebView webview = new WebView(this);
        setContentView(webview);
        webview.loadUrl("https://github.com/CSCI-490-MobileAppDevelopment-S2018/CSCI490-Lab_04");

    }
}