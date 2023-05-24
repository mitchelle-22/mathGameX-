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
import android.widget.Toast;

import java.util.Random;



public class GameActivity extends AppCompatActivity {

    TextView textScore;
    TextView textLife;
    TextView textTime;

    TextView textQuestion;
   EditText textAnswer;

    Button buttonOk;
    Button buttonNext;

    var correctAnswer = 0;
    var userScore = 0;
    var userLife =3;

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



       gameContinue();
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                var input = editTextAnswer.text.toString()
                        if(input == "")
                        {
                            Toast.makeText(getApplicationContext(),"Please write an answer",
                                    Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            var userAnswer = input.toInt();
                            if(userAnswer == correctAnswer)
                            {
                                         userScore = userScore + 10;
                                         textQuestion.text = "Congradulations,your answer is coorrect";
                                         textScore.text = userScore.toString()
                            }
                            else
                            {
                                userLife--
                                        textQuestion.text ="Sorry your answer is wrong";
                            }
                        }


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
        Random number1 = new Random();
        number1.nextInt(100);

        Random number2 = new Random();
        number2.nextInt(100);

        correctAnswer = number1 + number2;
       // textQuestion.text = "$number1 + $number2";

    return null;

    }



}