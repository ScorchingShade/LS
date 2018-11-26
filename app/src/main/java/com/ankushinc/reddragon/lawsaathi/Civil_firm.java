package com.ankushinc.reddragon.lawsaathi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.GridLayout;

public class Civil_firm extends AppCompatActivity {
    private GridLayout mainGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_firm);
        RecyclerView recyclerView =(RecyclerView)findViewById(R.id.CivilFirmList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String[] firms={"ALMT Legal",
                "Amarchand Mangaldas & Suresh & Shroff & Co.",
                "Dua Associates",
                "JSA",
                "Khaitan and Co.",
                "Kochhar & Co.",
                "Luthra and Luthra",
                "S & R Associates",
                "Singhania & Partners",
                "Advani and Co.",
                "APJ SLG Law Offices",
                "Bhasin & Co",
                "Brus Chambers",
                "BSK Legal",
                "Clasis Law",
                "DH Law Associates" ,
                "Enviro Legal Defence Firm (ELDF)" ,
                "Dutt Menon and Dunmorrsett" ,
                "Indo Juris" ,
                "International Trade Law Consultants" ,
                "Kachwaha & Partners" ,
                "Kaden Boriss" ,
                "Karanjawala & Co" ,
                "Khaitan & Partners" ,
                "Khaitan Sud and Partners" ,
                "Lakshmikumaran & Sridharan" ,
                "Majmudar & Partners" ,
                "O.P Khaitan" ,
                "Paras Kuhad and Associates" ,
                "Phoenix Legal" ,
                "AZB" ,
                "DSK Legal" ,
                "Kochhar and Co." ,
                "Nishith Desai Associates" ,
                "Krishna and Saurastri" ,
                "Bharucha & Partners" ,
                "Rajani Associates" ,
                "Vaish Law Associates" ,
                "Little and Company" ,
                "Khaitan and Co." ,
                "Singhania & Partners" ,
                "Gandhi and Associates"};
        recyclerView.setAdapter(new CivilFirmAdapter(firms));




    }


}
