package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public int submitScore(View v) {
        int score = 0;
        EditText name = (EditText) findViewById(R.id.name);
        String name2 = name.getText().toString();
        RadioButton question1 = (RadioButton) findViewById(R.id.question1);
        if (question1.isChecked()) {
            score = score + 1;
        }
        RadioButton question2 = (RadioButton) findViewById(R.id.question2);
        if (question2.isChecked()) {
            score = score + 1;
        }
        RadioButton question3 = (RadioButton) findViewById(R.id.question3);
        if (question3.isChecked()) {
            score = score + 1;
        }
        RadioButton question4 = (RadioButton) findViewById(R.id.question4);
        if (question4.isChecked()) {
            score = score + 1;
        }
        RadioButton question5 = (RadioButton) findViewById(R.id.question5);
        if (question5.isChecked()) {
            score = score + 1;
        }
        RadioButton question6 = (RadioButton) findViewById(R.id.question6);
        if (question6.isChecked()) {
            score = score + 1;
        }
        RadioButton question7 = (RadioButton) findViewById(R.id.question7);
        if (question7.isChecked()) {
            score = score + 1;
        }
        RadioButton question8 = (RadioButton) findViewById(R.id.question8);
        if (question8.isChecked()) {
            score = score + 1;
        }
        RadioButton question9 = (RadioButton) findViewById(R.id.question9);
        if (question9.isChecked()) {
            score = score + 1;
        }
        RadioButton question10 = (RadioButton) findViewById(R.id.question10);
        if (question10.isChecked()) {
            score = score + 1;
        }
        Toast toast = Toast.makeText(getApplicationContext(), "Great job " + name2 + ", you got " + score + "/10!", Toast.LENGTH_SHORT);
        toast.show();
        return score;
    }
}

