package com.example.hp.alphabet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 8/23/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>{
    private SoundPool soundPool;
    private ArrayList<Integer> arrayList;
    Context context;
    private List<Image> imageList;
    //
    public MyAdapter(Context context, List<Image> imageList) {
        this.context = context;
        this.imageList = imageList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_on_list,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.getImageView().setImageResource(imageList.get(position).getIdImage());
        holder.getImageView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayList = new ArrayList<>();
                soundPool = new SoundPool(1, AudioManager.STREAM_MUSIC,1);
                arrayList.add(soundPool.load(context,R.raw.sound_0,1));
                arrayList.add(soundPool.load(context,R.raw.sound_1,1));
                arrayList.add(soundPool.load(context,R.raw.sound_2,1));
                arrayList.add(soundPool.load(context,R.raw.sound_3,1));
                Log.d("thao dep trai", "ahiii ");
                soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
                    @Override
                    public void onLoadComplete(SoundPool soundPool, int i, int i1) {
                        soundPool.play(arrayList.get(imageList.get(position).getIdSound()),1.0f,1.0f,1,1,1.0f);
                    }
                });
            }
        });

    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }
}
