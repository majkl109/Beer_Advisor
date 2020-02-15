package com.example.beer_advisor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ImageViewHolder> {

    private List<Integer> beerView;
    private List<String> beerName;
    private LayoutInflater bInflater;
    private ItemClickListener bClickListener;


    RecyclerAdapter(Context context,List<Integer> beerView, List<String> beerName){
        this.beerView = beerView;
        this.beerName = beerName;
        this.bInflater = LayoutInflater.from(context);
    }


    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = bInflater.inflate(R.layout.beer_layout,parent,false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {

        int beer = beerView.get(position);
        holder.Album.setImageResource(image_id);
        holder.AlbumTitle.setText("Image: " + position);

    }

    @Override
    public int getItemCount() {
        return images.length;
    }
    public static class ImageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView Album;
        TextView AlbumTitle;

        public ImageViewHolder(View itemView){
            super(itemView);
            Album = itemView.findViewById(R.id.album);
            AlbumTitle = itemView.findViewById(R.id.album_title);
            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View view){
            if(mClickListener != null) mClickListener.onItemClick(view,getAdapterPosition());

        }

    }
}
