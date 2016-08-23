package com.example.hp.alphabet;

import android.app.Application;
import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by HP on 8/23/2016.
 */
public class Media  {
    private Context context;
    private SoundPool soundPool;
    private ArrayList<Integer> arrayList;
    //
    public Media(Context context) {
        this.context = context;
        init();
    }

    private void init(){
        arrayList = new ArrayList<>();
        soundPool = new SoundPool(1, AudioManager.STREAM_MUSIC,1);
        arrayList.add(soundPool.load(context,R.raw.sound_0,1));
        arrayList.add(soundPool.load(context,R.raw.sound_1,1));
        arrayList.add(soundPool.load(context,R.raw.sound_2,1));
        arrayList.add(soundPool.load(context,R.raw.sound_3,1));
        Log.d("thao dep trai", "ahiii ");
        soundPool.play(arrayList.get(0),1.0f,1.0f,1,1,1.0f);
        Toast.makeText(context, "thao dep trai", Toast.LENGTH_SHORT).show();
    }
}
