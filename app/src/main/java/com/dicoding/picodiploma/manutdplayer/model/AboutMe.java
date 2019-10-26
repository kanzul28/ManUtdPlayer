package com.dicoding.picodiploma.manutdplayer.model;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
public class AboutMe extends AppCompatActivity {
    String title = "About Me";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        ActionBar abar = getSupportActionBar();
        getSupportActionBar().setTitle(title);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem){
        setMode(menuItem.getItemId());
        return super.onOptionsItemSelected(menuItem);
    }

    public void setMode(int Mode){
        switch (Mode){


            case R.id.AboutMe:
                break;
            case R.id.ListPlayers:
                Intent pindah = new Intent(AboutMe.this, MainActivity.class);
                startActivity(pindah);
                break;
        }





    }
}
