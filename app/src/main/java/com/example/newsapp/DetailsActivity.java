package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.newsapp.Models.NewsHeadlines;
import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {
    NewsHeadlines headlines;
    TextView tv_title, tv_author, tv_time, tv_detail, tv_content;
    ImageView img_news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        tv_title = findViewById(R.id.tv_detail_title);
        tv_author = findViewById(R.id.tv_detail_author);
        tv_time = findViewById(R.id.tv_detail_time);
        tv_detail = findViewById(R.id.tv_detail_detail);
        tv_content = findViewById(R.id.tv_detail_content);
        img_news = findViewById(R.id.img_detail_news);

        headlines = (NewsHeadlines) getIntent().getSerializableExtra("data");

        tv_title.setText(headlines.getTitle());
        tv_author.setText(headlines.getAuthor());
        tv_time.setText(headlines.getPublishedAt());
        tv_detail.setText(headlines.getDescription());
        tv_content.setText(headlines.getContent());
        Picasso.get().load(headlines.getUrlToImage()).into(img_news);
    }
}