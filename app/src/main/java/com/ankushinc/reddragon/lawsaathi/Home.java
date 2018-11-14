package com.ankushinc.reddragon.lawsaathi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    private GridLayout mainGrid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mainGrid=(GridLayout)findViewById(R.id.mainGrid);

        setSingleEvent(mainGrid);
    }



    public void setMainGrid(GridLayout mainGrid) {
        this.mainGrid = mainGrid;
    }


    public void setSingleEvent(GridLayout singleEvent) {
        for(int i=0;i<mainGrid.getChildCount();i++){
            if(i==0){
                CardView cardView=(CardView)findViewById(R.id.Clawyer);

                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(Home.this,Lawyer.class));

                    }
                });
            }

            else if(i==1){
                CardView cardView=(CardView)findViewById(R.id.Cfirm);

                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(Home.this,Firm.class));

                    }
                });
            }

            else if(i==2){
                CardView cardView=(CardView)findViewById(R.id.CNews);

                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(Home.this,News.class));

                    }
                });
            }

            else if(i==3){
                CardView cardView=(CardView)findViewById(R.id.CAdvice);

                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(Home.this,Advice.class));

                    }
                });
            }
            else {

            }
        }
    }
}
