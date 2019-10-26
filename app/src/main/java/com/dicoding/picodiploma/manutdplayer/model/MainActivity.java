package com.dicoding.picodiploma.manutdplayer.model;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.dicoding.picodiploma.manutdplayer.adapter.ListPlayerAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPlayers;
    private ArrayList<Player> list = new ArrayList<>();
    private String title ="Man United Players";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar abar = getSupportActionBar();
        getSupportActionBar().setTitle(title);
        rvPlayers = findViewById(R.id.rv_players);
        rvPlayers.setHasFixedSize(true);

        list.addAll(PlayersData.getListData());
        showRecyclerView();
    }
    private void showRecyclerView(){
        rvPlayers.setLayoutManager(new LinearLayoutManager(this));
        ListPlayerAdapter listPlayerAdapter = new ListPlayerAdapter(list);
        listPlayerAdapter.setListPlayer(list);
        rvPlayers.setAdapter(listPlayerAdapter);

        ItemClickSupport.addTo(rvPlayers).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedItem(list.get(position));

            }
        });

    }

    private void showSelectedItem (Player player){
        Intent i= new Intent (getBaseContext(),MainActivity2.class);
        i.putExtra("name",player.getName());
        i.putExtra("detail",player.getDetail());
        i.putExtra("photo",player.getPhoto());

        startActivity(i);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem){
        setMenu(menuItem.getItemId());
        return super.onOptionsItemSelected(menuItem);
    }

    public void setMenu(int Mode){
        switch(Mode){
            case R.id.AboutMe:
                Intent pindah = new Intent (MainActivity.this, AboutMe.class);
                startActivity(pindah);
                break;
        }
    }



}
