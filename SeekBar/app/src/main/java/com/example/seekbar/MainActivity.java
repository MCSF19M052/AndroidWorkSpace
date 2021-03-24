package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView= findViewById(R.id.listViewSeekBar);
        SeekBar seekBar= findViewById(R.id.seekBar);
        seekBar.setMax(20);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int index, boolean fromUser) {
               // Log.i("SeekBar Value is : ", String.valueOf(index));
                int tableNumber = index;
                ArrayList<String> tableArrayList= new ArrayList<String>();
                for (int x=1;x<20;x++)
                {
                    tableArrayList.add(Integer.toString(x*index));
                }
                ArrayAdapter<String> arrayAdapter=  new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, tableArrayList);
                listView.setAdapter(arrayAdapter);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

}