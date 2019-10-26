package com.dicoding.picodiploma.manutdplayer.model;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {
    private String name,detail;
    private String title ="Detail Player";
    private int photo;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main2);
        ActionBar aBar = getSupportActionBar();
        getSupportActionBar().setTitle(title);
        getExtra();
        set();
    }

    private void getExtra() {
        Intent intent = getIntent();
        this.name= intent.getStringExtra("name");
        this.detail=intent.getStringExtra("detail");
        this.photo=intent.getIntExtra("photo",photo);

    }


    private void set() {
        ImageView img = findViewById(R.id.img);
        TextView title = findViewById(R.id.textTitle);
        TextView detail = findViewById(R.id.read);


        title.setText(this.name);
        detail.setText(this.detail);
        img.setImageResource(this.photo);

    }



}
