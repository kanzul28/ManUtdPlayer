package com.dicoding.picodiploma.manutdplayer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding.picodiploma.manutdplayer.model.Player;
import com.dicoding.picodiploma.manutdplayer.model.R;

import java.util.ArrayList;
import java.util.List;

public class ListPlayerAdapter extends RecyclerView.Adapter<ListPlayerAdapter.ListViewHolder>{

    private ArrayList<Player> listPlayer;


    public void setListPlayer(ArrayList<Player> listPlayer) {
        this.listPlayer = listPlayer;
    }

    public ListPlayerAdapter(ArrayList<Player> list) {
        this.listPlayer = list;
    }

    @NonNull
    @Override
    public ListPlayerAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup , int viewType) {

        View view  = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_player,viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Player player = listPlayer.get(position);
        Glide.with(holder.itemView.getContext())
                .load(player.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(player.getName());
        holder.tvDetail.setText(player.getDetail());

    }

    @Override
    public int getItemCount() {
        return listPlayer.size();
    }


    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
