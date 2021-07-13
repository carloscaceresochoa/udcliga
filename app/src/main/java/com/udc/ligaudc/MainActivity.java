package com.udc.ligaudc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    /**
     * metodo oncreate se ejecuta cuando se inicializa la actividad
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        splash();
    }

    /**
     * metodo sirve para mostrar actividad inicial en 5 segundos y luego
     * pasa a la actividad heroes
     */
    public void splash(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(getBaseContext(),HeroeActivity.class);
                startActivity(intent);
            }
        },5000);
    }
}