package com.technical.mathgamepart1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import kotlin.random.Random;

public class GameActivity extends AppCompatActivity {

    TextView textScore;
    TextView textLife;
    TextView textTime;

    TextView textQuestion;
   EditText textAnswer;

    Button buttonOk;
    Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        textScore = findViewById(R.id.textViewScore);
        textLife = findViewById(R.id.textViewLife);
        textTime = findViewById(R.id.textViewTime);

        textQuestion = findViewById(R.id.textViewQuestion);
        textAnswer = findViewById(R.id.editTextAnswer);

        buttonOk = findViewById(R.id.buttonOk);
        buttonNext = findViewById(R.id.buttonNext);


        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }
    fun gameContinue()
    {
          Random r = new Random() {
              @Override
              public int nextBits(int i) {
                  return 0;
              }
          };
        return null;
    }


}