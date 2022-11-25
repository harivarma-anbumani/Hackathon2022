package com.example.energysaverdemo;

import android.annotation.SuppressLint;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import com.example.energysaverdemo.databinding.ActivityFullscreenBinding;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class FullscreenActivity extends AppCompatActivity {

    WebView webView;
    ImageView forwardImage;
    ImageView backImage;
    ImageView homeImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);

        // initialise the layout
        webView = findViewById(R.id.webvidew);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);
        webView.setTop(330);
        webView.setInitialScale(130);
        webView.setWebViewClient(new Callback());
        webView.loadUrl("file:///android_asset/index.html");

       /* webView.addJavascriptInterface( new Object() {
            @JavascriptInterface // For API 17+
            public void movePageToNext() {
                Intent intent = new Intent(FullscreenActivity.this, BrowserResults.class);
                startActivity(intent);
                finish();
            }
        } , "ok" ) ;
*/
       forwardImage = findViewById(R.id.imageViewenSaved22);
        forwardImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FullscreenActivity.this, VideoAnimation.class);
                startActivity(intent);
                finish();
            }
        });

    }


    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return false;
        }
    }


    @Override
    public void onBackPressed() {
        if(webView != null && webView.canGoBack()){
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }

}