package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OpenWebsite(View view) {
        Uri uri = Uri.parse("https://www.facebook.com");
        Intent  intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

    public void Call(View view) {
        Uri uri = Uri.parse("tel:+923107421772");
        Intent  intent = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(intent);
    }
}