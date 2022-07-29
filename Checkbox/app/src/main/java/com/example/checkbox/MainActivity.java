package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox ch1,ch2,ch3,ch4;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //For finding checkbox with its id
        ch1 = findViewById(R.id.checkbox1);
        ch2 = findViewById(R.id.checkbox2);
        ch3 = findViewById(R.id.checkbox3);
        ch4 = findViewById(R.id.checkbox4);

        //For finding button with its id
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //For showing msg after clicking on button
                String msg = " ";
                if (ch1.isChecked())
                    msg = msg + "\nNature";
                if (ch2.isChecked())
                    msg = msg + "\nSolving Rubix cube";
                if (ch3.isChecked())
                    msg = msg + "\nDogs";
                if (ch4.isChecked())
                    msg = msg + "\nFighting with sibling";

                //for toast
                Toast.makeText(MainActivity.this,msg + "are selected",Toast.LENGTH_LONG).show();
            }
        });
    }
}