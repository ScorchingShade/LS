package com.ankushinc.reddragon.lawsaathi;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Register extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private EditText Password;
    private String email,password;
    private AutoCompleteTextView Email;
    private  String TAG="SignUp";
    private ProgressDialog PD;
    private Button Signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        PD=new ProgressDialog(this);
        PD.setMessage("Registering Now");
        PD.setCancelable(true);
        PD.setCanceledOnTouchOutside(false);


        mAuth = FirebaseAuth.getInstance();
        Email=(AutoCompleteTextView)findViewById(R.id.emailR);
        Password=(EditText)findViewById(R.id.passwordR);
        Signup=(Button)findViewById(R.id.email_sign_up_button);


        if (mAuth.getCurrentUser() != null) {
            startActivity(new Intent(Register.this, Home.class));
            finish();
        }


        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email=Email.getText().toString();
                password=Password.getText().toString();

                try{
                    if(email.length()!=0&&password.length()!=0){
                        PD.show();
                        mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(Register.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (!task.isSuccessful()) {
                                    Toast.makeText(
                                            Register.this,
                                            "Authentication Failed",
                                            Toast.LENGTH_LONG).show();
                                    Log.v("error", task.getResult().toString());
                                } else {
                                    Intent intent = new Intent(Register.this, Home.class);
                                    Toast.makeText(Register.this,"Registered Successfully",Toast.LENGTH_SHORT).show();
                                    startActivity(intent);
                                    finish();
                                }
                                PD.dismiss();
                            }

                        });
                    }else {
                        Toast.makeText(
                                Register.this,
                                "Fill All Fields",
                                Toast.LENGTH_LONG).show();
                    }
                }
                catch (Exception e){
                    e.printStackTrace();
                }

            }
        });

        

    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser);
    }

    private void updateUI(FirebaseUser currentUser) {
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            // Name, email address, and profile photo Url
            String name = user.getDisplayName();
            String email = user.getEmail();
            Uri photoUrl = user.getPhotoUrl();

            // Check if user's email is verified
            boolean emailVerified = user.isEmailVerified();

            // The user's ID, unique to the Firebase project. Do NOT use this value to
            // authenticate with your backend server, if you have one. Use
            // FirebaseUser.getToken() instead.
            String uid = user.getUid();

            Toast.makeText(Register.this,"Welcome "+email,Toast.LENGTH_SHORT).show();
        }

    }
}
