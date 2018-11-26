package com.ankushinc.reddragon.lawsaathi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Criminal_Lawyer extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criminal__lawyer);

        RecyclerView recyclerView =(RecyclerView)findViewById(R.id.CriminalLawyerList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String[] lawyers={"Senior Advocate Ram Jethmalani",
                "Senior Advocate K K Venugopal",
                "Advocate Ms. Geeta Luthra",
                "Advocate Vrinda Grover",
                "Senior Advocate K.T.S. Tulsi",
                "Advocate Rajan Narain",
                "Advocate Madhav Khurana",
                "Satish Tamta",
                "Senior Advocate Geeta Luthra",
                "Advocate Amarjeet Singh Chandhiok",
                "Advocate L B Rai",
                "Senior Advocate C.S. Vaidyanathan",
                "Advocate L B Rai",
                "Senior Advocate Siddharth Luthra",
                "Advocate Mohan Parasaran",
                "Advocate Pranay Aggarwala"};
        recyclerView.setAdapter(new CriminalLawyerAdapter(lawyers));
    }
}
