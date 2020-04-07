package com.example.quiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

// Quiz game for 1 player
public class MainActivity extends AppCompatActivity {

    Button answer1, answer2, answer3, answer4;
    TextView score, question;

    private Questions mQuestions = new Questions();

    private String mAnswer;
    private int mScore = 0;

    // Get the scenario, begin picking mom or daughter
    private int currentQuestion = 11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);
        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);

        // Initialize score
        score.setText("Score: " + mScore);

        // Initialize question to ask player
        updateQuestion(currentQuestion);

        // OnClickListeners for the four choices
        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Is user's answer correct?
                if (answer1.getText() == mAnswer) {
                    // Update the score and text
                    mScore++;
                    score.setText("Score: " + mScore);
                }
                // User got to last question of the scenario
                if (lastQuestion()) {
                    gameOver();
                }
                // Get the next question, hardcoded
                switch (currentQuestion) {
                    // Mother
                    case 0: currentQuestion = 1; break;
                    case 1: currentQuestion = 3; break;
                    case 2: currentQuestion = 7; break;
                    case 3: currentQuestion = 5; break;
                    case 4: currentQuestion = 6; break;
                    case 7: currentQuestion = 9; break;
                    case 8: currentQuestion = 9; break;
                    // Daughter
                    case 11: currentQuestion = 0; break;
                    case 12: currentQuestion = 13; break;
                    case 13: currentQuestion = 15; break;
                    case 14: currentQuestion = 21; break;
                    case 15: currentQuestion = 17; break;
                    case 16: currentQuestion = 19; break;
                    case 21: currentQuestion = 23; break;
                    case 22: currentQuestion = 24; break;
                }
                updateQuestion(currentQuestion);
            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Is user's answer correct?
                if (answer2.getText() == mAnswer) {
                    // Update the score and text
                    mScore++;
                    score.setText("Score: " + mScore);
                }
                // User got to last question of the scenario
                if (lastQuestion()) {
                    gameOver();
                }
                // Get the next question, hardcoded
                switch (currentQuestion) {
                    // Mother
                    case 0: currentQuestion = 2; break;
                    case 1: currentQuestion = 4; break;
                    case 2: currentQuestion = 8; break;
                    case 3: currentQuestion = 5; break;
                    case 4: currentQuestion = 6; break;
                    case 7: currentQuestion = 10; break;
                    case 8: currentQuestion = 10; break;
                    // Daughter
                    case 11: currentQuestion = 12; break;
                    case 12: currentQuestion = 14; break;
                    case 13: currentQuestion = 16; break;
                    case 14: currentQuestion = 22; break;
                    case 15: currentQuestion = 18; break;
                    case 16: currentQuestion = 20; break;
                    case 21: currentQuestion = 23; break;
                    case 22: currentQuestion = 24; break;
                }
                updateQuestion(currentQuestion);
            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Is user's answer correct?
                if (answer3.getText() == mAnswer) {
                    // Update the score and text
                    mScore++;
                    score.setText("Score: " + mScore);
                }
                // User got to last question of the scenario
                if (lastQuestion()) {
                    gameOver();
                }
                // Get the next question, hardcoded
                switch (currentQuestion) {
                    // Mother
                    case 0: currentQuestion = 1; break;
                    case 1: currentQuestion = 3; break;
                    case 2: currentQuestion = 7; break;
                    case 3: currentQuestion = 5; break;
                    case 4: currentQuestion = 6; break;
                    case 7: currentQuestion = 9; break;
                    case 8: currentQuestion = 9; break;
                    // Daughter
                    case 11: currentQuestion = 0; break;
                    case 12: currentQuestion = 13; break;
                    case 13: currentQuestion = 15; break;
                    case 14: currentQuestion = 21; break;
                    case 15: currentQuestion = 17; break;
                    case 16: currentQuestion = 19; break;
                    case 21: currentQuestion = 23; break;
                    case 22: currentQuestion = 24; break;
                }
                updateQuestion(currentQuestion);
            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Is user's answer correct?
                if (answer4.getText() == mAnswer) {
                    // Update the score and text
                    mScore++;
                    score.setText("Score: " + mScore);
                }
                // User got to last question of the scenario
                if (lastQuestion()) {
                    gameOver();
                }
                // Get the next question, hardcoded
                switch (currentQuestion) {
                    // Mother
                    case 0: currentQuestion = 2; break;
                    case 1: currentQuestion = 4; break;
                    case 2: currentQuestion = 8; break;
                    case 3: currentQuestion = 5; break;
                    case 4: currentQuestion = 6; break;
                    case 7: currentQuestion = 10; break;
                    case 8: currentQuestion = 10; break;
                    // Daughter
                    case 11: currentQuestion = 12; break;
                    case 12: currentQuestion = 14; break;
                    case 13: currentQuestion = 16; break;
                    case 14: currentQuestion = 22; break;
                    case 15: currentQuestion = 18; break;
                    case 16: currentQuestion = 20; break;
                    case 21: currentQuestion = 23; break;
                    case 22: currentQuestion = 24; break;
                }
                updateQuestion(currentQuestion);
            }
        });
    }

    // Update all TextViews based on question and choices from num
    private void updateQuestion(int num) {
        question.setText(mQuestions.getQuestions(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));
        answer4.setText(mQuestions.getChoice4(num));
        // Get correct answer for question num
        mAnswer = mQuestions.getCorrectAnswer(num);
    }

    // Did user get to the last question of the path in a scenario?
    private boolean lastQuestion() {
        return currentQuestion == 5 ||
                currentQuestion == 6 ||
                currentQuestion == 9 ||
                currentQuestion == 10 ||
                currentQuestion == 17 ||
                currentQuestion == 18 ||
                currentQuestion == 19 ||
                currentQuestion == 20 ||
                currentQuestion == 23 ||
                currentQuestion == 24;
    }

    // Prompts a game over
    private void gameOver() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                // Show score
                .setMessage("Game Over! Your score is " + mScore + " points.")
                // Cannot be cancelled by user
                .setCancelable(false)
                // Prompts for a new game
                .setPositiveButton("NEW GAME",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                                finish();
                            }
                        })
                // Prompts for exit
                .setNegativeButton("EXIT",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        });

        // Show the prompt
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }
}
