package com.example.adapters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> friendList;
    ArrayAdapter<String> arrayAdapter;

    Button button ;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.myListView);
        friendList = new ArrayList<String>();
         button = findViewById(R.id.btn1);
         editText=findViewById(R.id.editTextAdd);

        friendList.add("Ibrahim");
        friendList.add("Imran");
        friendList.add("Raza");
        friendList.add("Ahmed");
        friendList.add("Naseem");
        friendList.add("Ishaq");

        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,friendList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> AdapterView, View view, int position, long id) {
                Log.d("You clicked", friendList.get(position));
                Intent intent = new Intent(MainActivity.this, Detail.class);
                intent.putExtra("Friend Name", friendList.get(position));
                startActivity(intent);
            }
        });
    }

    public void AddFriend(View view) {
        friendList.add(editText.getText().toString());
        arrayAdapter.notifyDataSetChanged();
        Collections.sort(friendList);

    }
}