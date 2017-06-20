package com.example.android.quiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.duration;
import static android.R.attr.id;
import static com.example.android.quiz.R.id.answer1;
import static com.example.android.quiz.R.id.answer2;
import static com.example.android.quiz.R.id.totalScore;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswers(View view) {
        int totalScore = 0;
        CheckBox correctAnswerACheckbox = (CheckBox) findViewById(R.id.correctAnswerA);
        boolean hasCorrectAnswerA = correctAnswerACheckbox.isChecked();
        CheckBox correctAnswerCCheckbox = (CheckBox) findViewById(R.id.correctAnswerC);
        boolean hasCorrectAnswerC = correctAnswerCCheckbox.isChecked();
        CheckBox wrongAnswerBCheckbox = (CheckBox) findViewById(R.id.wrongAnswerB);
        boolean hasWrongAnswerB = wrongAnswerBCheckbox.isChecked();
        CheckBox wrongAnswerDCheckbox = (CheckBox) findViewById(R.id.wrongAnswerD);
        boolean hasWrongAnswerD = wrongAnswerDCheckbox.isChecked();
        RadioButton wrongAnswer2ACheckbox = (RadioButton) findViewById(R.id.wrongAnswer2A);
        boolean hasWrongAnswer2A = wrongAnswer2ACheckbox.isChecked();
        RadioButton wrongAnswer2BCheckbox = (RadioButton) findViewById(R.id.wrongAnswer2B);
        boolean hasWrongAnswer2B = wrongAnswer2BCheckbox.isChecked();
        RadioButton wrongAnswer2CCheckbox = (RadioButton) findViewById(R.id.wrongAnswer2C);
        boolean hasWrongAnswer2C = wrongAnswer2CCheckbox.isChecked();
        RadioButton correctAnswer2DCheckbox = (RadioButton) findViewById(R.id.correctAnswer2D);
        boolean hasCorrectAnswer2D = correctAnswer2DCheckbox.isChecked();
        RadioButton correctAnswer3Checkbox = (RadioButton) findViewById(R.id.correctAnswer3);
        boolean hasCorrectAnswer3 = correctAnswer3Checkbox.isChecked();
        RadioButton wrongAnswer3Checkbox = (RadioButton) findViewById(R.id.wrongAnswer3);
        boolean hasWrongAnswer3 = wrongAnswer3Checkbox.isChecked();
        EditText hascorrectAnswer4 = (EditText) findViewById(R.id.correctAnswer4);
        if (hasCorrectAnswerA == true & hasCorrectAnswerC == true) {
            totalScore += 1;
            displayTotalScore("total score = " + totalScore);
            displayAnswer1("correct");
        }
        if (hasWrongAnswerB == true & hasWrongAnswerD == true) {
            totalScore += 0;
            displayTotalScore("total score = " + totalScore);
            displayAnswer1("wrong");
        }
        if (hasCorrectAnswerC == true & hasWrongAnswerD == true) {
            totalScore += 0;
            displayTotalScore("total score = " + totalScore);
            displayAnswer1("mother's name is wrong");
        }
        if (hasCorrectAnswerA == true & hasWrongAnswerB == true) {
            totalScore += 0;
            displayTotalScore("total score = " + totalScore);
            displayAnswer1("father's name is wrong");
        }
        if (hasCorrectAnswerA == true & hasWrongAnswerD == true) {
            totalScore += 0;
            displayTotalScore("total score = " + totalScore);
            displayAnswer1("father's name is not there");
        }
        if (hasCorrectAnswerC == true & hasWrongAnswerB == true) {
            totalScore += 0;
            displayTotalScore("total score = " + totalScore);
            displayAnswer1("mother's name is not there");
        }
        if (hasWrongAnswerD == false & hasWrongAnswerB == false & hasCorrectAnswerA == false & hasCorrectAnswerC == false) {
            totalScore += 0;
            displayTotalScore("total score = " + totalScore);
            displayAnswer1("");
        }
        if (hasCorrectAnswer2D == true) {
            totalScore += 1;
            displayTotalScore("total score = " + totalScore);
            displayAnswer2("correct");
        }
        if (hasWrongAnswer2A == true) {
            totalScore += 0;
            displayTotalScore("total score = " + totalScore);
            displayAnswer2("wrong");
        }
        if (hasWrongAnswer2B == true) {
            totalScore += 0;
            displayTotalScore("total score = " + totalScore);
            displayAnswer2("wrong");
        }
        if (hasWrongAnswer2C == true) {
            totalScore += 0;
            displayTotalScore("total score = " + totalScore);
            displayAnswer2("wrong");
        }
        if (hasCorrectAnswer3 == true) {
            totalScore += 1;
            displayTotalScore("total score = " + totalScore);
            displayAnswer3("correct");
        }
        if (hasWrongAnswer3 == true) {
            totalScore += 0;
            displayTotalScore("total score = " + totalScore);
            displayAnswer3("wrong");
        }
        if (hascorrectAnswer4.getText().toString().equals("Severus Snape")) {
            totalScore += 1;
            displayTotalScore("total score = " + totalScore);
            displayAnswer4("correct");
        } else if (hascorrectAnswer4.getText().toString().equals("")) {
            totalScore += 0;
            displayTotalScore("total score = " + totalScore);
            displayAnswer4("");
        } else {
            totalScore += 0;
            displayTotalScore("total score = " + totalScore);
            displayAnswer4("wrong");
        }
        Context context = getApplicationContext();
        CharSequence text = "TOTAL SCORE = " + totalScore;
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void displayAnswer1(String answer) {
        TextView answerView1 = (TextView) findViewById(R.id.answer1);
        answerView1.setText(String.valueOf(answer));
    }

    public void displayAnswer2(String answer) {
        TextView answerView2 = (TextView) findViewById(R.id.answer2);
        answerView2.setText(String.valueOf(answer));
    }

    public void displayAnswer3(String answer) {
        TextView answerView3 = (TextView) findViewById(R.id.answer3);
        answerView3.setText(String.valueOf(answer));
    }

    public void displayAnswer4(String answer) {
        TextView answerView4 = (TextView) findViewById(R.id.answer4);
        answerView4.setText(String.valueOf(answer));
    }

    public void displayTotalScore(String total) {
        TextView totalView = (TextView) findViewById(totalScore);
        totalView.setText(String.valueOf(total));
    }

}
