package com.example.beer_advisor;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

    public class CaptionedImageAdapter extends
             RecyclerView.Adapter<CaptionedImageAdapter.ViewHolder>{

             private String[] captions;
             private int[] imageIds;

             @Override
             public int getItemCount(){
                 return captions.length;
             }

        public CaptionedImageAdapter(String[] captions, int[] imageIds) {
            this.captions = captions;
            this.imageIds = imageIds;
        }

        public static class ViewHolder extends RecyclerView.ViewHolder{

                 private CardView cardView;

                 public ViewHolder(CardView v){
                     super(v);
                     cardView = v;
                 }

             @Override
            public CaptionedImageAdapter.ViewHolder onCreateViewHolder(
                    ViewGroup parent, int viewType){

                  CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                            .inflate((R.layout.card_captioned_image, parent, false);
                            return  new ViewHolder(cv);
                 }


              }
}
