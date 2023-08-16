package com.mdshamimislam.newsapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toolbar;

import com.mdshamimislam.newsapp.R;

public class Webview extends AppCompatActivity {
    Toolbar toolbar;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        //toolbar=findViewById(R.id.toolbar);
        webView=findViewById(R.id.webview);

        Intent intent=getIntent();
        String url=intent.getStringExtra("url");
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);
    }


}