package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class SecondActivity extends AppCompatActivity {

    private CardView zero,unu,doi,trei,patru,cinci,sase,sapte,opt,noua,AC,inv,suta,impartire,inmultire,minus,plus,egal,virgula,putere_3,putere_2,factorial,fibo;
    private TextView afis;
    private double rezultat,val;
    private String op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        zero=(CardView)findViewById(R.id.zero);
        unu=(CardView)findViewById(R.id.unu);
        doi=(CardView)findViewById(R.id.doi);
        trei=(CardView)findViewById(R.id.trei);
        patru=(CardView)findViewById(R.id.patru);
        cinci=(CardView)findViewById(R.id.cinci);
        sase=(CardView)findViewById(R.id.sase);
        sapte=(CardView)findViewById(R.id.sapte);
        opt=(CardView)findViewById(R.id.opt);
        noua=(CardView)findViewById(R.id.noua);
        plus=(CardView)findViewById(R.id.plus);
        minus=(CardView)findViewById(R.id.minus);
        inmultire=(CardView)findViewById(R.id.inmultire);
        impartire=(CardView)findViewById(R.id.imprtire);
        egal=(CardView)findViewById(R.id.egal);
        AC=(CardView)findViewById(R.id.AC);
        afis=(TextView)findViewById(R.id.afis);
        inv=(CardView)findViewById(R.id.inv);
        suta=(CardView)findViewById(R.id.suta) ;
        putere_3=(CardView)findViewById(R.id.putere_3) ;
        putere_2=(CardView)findViewById(R.id.putere_2) ;
        factorial=(CardView)findViewById(R.id.factorial) ;
        fibo=(CardView)findViewById(R.id.fibo);


        rezultat=0;
        op="";

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=val*10;
                afisare(val);
            }
        });

        unu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            val=val*10+1;
            afisare(val);
        }
        });

        doi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=val*10+2;
                afisare(val);
            }
        });
        trei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=val*10+3;
                afisare(val);
            }
        });
        patru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=val*10+4;
                afisare(val);
            }
        });
        cinci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=val*10+5;
                afisare(val);
            }
        });
        sase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=val*10+6;
                afisare(val);
            }
        });
        sapte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=val*10+7;
                afisare(val);
            }
        });
        opt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=val*10+8;
                afisare(val);
            }
        });
        noua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=val*10+9;
                afisare(val);
            }
        });


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                if(op=="") operatie("+");
                else
                    operatie(op);
                op="+";
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                if(op=="") operatie("+");
                else
                    operatie(op);
                op="-";

            }
        });
        inmultire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                    if(op=="") operatie("+");
                    else
                        operatie(op);
                    op="*";
                }

        });
        impartire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                if(op=="") operatie("+");
                else
                    operatie(op);
                op="/";
            }
        });

        egal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                operatie(op);
                val=rezultat;
                rezultat=0;
                op="";
            }
        });

        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                afis.setText("");
                val=0;
                rezultat=0;
                op="";
            }
        });
        inv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                afis.setText("-"+String.valueOf(val));
                val=-val;
            }
        });

        suta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=val/100;
                afisare(val);
            }
        });

        putere_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=Math.pow(val,3);
                afisare(val);
            }
        });
        putere_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=Math.pow(val,2);
                afisare(val);
            }
        });

        factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nr=1;
                for(int i=1;i<=val;i++)
                    nr=nr*i;
                val=nr;
                afisare(val);
            }
        });
        fibo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1=1,n2=1,n3=0;
                double count=val;
                int i;

                if(val==1 || val==2)
                    n3=1;
                else
                for(i=2;i<count;++i)
                {
                    n3=n1+n2;
                    n1=n2;
                    n2=n3;
                }
                afisare(n3);

            }
        });
    }

    public void afisare(double val_afis)
    {
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMinimumFractionDigits(0);
        formatter.setMaximumFractionDigits(5);
        String output = formatter.format(val_afis);
        afis.setText(output);
    }

    public void operatie(String op){
      switch(op){
          case "+": rezultat+=val; break;
          case "-": rezultat-=val;break;
          case "*": rezultat*=val;break;
          case "/": rezultat/=val;break;
      }
      afisare(rezultat);
        val=0;


    }
}
