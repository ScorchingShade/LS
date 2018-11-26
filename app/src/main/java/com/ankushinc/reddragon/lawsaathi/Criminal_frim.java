package com.ankushinc.reddragon.lawsaathi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Criminal_frim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criminal_frim);

        RecyclerView recyclerView =(RecyclerView)findViewById(R.id.CriminalFirmList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String[] firms={"Krishan and Saurastri Associates" ,
                "Crawford Bayley & Co" ,
                "ARA Law" ,
                "Advani and Co." ,
                "Oasis Counsel and Advisory" ,
                "Solomon & Company Advocates and Solicitors" ,
                "Wadia Ghandy & Co." ,
                "Deven Dwarkadas & Partners" ,
                "Hariani & Co" ,
                "Fortitude Law" ,
                "Neolegal Associates" ,
                "ALMT Legal" ,
                "Bose & Mitra & Co" ,
                " Dua Associates" ,
                "Kochhar and Co." ,
                "Lex Apoheke" ,
                "LR Swami Company" ,
                "Selvam and Selvam" ,
                "Universal Legal" ,
                "Atman Law Partners" ,
                "Anup S. Shah Law Firm" ,
                "Holla Associates" ,
                "Indus Law" ,
                "Just Law" ,
                "Jyoti Sagar Associates" ,
                "K & S Partners" ,
                "K Law" ,
                "King and Patridge" ,
                "Krishna and Saurastri" ,
                "Lakshmikumaran & Sridharan" ,
                "Lega Appex" ,
                "LegalExcel, Advocates and Solicitors" ,
                "Link Legal Advocates" ,
                "Mento Associates" ,
                "MMB Legal" ,
                "NDS Law Partners" ,
                "Singhania and Co. LLP" ,
                "Tatva Legal" ,
                "Thiru and Thiru" ,
                "Trilegal" ,
                "Udwadia Udeshi and Argus Partners" ,
                "Wadia Ghandy & Co."};
        recyclerView.setAdapter(new CriminalFirmAdapter(firms));
    }

}
