package com.example.projetoimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final float[] imc = new float[1];
        Button btCalcular = (Button) findViewById(R.id.btcalcular);
        btCalcular.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView editpeso = (EditText) findViewById(R.id.editPeso);
                TextView editaltura = (EditText) findViewById(R.id.editAltura);
                TextView tvresultado = (TextView) findViewById(R.id.tvResultado);
                TextView tvdescrição = (TextView) findViewById(R.id.tvDescrição);
                int peso = Integer.parseInt(editpeso.getText().toString());
                float altura = Float.parseFloat(editaltura.getText().toString());
                imc[0] = peso /(altura * altura);
                if(imc[0]<16){
                    tvresultado.setText(imc[0]+"");
                    tvdescrição.setText("Magreza grave");
                }
                else{ if(imc[0]<17){
                        tvresultado.setText(imc[0]+"");
                        tvdescrição.setText("Magreza moderada");
                    }else{ if(imc[0]<18.5){
                            tvresultado.setText(imc[0]+"");
                            tvdescrição.setText("Magreza leve"); }
                        else {if(imc[0]<25){
                            tvresultado.setText(imc[0] + "");
                            tvdescrição.setText("Saudável");}
                            else{if(imc[0]<30){
                                tvresultado.setText(imc[0] + "");
                                tvdescrição.setText("Sobrepeso");}
                                else{if(imc[0]<35){
                                    tvresultado.setText(imc[0] + "");
                                    tvdescrição.setText("Obesidade Grau I");}
                                      else{if(imc[0]<40){
                                        tvresultado.setText(imc[0] + "");
                                        tvdescrição.setText("Obesidade Grau II");}
                        else{
                            tvresultado.setText(imc[0] + "");
                            tvdescrição.setText("Obesidade Grau IIII (mórbida)");
                        }
                } }}
                        }
                    }

                }
            }
        });
    }
}