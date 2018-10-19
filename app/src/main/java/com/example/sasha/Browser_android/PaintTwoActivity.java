package com.example.sasha.Browser_android;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.example.sasha.pain_android.R;

public class PaintTwoActivity extends AppCompatActivity
{
    TextView text2;
    WebView webID;

    private class MyWebViewClient extends WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url)
        {
            view.loadUrl(url);
            return true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paint_two);
        setTitle("Browser v.228");

        text2 = findViewById(R.id.text2);
        webID = findViewById(R.id.webID);

        Intent intent = getIntent();
        String xz = intent.getStringExtra("text1");
        text2.setText(""+xz);

        Uri data = getIntent().getData();
        webID.loadUrl(data.toString());
        MyWebViewClient myClic = new MyWebViewClient();
        webID.setWebViewClient(myClic);


//        Intent intent = getIntent();
//        String xz = intent.getStringExtra("text1");
//        text2.setText(""+xz);
//
//        webID.setWebViewClient(myClic);
//        webID.loadUrl(intent.getStringExtra("text1"));
        Log.e("Act 2", "onCreate");
    }

    @Override
    public void onStart() {

        super.onStart();
        Log.e("Act 2", "onStart");
    }
    @Override
    public void onRestoreInstanceState(Bundle saveInstanceState)
    {
        Log.e("Act 2", "onCreate");
    }
    @Override
    public void onRestart()
    {
        super.onRestart();
        Log.e("Act 2", "onRestart");
    }
    @Override
    public void onResume()
    {
        super.onResume();
        Log.e("Act 2", "onResume");
    }
    @Override
    public void onPause()
    {
        super.onPause();
        Log.e("Act 2", "onPause");
    }
    @Override
    public void onSaveInstanceState(Bundle saveInstanceState)
    {
        super.onSaveInstanceState(saveInstanceState);
        Log.e("Act 2", "onSaveInstanceState");
    }
    @Override
    public void onStop()
    {
        super.onStop();
        Log.e("Act 2", "onStop");
    }
    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Log.e("Act 2", "onDestroy");
    }
}
