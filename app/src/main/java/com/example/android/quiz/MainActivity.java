package com.example.android.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

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
        String isCorrect = getString(R.string.correct);
        String isWrong = getString(R.string.wrong);
        String isSeverus = getString(R.string.severus);
        if (!hasWrongAnswerD & !hasWrongAnswerB & hasCorrectAnswerA & hasCorrectAnswerC) {
            totalScore += 1;
            displayTotalScore("total score = " + totalScore);
            displayAnswer1(isCorrect);
        }else{
            totalScore += 0;
            displayTotalScore("total score = " + totalScore);
            displayAnswer1(isWrong);
        }
        if (hasCorrectAnswer2D) {
            totalScore += 1;
            displayTotalScore("total score = " + totalScore);
            displayAnswer2(isCorrect);
        }
        if (hasWrongAnswer2A) {
            totalScore += 0;
            displayTotalScore("total score = " + totalScore);
            displayAnswer2(isWrong);
        }
        if (hasWrongAnswer2B) {
            totalScore += 0;
            displayTotalScore("total score = " + totalScore);
            displayAnswer2(isWrong);
        }
        if (hasWrongAnswer2C) {
            totalScore += 0;
            displayTotalScore("total score = " + totalScore);
            displayAnswer2(isWrong);
        }
        if (hasCorrectAnswer3) {
            totalScore += 1;
            displayTotalScore("total score = " + totalScore);
            displayAnswer3(isCorrect);
        }
        if (hasWrongAnswer3) {
            totalScore += 0;
            displayTotalScore("total score = " + totalScore);
            displayAnswer3(isWrong);
        }
        if (hascorrectAnswer4.getText().toString().equals(isSeverus)) {
            totalScore += 1;
            displayTotalScore("total score = " + totalScore);
            displayAnswer4(isCorrect);
        } else if (hascorrectAnswer4.getText().toString().equals("")) {
            totalScore += 0;
            displayTotalScore("total score = " + totalScore);
            displayAnswer4("");
        } else {
            totalScore += 0;
            displayTotalScore("total score = " + totalScore);
            displayAnswer4(isWrong);
        }
        Toast.makeText(this,"TOTAL SCORE = " + totalScore, Toast.LENGTH_SHORT).show();
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
