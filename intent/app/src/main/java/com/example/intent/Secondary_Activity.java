package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Secondary_Activity extends AppCompatActivity {
    Button button_to_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        button_to_main=findViewById(R.id.button_2_activity_2);
        button_to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Secondary_Activity.this, MainActivity.class);
                view.getContext().startActivity(intent);
            }
        });
    }
}