package com.ankushinc.reddragon.lawsaathi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

public class Lawyer extends AppCompatActivity {

    GridLayout mainGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lawyer);

        mainGrid=(GridLayout)findViewById(R.id.mainGridLawyer);
        setSingleEvent(mainGrid);
    }

    public void setMainGrid(GridLayout mainGrid) {
        this.mainGrid = mainGrid;
    }

    public void setSingleEvent(GridLayout singleEvent) {
        for(int i=0;i<mainGrid.getChildCount();i++){
            if(i==0){
                CardView cardView=(CardView)findViewById(R.id.Criminallawyer);

                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(Lawyer.this,Criminal_Lawyer.class));

                    }
                });
            }

            else if(i==1){
                CardView cardView=(CardView)findViewById(R.id.Civillawyer);

                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(Lawyer.this,Civil_Lawyer.class));

                    }
                });
            }


        }
    }

}
