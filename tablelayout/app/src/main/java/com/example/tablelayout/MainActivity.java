package com.example.tablelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button mButton;
    EditText mEdit;
    EditText mEdit1;
    EditText mEdit2;
    EditText mEdit3;
    EditText mEdit4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton=(Button)findViewById(R.id.button);
        mEdit=(EditText)findViewById(R.id.edittext_1);
        mEdit1=(EditText)findViewById(R.id.edittext_2);
        mEdit2=(EditText)findViewById(R.id.edittext_3);
        mEdit3=(EditText)findViewById(R.id.edittext_4);
        mEdit4=(EditText)findViewById(R.id.edittext_5);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String f_mEdit = mEdit.getText().toString();
                String f_mEdit1 = mEdit1.getText().toString();
                String f_mEdit2 = mEdit2.getText().toString();
                String f_mEdit3 = mEdit3.getText().toString();
                String f_mEdit4 = mEdit4.getText().toString();
                String res = " First Name: "+f_mEdit+"\n Last Name: "+f_mEdit1+"\n Contact number: "+f_mEdit2+"\n Address: "+f_mEdit3+"\n Fathers Name:  "+f_mEdit4;
                Toast.makeText(MainActivity.this,res,Toast.LENGTH_LONG).show();
            }
        });
    }
}