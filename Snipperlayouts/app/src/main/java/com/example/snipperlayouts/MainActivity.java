package com.example.snipperlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinner;
    String[] course_list={"Personal Information","Professional Details","Hobbies and Achievements","Aim"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(MainActivity.this);

        ArrayAdapter arrayAdapter=new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_item,course_list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String Text = spinner.getSelectedItem().toString();
        if(Text.equals("Professional Details")){
            Intent intent=new Intent(MainActivity.this,SecondaryActivity.class);
            startActivity(intent);
        }

        if (Text.equals("Hobbies and Achievements")){
            Intent intent=new Intent(MainActivity.this,ThirdActivity.class);
            startActivity(intent);
        }

        if (Text.equals("Aim")){
            Intent intent=new Intent(MainActivity.this,FourthActivity.class);
            startActivity(intent);
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}