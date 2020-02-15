package com.example.beer_advisor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ImageViewHolder> {

    private List<Integer> beerViews;
    private List<String> beerNames;
    private LayoutInflater bInflater;
    private ItemClickListener bClickListener;


    RecyclerAdapter(Context context,List<Integer> beers, List<String> beerNames){
        this.beerViews = beers;
        this.beerNames = beerNames;
        this.bInflater = LayoutInflater.from(context);
    }


    @Override
    @NonNull
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = bInflater.inflate(R.layout.beer_layout,parent,false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {

        int beer = beerViews.get(position);
        String nameOfBeer = beerNames.get(position);
        holder.myImageView.setImageResource(beer);
        holder.myTextView.setText(nameOfBeer);

    }

    @Override
    public int getItemCount() {
        return beerNames.size();
    }
    public class ImageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView myImageView;
        TextView myTextView;

        ImageViewHolder(View itemView){
            super(itemView);
            myImageView = itemView.findViewById(R.id.beer);
            myTextView = itemView.findViewById(R.id.beer_name);
            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View view){
            if(bClickListener != null) bClickListener.onItemClick(view,getAdapterPosition());
         }
        }
        public String getItem(int id){
            return beerNames.get(id);
        }

        public void setClickListener(ItemClickListener itemClickListener){
            this.bClickListener = itemClickListener;
        }

        public interface ItemClickListener{
            void onItemClick(View view, int position);
        }

    }

