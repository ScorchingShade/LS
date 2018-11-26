package com.ankushinc.reddragon.lawsaathi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

public class Firm extends AppCompatActivity {

    GridLayout mainGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firm);

        mainGrid=(GridLayout)findViewById(R.id.mainGridFirm);
        setSingleEvent(mainGrid);
    }


    public void setMainGrid(GridLayout mainGrid) {
        this.mainGrid = mainGrid;
    }

    public void setSingleEvent(GridLayout singleEvent) {
        for(int i=0;i<mainGrid.getChildCount();i++){
            if(i==0){
                CardView cardView=(CardView)findViewById(R.id.Criminallawyerfirm);

                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(Firm.this,Criminal_frim.class));

                    }
                });
            }

            else if(i==1){
                CardView cardView=(CardView)findViewById(R.id.Civillawyerfirm);

                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(Firm.this,Civil_firm.class));

                    }
                });
            }


        }
    }
}
