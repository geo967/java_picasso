package com.example.picasso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.picasso.Cache;
import com.squareup.picasso.Picasso;

import java.net.CookieHandler;

public class MainActivity extends AppCompatActivity {

    String image="https://cdn.pixabay.com/photo/2016/11/04/11/46/robot-1797548_960_720.png";
    String imageFor2="https://cdn.pixabay.com/photo/2014/02/27/16/10/tree-276014_960_720.jpg";
    ImageView image_1,image_2,image_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image_1=findViewById(R.id.image1);
        image_2=findViewById(R.id.image2);
        image_3=findViewById(R.id.image3);
        HttpsTrustManager.allowAllSSL();
        Picasso.get().load(image).resize(20,20).into(image_1);
    }
}