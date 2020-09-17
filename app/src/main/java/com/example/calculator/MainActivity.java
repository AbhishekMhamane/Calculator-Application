package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button one,two,three,add,ans,cancel,four,five,six,seven,eight,nine,zero,mul,div,sub,dot,rem,del;
    TextView e;
    TextView tx;
    boolean addition,subtraction,multiplication,division,remainder,decimal;

    double input1,input2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        one=(Button)findViewById(R.id.button1);
        two=(Button)findViewById(R.id.button2);
        three=(Button)findViewById(R.id.button3);
        four=(Button)findViewById(R.id.button4);
        five=(Button)findViewById(R.id.button5);
        six=(Button)findViewById(R.id.button6);
        seven=(Button)findViewById(R.id.button7);
        eight=(Button)findViewById(R.id.button8);
        nine=(Button)findViewById(R.id.button9);
        zero=(Button)findViewById(R.id.button0);
        dot=(Button)findViewById(R.id.dot);
        rem=(Button)findViewById(R.id.remainder);

        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        mul=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.div);
        ans=(Button)findViewById(R.id.ans);
        cancel=(Button)findViewById(R.id.cancel);
        del=(Button)findViewById(R.id.del);

        e=(TextView) findViewById(R.id.textView1);
        tx=(TextView)findViewById(R.id.textView);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                e.setText(e.getText()+"1");
                tx.setText(tx.getText()+"1");



            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText() + "2");
                tx.setText(tx.getText() + "2");


            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText()+"3");
                tx.setText(tx.getText()+"3");


            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText()+"4");
                tx.setText(tx.getText()+"4");


            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText()+"5");
                tx.setText(tx.getText()+"5");



            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText()+"6");
                tx.setText(tx.getText()+"6");

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText()+"7");
                tx.setText(tx.getText()+"7");



            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText()+"8");
                tx.setText(tx.getText()+"8");



            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText()+"9");
                tx.setText(tx.getText()+"9");



            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                e.setText(e.getText() + ".");
                tx.setText(tx.getText() + ".");
                decimal = true;

            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText()+"0");
                tx.setText(tx.getText()+"0");

            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(e.getText().length()!=0) {
                    String z = String.valueOf(e.getText());

                    input1 = Float.parseFloat(z);

                    addition=true;
                    decimal=false;
                    e.setText("");
                    tx.setText(tx.getText() + "+");

                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(e.getText().length()!=0) {
                    String z = String.valueOf(e.getText());

                    input1 = Float.parseFloat(z);

                    subtraction=true;
                    decimal=false;
                    e.setText("");
                    tx.setText(tx.getText() + "-");

                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e.getText().length()!=0) {
                    String z = String.valueOf(e.getText());

                    input1 = Float.parseFloat(z);

                    division=true;
                    decimal=false;
                    e.setText("");
                    tx.setText(tx.getText() + "/");

                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e.getText().length()!=0)
                {
                    String z= String.valueOf(e.getText());

                    input1=Float.parseFloat(z);

                    multiplication=true;
                    decimal=false;
                    e.setText("");
                    tx.setText(tx.getText()+"*");

                }
            }

        });

        rem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e.getText().length()!=0)
                {
                    String z= String.valueOf(e.getText());

                    input1=Double.parseDouble(z);
                    remainder=true;
                    decimal=false;
                    e.setText("");
                    tx.setText(tx.getText()+"%");

                }
            }
        });

        ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                if (addition || subtraction || multiplication || division || remainder) {
                    input2 = Float.parseFloat(e.getText() + "");
                }

                if (addition) {

                    e.setText(input1 + input2 + "");
                    addition = false;
                }

                if (subtraction) {

                    e.setText(input1 - input2 + "");
                    subtraction = false;
                }

                if (multiplication) {
                    e.setText(input1 * input2 + "");
                    multiplication = false;
                }

                if (division) {
                    e.setText(input1 / input2 + "");
                    division = false;
                }
                if (remainder) {
                    e.setText(input1 % input2 + "");
                    remainder = false;
                }


            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                e.setText("");
                tx.setText("");

            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tx.setText("");
                e.setText("");

                input1=0;
                input2=0;
            }
        });

    }
}