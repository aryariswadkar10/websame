package com.example.exp9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txt;
    Button b1;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.txt);
        b1 = findViewById(R.id.b1);
        webView = findViewById(R.id.web);

        b1.setOnClickListener(view -> {
            String str = txt.getText().toString();
            webView.setWebViewClient(new WebViewClient());
            webView.loadUrl(str);
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
        });

    }
    

}