package com.isaac012.intent_explicito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.CountDownTimer;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class splash extends AppCompatActivity implements View.OnClickListener{

    TextView number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        number = findViewById(R.id.number);

        new CountDownTimer(10000, 1000) {

            public void onTick(long millisUntilFinished) {
                number.setText("Falta: " + millisUntilFinished / 1000 + " segundos");
            }

            public void onFinish() {
                number.setText("Puedes entrar!");
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }


        }.start();
    }


    @Override
    public void onClick(View view) {



    }
}

