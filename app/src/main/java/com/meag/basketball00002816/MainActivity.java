package com.meag.basketball00002816;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private int puntos1 = 0;
    private int puntos2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void ganar(View v) {

        if (v.getId() == R.id.uno1) {
            puntos1 += 1;
        }
        if (v.getId() == R.id.dos1) {
            puntos1 += 2;
        }
        if (v.getId() == R.id.tres1) {
            puntos1 += 3;
        }

        if (v.getId() == R.id.uno2) {
            puntos2 += 1;
        }
        if (v.getId() == R.id.dos2) {
            puntos2 += 2;
        }
        if (v.getId() == R.id.tres2) {
            puntos2 += 3;
        }


        TextView contador1 = findViewById(R.id.contador1);
        TextView contador2 = findViewById(R.id.contador2);

        contador1.setText(puntos1 + "");
        contador2.setText(puntos2 + "");
    }

    public void reset(View v) {
        Log.d("Mensaje", "Evento de añadido desde xml");
        if (v.getId() == R.id.reset) {
            puntos1 = 0;
            puntos2 = 0;
            TextView contador1 = findViewById(R.id.contador1);
            TextView contador2 = findViewById(R.id.contador2);
            contador1.setText(puntos1 + "");
            contador2.setText(puntos2 + "");
        }
    }
    }



