package com.example.news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class news4 extends AppCompatActivity {
    ImageView imageView_to_news5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news4);
        imageView_to_news5=findViewById(R.id.menu_1);
        imageView_to_news5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(news4.this, news5.class);
                view.getContext().startActivity(intent);
            }
        });
    }
}