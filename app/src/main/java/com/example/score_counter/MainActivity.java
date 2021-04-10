package com.example.score_counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int a=0,b=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add3();
        add2();
        add1();
        add03();
        add02();
        add01();
    }
    public void add3(){
        final Button but= (Button) findViewById(R.id.b1);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                a = a + 3;
                displayForTeamA(a);
            }
        });
    }
    public void add2() {
        final Button but = (Button) findViewById(R.id.b2);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                a = a + 2;
                displayForTeamA(a);
            }
        });
    }
    public void add1() {
        final Button but = (Button) findViewById(R.id.b3);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                a = a + 1;
                displayForTeamA(a);
            }
        });
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(""+score);
    }
    public void add03(){
        final Button but= (Button) findViewById(R.id.b4);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                b = b + 3;
                displayForTeamB(b);
            }
        });
    }
    public void add02() {
        final Button but = (Button) findViewById(R.id.b5);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                b = b + 2;
                displayForTeamB(b);
            }
        });
    }
    public void add01() {
        final Button but = (Button) findViewById(R.id.b6);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                b = b + 1;
                displayForTeamB(b);
            }
        });
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(""+score);
    }

}
