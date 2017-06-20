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
        CheckBox correctAnswer1aCheckbox = (CheckBox) findViewById(R.id.correctAnswer1a);
        boolean hasCorrectAnswer1a = correctAnswer1aCheckbox.isChecked();
        CheckBox correctAnswer1cCheckbox = (CheckBox) findViewById(R.id.correctAnswer1c);
        boolean hasCorrectAnswer1c = correctAnswer1cCheckbox.isChecked();
        CheckBox wrongAnswerbCheckbox = (CheckBox) findViewById(R.id.wrongAnswerb);
        boolean hasWrongAnswerb = wrongAnswerbCheckbox.isChecked();
        CheckBox wrongAnswerdCheckbox = (CheckBox) findViewById(R.id.wrongAnswerd);
        boolean hasWrongAnswerd = wrongAnswerdCheckbox.isChecked();
        RadioButton wrongAnswer2aCheckbox = (RadioButton) findViewById(R.id.wrongAnswer2a);
        boolean hasWrongAnswer2a = wrongAnswer2aCheckbox.isChecked();
        RadioButton wrongAnswer2bCheckbox = (RadioButton) findViewById(R.id.wrongAnswer2b);
        boolean hasWrongAnswer2b = wrongAnswer2bCheckbox.isChecked();
        RadioButton wrongAnswer2cCheckbox = (RadioButton) findViewById(R.id.wrongAnswer2c);
        boolean hasWrongAnswer2c = wrongAnswer2cCheckbox.isChecked();
        RadioButton correctAnswer2dCheckbox = (RadioButton) findViewById(R.id.correctAnswer2d);
        boolean hasCorrectAnswer2d = correctAnswer2dCheckbox.isChecked();
        RadioButton correctAnswer3Checkbox = (RadioButton) findViewById(R.id.correctAnswer3);
        boolean hasCorrectAnswer3 = correctAnswer3Checkbox.isChecked();
        RadioButton wrongAnswer3Checkbox = (RadioButton) findViewById(R.id.wrongAnswer3);
        boolean hasWrongAnswer3 = wrongAnswer3Checkbox.isChecked();
        EditText hascorrectAnswer4 = (EditText) findViewById(R.id.correctAnswer4);
        if (hasCorrectAnswer1a == true & hasCorrectAnswer1c == true) {
            totalScore += 1;
            displayTotalScore("total score = " + totalScore);
            displayAnswer1("correct");
        }
        if (hasWrongAnswerb == true & hasWrongAnswerd == true) {
            totalScore += 0;
            displayTotalScore("total score = " + totalScore);
            displayAnswer1("wrong");
        }
        if (hasCorrectAnswer1c == true & hasWrongAnswerd == true) {
            totalScore += 0;
            displayTotalScore("total score = " + totalScore);
            displayAnswer1("mother's name is wrong");
        }
        if (hasCorrectAnswer1a == true & hasWrongAnswerb == true) {
            totalScore += 0;
            displayTotalScore("total score = " + totalScore);
            displayAnswer1("father's name is wrong");
        }
        if (hasCorrectAnswer1a == true & hasWrongAnswerd == true) {
            totalScore += 0;
            displayTotalScore("total score = " + totalScore);
            displayAnswer1("father's name is not there");
        }
        if (hasCorrectAnswer1c == true & hasWrongAnswerb == true) {
            totalScore += 0;
            displayTotalScore("total score = " + totalScore);
            displayAnswer1("mother's name is not there");
        }
        if (hasWrongAnswerd == false & hasWrongAnswerb == false & hasCorrectAnswer1a == false & hasCorrectAnswer1c == false) {
            totalScore += 0;
            displayTotalScore("total score = " + totalScore);
            displayAnswer1("");
        }
        if (hasCorrectAnswer2d == true) {
            totalScore += 1;
            displayTotalScore("total score = " + totalScore);
            displayAnswer2("correct");
        }
        if (hasWrongAnswer2a == true) {
            totalScore += 0;
            displayTotalScore("total score = " + totalScore);
            displayAnswer2("wrong");
        }
        if (hasWrongAnswer2b == true) {
            totalScore += 0;
            displayTotalScore("total score = " + totalScore);
            displayAnswer2("wrong");
        }
        if (hasWrongAnswer2c == true) {
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
