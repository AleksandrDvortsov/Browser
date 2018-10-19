package com.example.sasha.Browser_android;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

import com.example.sasha.pain_android.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button btnStartPaint;

    EditText text1;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Browser v.228");
        Log.e("Act 1", "onCreate");

        btnStartPaint = findViewById(R.id.btnStartPaint);
        text1 = findViewById(R.id.text1);
        btnStartPaint.setOnClickListener(this);
    }
    @Override
    public void onClick(View v)
    {

//       startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://i.ua")));
        String str = text1.getText().toString();
        Uri uri = Uri.parse(str);
        Intent xz = new Intent(Intent.ACTION_VIEW, uri);
        xz.putExtra("text1", text1.getText().toString());
        startActivity(xz);
//        Intent intent = new Intent(this, PaintTwoActivity.class);
//        xz.putExtra("text1", text1.getText().toString());
//        startActivity(intent);
    }
    @Override
    public void onStart() {

        super.onStart();
        Log.e("Act 1", "onStart");
    }
    @Override
    public void onRestoreInstanceState(Bundle saveInstanceState)
    {
        Log.e("Act 1", "onCreate");
    }
    @Override
    public void onRestart()
    {
        super.onRestart();
        Log.e("Act 1", "onRestart");
    }
    @Override
    public void onResume()
    {
        super.onResume();
        Log.e("Act 1", "onResume");
    }
    @Override
    public void onPause()
    {
        super.onPause();
        Log.e("Act 1", "onPause");
    }
    @Override
    public void onSaveInstanceState(Bundle saveInstanceState)
    {
        super.onSaveInstanceState(saveInstanceState);
        Log.e("Act 1", "onSaveInstanceState");
    }
    @Override
    public void onStop()
    {
        super.onStop();
        Log.e("Act 1", "onStop");
    }
    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Log.e("Act 1", "onDestroy");
    }
}
