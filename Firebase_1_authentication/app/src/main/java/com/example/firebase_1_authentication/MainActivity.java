package com.example.firebase_1_authentication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    //Declaring xml components
    EditText edit_email, edit_password;
    Button button_login;
    FirebaseAuth mFirebaseAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialization of components
        edit_email = findViewById(R.id.edit_email);
        edit_password = findViewById(R.id.edit_password);
        button_login = findViewById(R.id.button);
        mFirebaseAuth = FirebaseAuth.getInstance();


    }

    @Override
    protected void onStart(){
        super.onStart();
        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = edit_email.getText().toString();
                String password = edit_password.getText().toString();
                Toast.makeText(MainActivity.this,"password",Toast.LENGTH_LONG).show();
                 mFirebaseAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                     @Override
                     public void onComplete(@NonNull Task<AuthResult> task) {
                         if (task.isSuccessful()){
                             Toast.makeText(MainActivity.this,"Auth completed successfully with Email and Password",Toast.LENGTH_LONG).show();
                         }else {
                             Toast.makeText(MainActivity.this,"Something went wrong!Check your email and password and try again!!",Toast.LENGTH_LONG).show();
                         }
                     }
                 });

            }
        });
    }
}