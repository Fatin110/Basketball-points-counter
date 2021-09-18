package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ScoreTeamA = 0;
    int ScoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

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

    public void threeMethodA(View view) {
        ScoreTeamA += 3;
        displayForTeamA(ScoreTeamA);
    }

    public void twoMethodA(View view) {
        ScoreTeamA += 2;
        displayForTeamA(ScoreTeamA);
    }

    public void freeThrowA(View view) {
        ScoreTeamA += 1;
        displayForTeamA(ScoreTeamA);
    }

    public void threeMethodB(View view) {
        ScoreTeamB += 3;
        displayForTeamB(ScoreTeamB);
    }

    public void twoMethodB(View view) {
        ScoreTeamB += 2;
        displayForTeamB(ScoreTeamB);
    }

    public void freeThrowB(View view) {
        ScoreTeamB += 1;
        displayForTeamB(ScoreTeamB);
    }

    public void resetMethod(View view){
        ScoreTeamA = 0;
        ScoreTeamB = 0;
        displayForTeamA(ScoreTeamA);
        displayForTeamB(ScoreTeamB);
    }
}