package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void Animation(View view)
    {
        ImageView imageView= findViewById(R.id.imageView);
     //   imageView.animate().alpha(0).setDuration(3000);  //for fade out
      // imageView.animate().translationYBy(400).setDuration(6000);  //down (Y-axis)
      //  imageView.animate().translationYBy(-200).setDuration(3000);  //up (Y-axis)
       // imageView.animate().rotation(360); //rotate

     //   imageView.animate().scaleX(0.5f); sacle on X-axis
        //imageView.animate().scaleX(0.5f).scaleY(0.5f); //combine
        //imageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(5000); //combine with certain time

//        imageView.animate().rotation(720).alpha(0).setDuration(4000); //combine
      imageView.animate().rotation(720).scaleX(0.5f).scaleY(0.5f).setDuration(6000);

    }
}