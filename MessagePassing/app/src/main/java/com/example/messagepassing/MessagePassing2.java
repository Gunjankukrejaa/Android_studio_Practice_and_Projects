package com.example.messagepassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MessagePassing2 extends AppCompatActivity {

    TextView textView;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_passing2);

        textView = findViewById(R.id.textview7);
        textView1 = findViewById(R.id.textview8);
        textView2 = findViewById(R.id.textview9);
        textView3 = findViewById(R.id.textview10);
        textView4 = findViewById(R.id.textview11);

        Intent intent = getIntent();
        String data = intent.getStringExtra("Full Name").toString();
        String data1 = intent.getStringExtra("Contact Number").toString();
        String data2 = intent.getStringExtra("Address").toString();
        String data3 = intent.getStringExtra("Blood group").toString();
        String data4 = intent.getStringExtra("College Name").toString();

        textView.setText(data);
        textView1.setText(data1);
        textView2.setText(data2);
        textView3.setText(data3);
        textView4.setText(data4);
    }
}