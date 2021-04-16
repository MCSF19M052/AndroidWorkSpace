package com.example.eshal.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     EditText et1,et2;
     LinearLayout l1,l2;
     Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1=(LinearLayout) findViewById(R.id.l1);
        l2=(LinearLayout) findViewById(R.id.l2);
        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
        btn=(Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=et1.getText().toString();
                String password=et2.getText().toString();
                if(name.equals("shoaib") && password.equals("12345"))
                {
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.VISIBLE);
                }
                else if(name.equals("") || password.equals(""))
                {
                    Toast.makeText(getBaseContext(),"Please fill the blanks",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getBaseContext(),"Sorry, user name and password are wrong",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
