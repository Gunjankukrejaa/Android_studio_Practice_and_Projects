package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button normal_button;
    ImageButton image_button;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        normal_button=findViewById(R.id.normal_button);
        image_button=findViewById(R.id.image_button);
        textview=findViewById(R.id.textview);

        normal_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Button Clicked By User", Toast.LENGTH_LONG).show();
            }
        });

        image_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Image Button clicked by user", Toast.LENGTH_LONG).show();
            }
        });

        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "textview clicked by user", Toast.LENGTH_LONG).show();
            }
        });
    }
}