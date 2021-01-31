package com.elias.operaciones;


import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.app.*;
import android.os.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	public void calcular(View view){
		double num1, num2, respuesta;
		TextView tempVal;

		num1 = 0;
		num2 = 0;
		respuesta = 0;

		try{
			tempVal = (TextView)findViewById(R.id.txtnum1);
			num1 = Double.parseDouble(tempVal.getText().toString());
		} catch(Exception e){
		}

		try{
			tempVal = (TextView)findViewById(R.id.txtnum2);
			num2 = Double.parseDouble(tempVal.getText().toString());
		} catch(Exception e){
		}


		
		Spinner cboOperacionesBasicas = findViewById(R.id.cboOperacionesBasicas);
		switch (cboOperacionesBasicas.getSelectedItemPosition()){
			case 0:
				respuesta = num1+num2;
				tempVal = findViewById(R.id.lblRespuesta);
				tempVal.setText(num1 + " + " + num2 + " = " + respuesta);	
				break;
			case 1:
				respuesta = num1-num2;
				tempVal = findViewById(R.id.lblRespuesta);
				tempVal.setText(num1 + " - " + num2 + " = " + respuesta);
				break;
			case 2:
				respuesta = num1*num2;
				tempVal = findViewById(R.id.lblRespuesta);
				tempVal.setText(num1 + " * " + num2 + " = " + respuesta);
				break;
			case 3:
				respuesta = num1/num2;
				tempVal = findViewById(R.id.lblRespuesta);
				tempVal.setText(num1 + " / " + num2 + " = " + respuesta);
				break;
			case 4:
				if(num1 == 0){
					respuesta = 1;
				} else {
					for(int i = 2; i<=num1; i++){
						respuesta *= i;
					}
				}
				tempVal = findViewById(R.id.lblRespuesta);
				tempVal.setText(num1 + "! = " + respuesta);
				break;
			case 5:
				respuesta = (num1*num2)/100;
				tempVal = findViewById(R.id.lblRespuesta);
				tempVal.setText(num1+ " % de " + num2 + " = " + respuesta);
				break;
			case 6:
				respuesta = Math.pow(num1, num2);
				tempVal = findViewById(R.id.lblRespuesta);
				tempVal.setText(num1+ " ^ " + num2 + " = " + respuesta);
				break;
			case 7:
				respuesta = Math.pow(num2, (double) 1/num1);
				tempVal = findViewById(R.id.lblRespuesta);
				tempVal.setText(num1+ " √ " + num2 + " = " + respuesta);
				break;
			case 8:
				respuesta = num1 % num2;
				tempVal = findViewById(R.id.lblRespuesta);
				tempVal.setText(num1+ " MOD " + num2 + " = " + respuesta);
				break;
			case 9:
				respuesta = Math.max(num1, num2);
				tempVal = findViewById(R.id.lblRespuesta);
				tempVal.setText(respuesta + " es mayor entre " + num1+ " y " + num2);
				break;
		}
	}
}
