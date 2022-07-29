package com.example.messagepassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText fullname;
    EditText contactno;
    EditText address;
    EditText bloodgroup;
    EditText collegename;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fullname = findViewById(R.id.edittext1);
        contactno = findViewById(R.id.edittext2);
        address = findViewById(R.id.edittext3);
        bloodgroup = findViewById(R.id.edittext4);
        collegename = findViewById(R.id.edittext5);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fun();
            }
        });
    }
    public void fun(){
        //Here intent is used for data passing or message passing
        Intent intent = new Intent(MainActivity.this,MessagePassing2.class);
        String data = fullname.getText().toString();
        String data1 = contactno.getText().toString();
        String data2 = address.getText().toString();
        String data3 = bloodgroup.getText().toString();
        String data4 = collegename.getText().toString();

        intent.putExtra("Full Name",data);
        intent.putExtra("Contact Number",data1);
        intent.putExtra("Address",data2);
        intent.putExtra("Blood Group",data3);
        intent.putExtra("College name",data4);

        startActivity(intent);
    }
}