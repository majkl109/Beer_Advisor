package com.example.beer_advisor;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
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

            @Override
            public void onBindViewHolder(ViewHolder holder, int position) {
                CardView cardView = holder.cardView;
                ImageView imageView = (ImageView)cardView.findViewById(R.id.info_image);
                Drawable drawable = ContextCompat.getDrawable(cardView.getContext(),imageIds[position]);
                imageView.setImageDrawable();
                imageView.setContentDescription(captions[position]);
                TextView textView = (TextView) cardView.findViewById(R.id.info_text);
                textView.setText(captions[position]);
            }
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
