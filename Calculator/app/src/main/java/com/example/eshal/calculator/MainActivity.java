package com.example.eshal.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView result;
    Button zero,one,two,three,four,five,six,seven,eight,nine,minus,divide,point,multiply,plus,equal,clear;
    double v1=0.0,v2=0.0,v3;
    boolean add,sub,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zero = (Button) findViewById(R.id.zero);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        point = (Button) findViewById(R.id.point);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        equal = (Button) findViewById(R.id.equal);
        result = (TextView) findViewById(R.id.equalTV);
        clear=(Button) findViewById(R.id.clear);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"9");
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+".");
            }
        });


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if(result.getText()!=null && sub==false  ) {
                        if(v1==0)
                            v1=Double.parseDouble(result.getText()+"");
                        add = true;
                        sub = false;
                        mul = false;
                        div = false;

                        result.setText(null);

                    }}
                catch(Exception e){
                    Toast.makeText(getApplicationContext(),"Plase select value",Toast.LENGTH_SHORT).show();
                }
            }


        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(result.getText()!=null && sub==false) {
                        if(v1==0)
                            v1=Double.parseDouble(result.getText()+"");

                        sub=true;
                        add = false;
                        mul = false;
                        div = false;

                        result.setText(null);

                    }
                }
                catch(Exception e){
                    Toast.makeText(getApplicationContext(),"Plase select value",Toast.LENGTH_SHORT).show();
                }

            }

        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(result.getText()!=null && mul==false) {
                        if(v1==0)
                            v1=Double.parseDouble(result.getText()+"");
                        mul=true;
                        add = false;
                        sub = false;
                        div = false;
                        result.setText("");}
                } catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Plase select value",Toast.LENGTH_SHORT).show();
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {


                    if(result.getText()!=null && div==false) {
                        if(v1==0)
                            v1=Double.parseDouble(result.getText()+"");
                        div=true;
                        add = false;
                        sub = false;
                        mul = false;

                        result.setText(null);}}
                catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Plase select value",Toast.LENGTH_SHORT).show();
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText(null);
                v1=0.0;
                v2=0.0;
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {


                    if (result.getText() != null && v1 >= 0.0 && v2 >=0.0) {
                        v2 = Double.parseDouble(result.getText() + "");
                        if (add == true) {
                            result.setText(v1 + v2 + "");
                            add = false;
                            v1=Float.parseFloat(result.getText().toString());

                        }
                        if (sub == true) {
                            result.setText(v1 - v2 + "");
                            sub = false;
                            v1=Float.parseFloat(result.getText().toString());
                        }
                        if (mul == true) {
                            result.setText(v1 * v2 + "");
                            mul = false;
                            v1=Float.parseFloat(result.getText().toString());
                        }
                        if (div == true) {
                            result.setText(v1 / v2 + "");
                            div = false;
                            v1=Float.parseFloat(result.getText().toString());
                        }

                    }
                }catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(),"Plase select value",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


    public void onClickBtn(View v)
    {
        Toast.makeText(getApplicationContext(),"Plase select value",Toast.LENGTH_SHORT).show();
    }

}



