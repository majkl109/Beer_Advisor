package com.example.beer_advisor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<> {

    private int[] images;
    public RecyclerAdapter(int[] images){
        this.images = images;
    }


    @Override
    public Ima.onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext().inflate(R.layout.album_layout,parent))
        ImageViewHolder imageViewHolder = new ImageViewHolder(view);

        return imageViewHolder;
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {

        int image_id = images[position];
        holder.Album.setImageResource(image_id);
        holder.AlbumTitle.setText("Image: " + position);

    }

    @Override
    public int getItemCount() {
        return images.length;
    }
    public static ImageViewHolder extends RecyclerView.ViewHolder{

        ImageView Album;
        TextView AlbumTitle;

        public ImageViewHoler(View itemView){
            super(itemView);
            Album = itemView.findViewById(R.id.album);
            AlbumTitle = itemView.findViewById(R.id.album_title);
        }

    }
}
