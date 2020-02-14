package com.example.beer_advisor;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter {


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public static ImageViewHolder extends RecyclerView.ViewHolder{

        ImageView Album;
        TextView AlbumTitle;

        public ImageViewHoler(View itemView){
            super(itemView);
            Album = itemView.
        }

    }
}
