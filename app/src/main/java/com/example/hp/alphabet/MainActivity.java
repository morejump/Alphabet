package com.example.hp.alphabet;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<Image> list;
    private int[] arrayDrawble={R.drawable.upper_0,R.drawable.upper_1,R.drawable.upper_2,R.drawable.upper_3,R.drawable.upper_4,R.drawable.upper_5,R.drawable.upper_6,R.drawable.upper_7};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    //
    private void init(){
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        list= new ArrayList<>();
        //
        for (int i=0;i<5;i++){
            int a= arrayDrawble[i];
            list.add(new Image(a,i));
        }
        adapter = new MyAdapter(this,list);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

}
