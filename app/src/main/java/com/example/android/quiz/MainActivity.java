package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import static android.R.attr.id;
import static com.example.android.quiz.R.id.answer1;
import static com.example.android.quiz.R.id.answer2;

public class MainActivity extends AppCompatActivity {

    int totalScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswers(View view) {
        CheckBox correctAnswer1Checkbox = (CheckBox) findViewById(R.id.correctAnswer1);
        boolean hasCorrectAnswer1 = correctAnswer1Checkbox.isChecked();
        CheckBox correctAnswer2Checkbox = (CheckBox) findViewById(R.id.correctAnswer2);
        boolean hasCorrectAnswer2 = correctAnswer2Checkbox.isChecked();
        RadioButton correctAnswer3Checkbox = (RadioButton) findViewById(R.id.correctAnswer3);
        boolean hasCorrectAnswer3 = correctAnswer3Checkbox.isChecked();
        EditText hascorrectAnswer4 = (EditText) findViewById(R.id.correctAnswer4);
        if (hasCorrectAnswer1==true) {
            totalScore = totalScore + 1;
            displayTotalScore("total score = " + totalScore);
            displayAnswer1("correct");
        }else{
            totalScore = totalScore + 0;
            displayTotalScore("total score = " + totalScore );
            displayAnswer1("wrong");
        }
        if (hasCorrectAnswer2==true) {
            totalScore = totalScore + 1;
            displayTotalScore("total score = " + totalScore);
            displayAnswer2("correct");
        }else{
            totalScore = totalScore + 0;
            displayTotalScore("total score = " + totalScore );
            displayAnswer2("wrong");
        }
        if (hasCorrectAnswer3==true) {
            totalScore = totalScore + 1;
            displayTotalScore("total score = " + totalScore);
            displayAnswer3("correct");
        }else{
            totalScore = totalScore + 0;
            displayTotalScore("total score = " + totalScore );
            displayAnswer3("wrong");
        }
        if (hascorrectAnswer4.getText().toString().equals("Severus Snape")) {
            totalScore = totalScore + 1;
            displayTotalScore("total score = " + totalScore);
            displayAnswer4("correct");
        }else{
            totalScore = totalScore + 0;
            displayTotalScore("total score = " + totalScore );
            displayAnswer4("wrong");
        }
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
        TextView totalView = (TextView) findViewById(R.id.totalScore);
        totalView.setText(String.valueOf(total));
    }

}
