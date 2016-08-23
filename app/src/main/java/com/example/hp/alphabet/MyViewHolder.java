package com.example.hp.alphabet;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by HP on 8/23/2016.
 */
public class MyViewHolder extends  RecyclerView.ViewHolder{
    private ImageView imageView;

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public MyViewHolder(View itemView) {
        super(itemView);
        imageView= (ImageView) itemView.findViewById(R.id.img_Letter);

    }
}
