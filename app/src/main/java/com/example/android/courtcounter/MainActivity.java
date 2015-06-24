package com.example.android.courtcounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase score for Team A
     */

    public void threePointsTeamA(View view) {
        scoreTeamA += 3;
        displayPointsTeamA();
    }

    public void twoPointsTeamA(View view) {
        scoreTeamA += 2;
        displayPointsTeamA();
    }

    public void freeThrowTeamA(View view) {
        scoreTeamA += 1;
        displayPointsTeamA();
    }

    /**
     * Increase score for Team B
     */

    public void threePointsTeamB(View view) {
        scoreTeamB += 3;
        displayPointsTeamB();
    }

    public void twoPointsTeamB(View view) {
        scoreTeamB += 2;
        displayPointsTeamB();
    }

    public void freeThrowTeamB(View view) {
        scoreTeamB += 1;
        displayPointsTeamB();
    }

    /**
     * Display Scores
     */

    public void displayPointsTeamA() {
        TextView tvScore = (TextView) findViewById(R.id.scoreA);
        tvScore.setText(scoreTeamA + "");
    }

    public void displayPointsTeamB() {
        TextView tvScore = (TextView) findViewById(R.id.scoreB);
        tvScore.setText(scoreTeamB + "");
    }

    /**
     * Reset scores for TeamA and TeamB
     */

    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayPointsTeamA();
        displayPointsTeamB();
    }
}
