package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0, teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threePointsTeamA(View view){
        teamAScore = teamAScore + 3;
        displayForTeamA(teamAScore);
    }

    public void twoPointsTeamA(View view){
        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);
    }

    public void freeThrowTeamA(View view){
        teamAScore = teamAScore + 1;
        displayForTeamA(teamAScore);
    }

    public void threeePointsTeamB(View view){
        teamBScore = teamBScore + 3;
        displayForTeamB(teamBScore);
    }

    public void  twoPointsTeamB(View view){
        teamBScore = teamBScore + 2;
        displayForTeamB(teamBScore);
    }

    public void freeThrowTeamB(View view){
        teamBScore = teamBScore + 1;
        displayForTeamB(teamBScore);
    }

    public void decideWinner(View view){
        String winner;
        if(teamAScore>teamBScore)
            winner = "TEAM A";
        else if(teamAScore<teamBScore)
            winner = "TEAM B";
        else
            winner = "TIE";
        displayWinner(winner);
    }

    public void displayWinner(String winner){
        TextView winnerView = (TextView) findViewById(R.id.winner_text_view);
        winnerView.setText(winner);
    }

    public void reset(View view){
        teamAScore = 0;
        teamBScore = 0;
        String winner = "";
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
        displayWinner(winner);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(""+score);
    }
}