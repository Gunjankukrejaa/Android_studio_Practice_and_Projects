package com.example.news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class news3 extends AppCompatActivity {
    ImageView imageView_to_news4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news3);
        imageView_to_news4=findViewById(R.id.menu);
        imageView_to_news4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(news3.this, news4.class);
                view.getContext().startActivity(intent);
            }
        });
    }
}