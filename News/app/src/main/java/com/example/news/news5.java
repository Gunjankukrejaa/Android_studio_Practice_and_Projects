package com.example.news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class news5 extends AppCompatActivity {
    ImageView imageView_to_news6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news5);
        imageView_to_news6=findViewById(R.id.menu_26);
        imageView_to_news6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(news5.this, news6.class);
                view.getContext().startActivity(intent);
            }
        });
    }
}