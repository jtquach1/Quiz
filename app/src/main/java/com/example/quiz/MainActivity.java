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
//    private int mQuestionsLength = mQuestions.mQuestions.length;
//
//    Random r;
    // Get the scenario
    private int currentQuestion = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        // For randomizing question
//        r = new Random();

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
//        updateQuestion(r.nextInt(mQuestionsLength));
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
                // User got to end, 5,6,9,10
                else if (currentQuestion == 5 ||
                        currentQuestion == 6 ||
                        currentQuestion == 9 ||
                        currentQuestion == 10) {
                    gameOver();
                }
            // Get the next question
            currentQuestion = currentQuestion + 1;
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
                // User got to end, 5,6,9,10
                else if (currentQuestion == 5 ||
                        currentQuestion == 6 ||
                        currentQuestion == 9 ||
                        currentQuestion == 10) {
                    gameOver();
                }
                // Get the next question
                currentQuestion = currentQuestion + 2;
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
                // User got to end, 5,6,9,10
                else if (currentQuestion == 5 ||
                        currentQuestion == 6 ||
                        currentQuestion == 9 ||
                        currentQuestion == 10) {
                    gameOver();
                }
                // Get the next question
                currentQuestion = currentQuestion + 3;
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
                // User got to end, 5,6,9,10
                else if (currentQuestion == 5 ||
                        currentQuestion == 6 ||
                        currentQuestion == 9 ||
                        currentQuestion == 10) {
                    gameOver();
                }
                // Get the next question
                currentQuestion = currentQuestion + 4;
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
