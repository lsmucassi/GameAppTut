package com.exmplem.android.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /** declaring and initializing scores for team A & B **/
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /** calling methods to display the scores for team A and team B **/
        displayTeamA(scoreTeamA);
        displayTeamB(scoreTeamB);
    }

    /** display method for team A**/
    public void displayTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /** display method for Team B **/
    public void displayTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /** calculating and adding points for teams **/

    /** team A work
     * 3 points - A
     * **/
    public void addThreeForTeamA(View v){
       scoreTeamA = scoreTeamA + 3;
        displayTeamA(scoreTeamA);
    }

    /** team A work
     * 2 points - A
     * **/
    public void addTwoForTeamA(View v){
        scoreTeamA = scoreTeamA + 2 ;
        displayTeamA(scoreTeamA);
    }

    /** team A work
     * 1 point(free throw - A
     * **/
    public void addOneForTeamA(View v){
        scoreTeamA = scoreTeamA + 1;
        displayTeamA(scoreTeamA);
    }

    /** teem B work**/
    /** team A work
     * 3 points - B
     * **/
    public void addThreeForTeamB(View v){
        scoreTeamB = scoreTeamB + 3;
        displayTeamB(scoreTeamB);
    }

    /** team A work
     * 2 points - B
     * **/
    public void addTwoForTeamB(View v){
        scoreTeamB = scoreTeamB + 2 ;
        displayTeamB(scoreTeamB);
    }

    /** team A work
     * 1 points - B
     * **/
    public void addOneForTeamB(View v){
        scoreTeamB = scoreTeamB + 1;
        displayTeamB(scoreTeamB);
    }

    /** Reset button for the programme **/
    public void resetButton(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;

        displayTeamA(scoreTeamA);
        displayTeamB(scoreTeamB);

    }

}
