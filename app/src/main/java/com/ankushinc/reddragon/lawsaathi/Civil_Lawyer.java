package com.ankushinc.reddragon.lawsaathi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Civil_Lawyer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil__lawyer);

        RecyclerView recyclerView =(RecyclerView)findViewById(R.id.CivilLawyerList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String[] lawyers={"Advocate Kawaljit Kochar",
                "Advocate Menaka Guruswamy",
                "Advocate Madhava Khurana",
                "Advocate Pramod K. Dubey",
                "Advocate Rakesh Kumar Singh",
                "Advocate Madhav Khurana",
                "Senior Advocate Pinky Anand",
                "Senior Advocate P H Parekh",
                "Advocate Sushil Kumar",
                "Advocate Anuradha Dixit",
                "Advocate Meera Bhaitia",
                "Senior Advocate Parag P Tripathi",
                "Advocate Parvinder Chauhan",
                "Advocate Satish tamta",
                "Adl. Solicitor General Rajeeve Mehra",
                "Senior Advocate Jayant Bhushan",
                "M.N. Krishnamani"};
        recyclerView.setAdapter(new CivilLawyerAdapter(lawyers));

    }
}
