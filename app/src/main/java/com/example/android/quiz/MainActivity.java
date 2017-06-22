package com.example.android.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.quiz.R.id.answer4;
import static com.example.android.quiz.R.id.correctAnswer4;
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
        RadioButton correctAnswer2DCheckbox = (RadioButton) findViewById(R.id.correctAnswer2D);
        boolean hasCorrectAnswer2D = correctAnswer2DCheckbox.isChecked();
        RadioButton correctAnswer3Checkbox = (RadioButton) findViewById(R.id.correctAnswer3);
        boolean hasCorrectAnswer3 = correctAnswer3Checkbox.isChecked();
        EditText answer4 = (EditText) findViewById(correctAnswer4);
        String Correct = getString(R.string.correct);
        String Wrong = getString(R.string.wrong);
        if (!hasWrongAnswerD & !hasWrongAnswerB & hasCorrectAnswerA & hasCorrectAnswerC) {
            totalScore += 1;
            displayAnswer1(Correct);
        }else{
            displayAnswer1(Wrong);
        }
        if (hasCorrectAnswer2D) {
            totalScore += 1;
            displayAnswer2(Correct);
        }else {
            displayAnswer2(Wrong);
        }
        if (hasCorrectAnswer3) {
            totalScore += 1;
            displayAnswer3(Correct);
        }else{
            displayAnswer3(Wrong);
        }
        if (answer4.getText().toString().equals(getString(R.string.severus))) {
            totalScore += 1;
            displayAnswer4(Correct);
        } else {
            displayAnswer4(Wrong);
        }
        displayTotalScore((getString(R.string.total)) +  totalScore);
        Toast.makeText(this,(getString(R.string.total)) +  totalScore, Toast.LENGTH_SHORT).show();
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
        TextView answerView4 = (TextView) findViewById(answer4);
        answerView4.setText(String.valueOf(answer));
    }

    public void displayTotalScore(String total) {
        TextView totalView = (TextView) findViewById(totalScore);
        totalView.setText(String.valueOf(total));
    }

}
