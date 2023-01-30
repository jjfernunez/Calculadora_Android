package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double num1, num2, resultado;
    int operacion;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.textView);
    }

    public void igual (View view){

        num2 = Double.parseDouble(tv.getText().toString());

        switch(operacion){
            case 1: resultado = num1 + num2;
                break;
            case 2: resultado = num1 - num2;
                break;
            case 3: resultado = num1 * num2;
                break;
            case 4: resultado = num1 / num2;
                break;
            case 5: resultado = num1 % num2;
                break;
        }

        tv.setText(String.format("%s", resultado));
    }

    public void suma(View view){
        operacion = 1;
        guardarOperador(view);
    }
    public void resta(View view){
        operacion = 2;
        guardarOperador(view);
    }
    public void multi(View view){
        operacion = 3;
        guardarOperador(view);
    }
    public void div(View view){
        operacion = 4;
        guardarOperador(view);
    }
    public void porcent(View view){
        operacion = 5;
        guardarOperador(view);
    }
    public static String removeLastChar(String s) {
        return (s == null || s.length() == 0)
                ? null
                : (s.substring(0, s.length() - 1));
    }

    public void guardarOperador(View view){

        num1 = Double.parseDouble(tv.getText().toString());

        tv.setText("");
    }

    public void btn1(View view){

        tv.setText(String.format("%s1", tv.getText()));
    }
    public void btn2(View view){

        tv.setText(tv.getText() + "2");
    }
    public void btn3(View view){

        tv.setText(tv.getText() + "3");
    }
    public void btn4(View view){

        tv.setText(tv.getText() + "4");
    }public void btn5(View view){

        tv.setText(tv.getText() + "5");
    }
    public void btn6(View view){

        tv.setText(tv.getText() + "6");
    }public void btn7(View view){

        tv.setText(tv.getText() + "7");
    }public void btn8(View view){

        tv.setText(tv.getText() + "8");
    }
    public void btn9(View view){

        tv.setText(tv.getText() + "9");
    }
    public void btn0(View view){

        tv.setText(tv.getText() + "0");
    }
    public void btnComa(View view){

        tv.setText(tv.getText() + ".");
    }

    public void btnBorrar(View view){

        tv.setText(removeLastChar((String) tv.getText()));
    }

    public void btnReset(View view){

        num1 = 0;
        num2 = 0;
        tv.setText("");
    }

}