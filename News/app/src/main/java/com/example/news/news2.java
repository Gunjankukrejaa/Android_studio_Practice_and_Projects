package com.example.news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class news2 extends AppCompatActivity {
    ImageView imageView_to_news3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news2);
        imageView_to_news3=findViewById(R.id.imageview_2);
        imageView_to_news3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(news2.this, news3.class);
                view.getContext().startActivity(intent);
            }
        });
    }
}