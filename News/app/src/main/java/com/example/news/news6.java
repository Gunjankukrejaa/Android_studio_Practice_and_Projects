package com.example.news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class news6 extends AppCompatActivity {
    ImageView imageView_to_MainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news6);
        imageView_to_MainActivity=findViewById(R.id.imageview_778);
        imageView_to_MainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(news6.this, MainActivity.class);
                view.getContext().startActivity(intent);
            }
        });
    }
}