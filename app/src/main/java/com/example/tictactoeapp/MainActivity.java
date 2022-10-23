package com.example.tictactoeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    int flag=0;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    TextView x,draw,o;

    int valuex=0,valuedraw=0,valueO=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inite();



    }

    private void inite() {
        btn1=findViewById(R.id.butt1);
        btn2=findViewById(R.id.butt2);
        btn3=findViewById(R.id.butt3);
        btn4=findViewById(R.id.butt4);
        btn5=findViewById(R.id.butt5);
        btn6=findViewById(R.id.butt6);
        btn7=findViewById(R.id.butt7);
        btn8=findViewById(R.id.butt8);
        btn9=findViewById(R.id.butt9);

        x=findViewById(R.id.valueofxid);
        draw=findViewById(R.id.valueofdrawid);
        o=findViewById(R.id.valueofOid);
    }

    public void check(View view){
        Button btncurren= (Button) view;

    if (btncurren.getText().toString().equals("")){

        btncurren.setText("X");
        che();
        flag++;


new Handler().postDelayed(new Runnable() {
    @Override
    public void run() {
        if (btn1.getText().toString().equals("") || btn2.getText().toString().equals("")
                || btn3.getText().toString().equals("")|| btn4.getText().toString().equals("")|| btn5.getText().toString().equals("")
                || btn6.getText().toString().equals("")|| btn7.getText().toString().equals("")|| btn8.getText().toString().equals("")|| btn9.getText().toString().equals("")){

            flag++;


                ai();
                buttdis();
               che();


        }




    }
},1000);

buttdis();


    }


    }

    private void che() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (flag>4){
                    b1=btn1.getText().toString();
                    b2=btn2.getText().toString();
                    b3=btn3.getText().toString();
                    b4=btn4.getText().toString();
                    b5=btn5.getText().toString();
                    b6=btn6.getText().toString();
                    b7=btn7.getText().toString();
                    b8=btn8.getText().toString();
                    b9=btn9.getText().toString();


                    if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")){
                        Toast.makeText(getApplicationContext(),"win "+b1,Toast.LENGTH_SHORT).show();

                        st(b1);



                    }else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")){
                        Toast.makeText(getApplicationContext(),"win "+b4,Toast.LENGTH_SHORT).show();

                        st(b4);

                    }else if (b7.equals(b8) && b8.equals(b9) && !b9.equals("")){
                        Toast.makeText(getApplicationContext(),"win "+b7,Toast.LENGTH_SHORT).show();

                        st(b7);

                    }else if (b1.equals(b5) && b5.equals(b9) && !b9.equals("")){
                        Toast.makeText(getApplicationContext(),"win "+b1,Toast.LENGTH_SHORT).show();

                        st(b1);
                    }else if (b7.equals(b5) && b5.equals(b3) && !b3.equals("")){
                        Toast.makeText(getApplicationContext(),"win "+b7,Toast.LENGTH_SHORT).show();

                        st(b7);

                    }else if (b1.equals(b4) && b4.equals(b7) && !b7.equals("")){
                        Toast.makeText(getApplicationContext(),"win "+b1,Toast.LENGTH_SHORT).show();

                        st(b1);

                    }else if (b2.equals(b5) && b5.equals(b8) && !b8.equals("")){
                        Toast.makeText(getApplicationContext(),"win "+b2,Toast.LENGTH_SHORT).show();

                        st(b2);

                    }else if (b3.equals(b6) && b6.equals(b9) && !b9.equals("")){
                        Toast.makeText(getApplicationContext(),"win "+b3,Toast.LENGTH_SHORT).show();

                        st(b3);


                    }else if (!btn1.getText().toString().equals("") && !btn2.getText().toString().equals("")
                            && !btn3.getText().toString().equals("") && !btn4.getText().toString().equals("") && !btn5.getText().toString().equals("")
                            && !btn6.getText().toString().equals("") && !btn7.getText().toString().equals("")&&!btn8.getText().toString().equals("") && !btn9.getText().toString().equals("")){

                        Toast.makeText(getApplicationContext(),"draw",Toast.LENGTH_SHORT).show();
                        st("draw");
                    }

                }
                x.setText(Integer.toString(valuex));
                draw.setText(Integer.toString(valuedraw));
                o.setText(Integer.toString(valueO));
                butten();
            }
        },1000);
    }

    private void butten() {
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
    }

    private void buttdis() {
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
    }

    private void ai() {


        if (btn1.getText().toString().equals(btn2.getText().toString()) && btn3.getText().toString().equals("") && !btn1.getText().toString().equals("")){
            btn3.setText("O");
        }else if (btn3.getText().toString().equals(btn2.getText().toString()) && btn1.getText().toString().equals("") && !btn2.getText().toString().equals("")){
            btn1.setText("O");
        }else if (btn1.getText().toString().equals(btn3.getText().toString()) && btn2.getText().toString().equals("") && !btn1.getText().toString().equals("")){
            btn2.setText("O");
        }else if (btn4.getText().toString().equals(btn5.getText().toString()) && btn6.getText().toString().equals("") && !btn4.getText().toString().equals("")){
            btn6.setText("O");
        }else if (btn5.getText().toString().equals(btn6.getText().toString()) && btn4.getText().toString().equals("") && !btn5.getText().toString().equals("")){
            btn4.setText("O");
        }else if (btn4.getText().toString().equals(btn6.getText().toString()) && btn5.getText().toString().equals("") && !btn4.getText().toString().equals("")){
            btn5.setText("O");
        }else if (btn7.getText().toString().equals(btn8.getText().toString()) && btn9.getText().toString().equals("") && !btn7.getText().toString().equals("")){
            btn9.setText("O");
        }else if (btn8.getText().toString().equals(btn9.getText().toString()) && btn7.getText().toString().equals("") && !btn8.getText().toString().equals("")){
            btn7.setText("O");
        }else if (btn7.getText().toString().equals(btn9.getText().toString()) && btn8.getText().toString().equals("") && !btn7.getText().toString().equals("")){
            btn8.setText("O");
        }else if (btn1.getText().toString().equals(btn4.getText().toString()) && btn7.getText().toString().equals("") && !btn1.getText().toString().equals("")){
            btn7.setText("O");
        }else if (btn7.getText().toString().equals(btn4.getText().toString()) && btn1.getText().toString().equals("") && !btn7.getText().toString().equals("")){
            btn1.setText("O");
        }else if (btn1.getText().toString().equals(btn7.getText().toString()) && btn4.getText().toString().equals("") && !btn7.getText().toString().equals("")){
            btn4.setText("O");
        }else if (btn2.getText().toString().equals(btn5.getText().toString()) && btn8.getText().toString().equals("") && !btn2.getText().toString().equals("")){
            btn8.setText("O");
        }else if (btn5.getText().toString().equals(btn8.getText().toString()) && btn2.getText().toString().equals("") && !btn5.getText().toString().equals("")){
            btn2.setText("O");
        }else if (btn2.getText().toString().equals(btn8.getText().toString()) && btn5.getText().toString().equals("") && !btn2.getText().toString().equals("")){
            btn5.setText("O");
        }else if (btn3.getText().toString().equals(btn6.getText().toString()) && btn9.getText().toString().equals("") && !btn3.getText().toString().equals("")){
            btn9.setText("O");
        }else if (btn6.getText().toString().equals(btn9.getText().toString()) && btn3.getText().toString().equals("") && !btn6.getText().toString().equals("")){
            btn3.setText("O");
        }else if (btn3.getText().toString().equals(btn9.getText().toString()) && btn6.getText().toString().equals("") && !btn3.getText().toString().equals("")){
            btn6.setText("O");
        }else if (btn1.getText().toString().equals(btn5.getText().toString()) && btn9.getText().toString().equals("") && !btn1.getText().toString().equals("")){
            btn9.setText("O");
        }else if (btn5.getText().toString().equals(btn9.getText().toString()) && btn1.getText().toString().equals("") && !btn5.getText().toString().equals("")){
            btn1.setText("O");
        }else if (btn1.getText().toString().equals(btn9.getText().toString()) && btn5.getText().toString().equals("") && !btn1.getText().toString().equals("")){
            btn5.setText("O");
        }else if (btn3.getText().toString().equals(btn5.getText().toString()) && btn7.getText().toString().equals("") && !btn3.getText().toString().equals("")){
            btn7.setText("O");
        }else if (btn5.getText().toString().equals(btn7.getText().toString()) && btn3.getText().toString().equals("") && !btn5.getText().toString().equals("")){
            btn3.setText("O");
        }else if (btn3.getText().toString().equals(btn7.getText().toString()) && btn5.getText().toString().equals("") && !btn3.getText().toString().equals("")){
            btn5.setText("O");
        }

        else {for (int i=0;i<1;i++){

            int a= (int) (Math.random()*9);
            System.out.println(a+""+i);
            if (a==0){
                if (btn1.getText().toString().equals("")){
                    btn1.setText("O");

                }else {
                    i--;
                }

            }else if(a==1){
                if (btn2.getText().toString().equals("")){
                    btn2.setText("O");
                }else {
                    i--;
                }

            }else if (a==2){
                if (btn3.getText().toString().equals("")){
                    btn3.setText("O");
                }else {
                    i--;
                }
            }else if (a==3){
                if (btn4.getText().toString().equals("")){
                    btn4.setText("O");
                }else {
                    i--;
                }
            }else if (a==4){
                if (btn5.getText().toString().equals("")){
                    btn5.setText("O");
                }else {
                    i--;
                }

            }else if (a==5){
                if (btn6.getText().toString().equals("")){
                    btn6.setText("O");
                }else {
                    i--;
                }

            }else if (a==6){
                if (btn7.getText().toString().equals("")){
                    btn7.setText("O");
                }else {
                    i--;
                }

            }else if (a==7){
                if (btn8.getText().toString().equals("")){
                    btn8.setText("O");

                }else {
                    i--;
                }

            }else if (a==8) {
                if (btn9.getText().toString().equals("")) {
                    btn9.setText("O");

                } else {
                    i--;
                }
            }


        }}


    }

    public void st(String value){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        flag=0;

        if (value.equals("X")){
            valuex++;
        }else if (value.equals("draw")){
            valuedraw++;
        }else {
            valueO++;
        }
    }


}