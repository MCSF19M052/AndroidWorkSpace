package com.example.eshal.resturent_menu;


import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
       LinearLayout l1,l2,l3;
       Boolean v1=false,v2=false,v3=false,v4=false,v5=false,v6=false,v7=false,v8=false;
       CheckBox chiken,handi,nihari,biryani,chips,tandoori,fries,tikka;
       TextView result1,result2,total,dtotal;
       Button next,done,back;
       int a=0,b=0,c=0,d=0,e=0,f=0,i=1,counter=0;

    @Override
      protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1 = (LinearLayout) findViewById(R.id.linear1);
        l2 = (LinearLayout) findViewById(R.id.linear2);
        l3 = (LinearLayout) findViewById(R.id.linear3);

        next = (Button) findViewById(R.id.next);
        done = (Button) findViewById(R.id.done);
        back=(Button) findViewById(R.id.back);
        chiken = (CheckBox) findViewById(R.id.chiken);
        handi = (CheckBox) findViewById(R.id.handi);
        biryani = (CheckBox) findViewById(R.id.biryani);
        nihari = (CheckBox) findViewById(R.id.nihari);
        chips = (CheckBox) findViewById(R.id.chips);
        tandoori = (CheckBox) findViewById(R.id.tandoori);
        tikka = (CheckBox) findViewById(R.id.tikka);
        fries = (CheckBox) findViewById(R.id.fries);

        result1 = (TextView) findViewById(R.id.result1);
        result2 = (TextView) findViewById(R.id.result2);
        total = (TextView) findViewById(R.id.total);
        dtotal = (TextView) findViewById(R.id.dtotal);

        next.setOnClickListener(this);
        done.setOnClickListener(this);
        back.setOnClickListener(this);
        chiken.setOnClickListener(this);
        handi.setOnClickListener(this);
        biryani.setOnClickListener(this);
        nihari.setOnClickListener(this);
        chips.setOnClickListener(this);
        tandoori.setOnClickListener(this);
        tikka.setOnClickListener(this);
        fries.setOnClickListener(this);

    }
    public void onClick(View v)
       {
           if(v.getId()==R.id.back)
           {
             l1.setVisibility(View.VISIBLE);
             l2.setVisibility(View.GONE);
             l3.setVisibility(View.GONE);
           }

         if(chiken.isChecked()) {v1=true;}        else {v1=false;}

         if(biryani.isChecked()) {v2=true;}      else {v2=false;}

         if(handi.isChecked()) {v3=true;}        else {v3=false;}

         if(nihari.isChecked()) {v4=true;}       else {v4=false;}

         if(tikka.isChecked()) {v5=true;}       else {v5=false;}

         if(tandoori.isChecked()) {v6=true;}     else {v6=false;}

         if(fries.isChecked()) {v7=true;}       else {v7=false;}

         if(chips.isChecked()) {v8=true;}         else {v8=false;}
           if(v.getId()==R.id.next)
       {
           l1.setVisibility(View.GONE);
           l2.setVisibility(View.VISIBLE);
           l3.setVisibility(View.GONE);
       }
       if(v.getId()==R.id.done)
       {
           l1.setVisibility(View.GONE);
           l2.setVisibility(View.GONE);
           l3.setVisibility(View.VISIBLE);
           if(v1==true)
           {a=200;
               result1.append(i+" => "+chiken.getText().toString()+"\n");
               result2.append(a+" Rs.\n");
               b=b+a;
               i++;}
           if(v2==true)
           {a=150;
               result1.append(i+" => "+biryani.getText().toString()+"\n");
               result2.append(a+" Rs.\n");
               b=b+a;
               i++;}

           if(v3==true)
           {a=100;
               result1.append(i+" => "+handi.getText().toString()+"\n");
               result2.append(a+" Rs.\n");
               b=b+a;i++;
           }
           if(v4==true)
           {a=120;
               result1.append(i+" => "+nihari.getText().toString()+"\n");
               result2.append(a+" Rs.\n");
               b=b+a;
               i++;}

           if(v5==true)
           {a=800;
               result1.append(i+" => "+tikka.getText().toString()+"\n");
               result2.append(a+" Rs.\n");
               b=b+a;
               i++;
           }

           if(v6==true)
           {
               a=750;
               result1.append(i+" => "+tandoori.getText().toString()+"\n");
               result2.append(a+" Rs.\n");
               b=b+a;
               i++;
           }

           if(v7==true)
           {
               a=200;
               result1.append(i+" => "+fries.getText().toString()+"\n");
               result2.append(a+" Rs.\n");
               b=b+a;
               i++;
           }

           if(v8==true)
           {
               a=150;
               result1.append(i+" => "+chips.getText().toString()+"\n");
               result2.append(a+" Rs.\n");
               b=b+a;
               i++;
           }

           c=b/100;
           d=c*10;
           e=b-d;
           total.setText(b+" Rs.\n");
           dtotal.setText(e+" Rs.\n");

       }

    }

}
