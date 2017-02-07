package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score;
    int scoreB;
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }
    public void scoreThree(View view){
        score=score+3;
        display(score);
    }
    public void scoreTwo(View view){
        score=score+2;
        display(score);
    }
    public void scoreFreeThrow(View view){
        score=score+1;
        display(score);
    }
    public void scoreThreeB(View view){
        scoreB=scoreB+3;
        displayForTeamB(scoreB);
    }
    public void scoreTwoB(View view){
        scoreB=scoreB+2;
        displayForTeamB(scoreB);
    }
    public void scoreFreeThrowB(View view){
        scoreB=scoreB+1;
        displayForTeamB(scoreB);
    }
    public void reset(View view){
        score = 0;
        scoreB = 0;
        display(score);
        displayForTeamB(scoreB);
    }

    public void display (int number){
        TextView countViewer = (TextView)findViewById(R.id.team_a_score);
        countViewer.setText(""+ number);
    }
}