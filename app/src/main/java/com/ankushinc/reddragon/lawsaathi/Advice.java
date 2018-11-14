package com.ankushinc.reddragon.lawsaathi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Advice extends AppCompatActivity {

    private Button mailer;
    private EditText mailID,query;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advice);

        mailer=(Button)findViewById(R.id.mailA);

        mailer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMail();
            }
        });

    }

    private void sendMail() {
        mailID=(EditText)findViewById(R.id.mailID);
        query=(EditText)findViewById(R.id.query);

        String Query=query.getText().toString();
        String ClientMailID=mailID.getText().toString();

        Intent emailIntent=new Intent(Intent.ACTION_SEND);
    emailIntent.setType("text/plain");
        String[] TO = {"divyasamriti11@gmail.com"};
        String[] CC = {"ankushors789@gmail.com"};
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Law Saathi query");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "The query -- \n"+Query+" \n by "+ClientMailID);

        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            Toast.makeText(Advice.this,"Taking you to your mailing client now...Please chose a client.",Toast.LENGTH_LONG).show();
            }
            catch (android.content.ActivityNotFoundException ex){
                Toast.makeText(Advice.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
            }

    }
}
