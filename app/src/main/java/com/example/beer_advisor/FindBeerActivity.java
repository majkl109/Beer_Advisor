package com.example.beer_advisor;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;




public class FindBeerActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private int[] images ={R.drawable.bura, R.drawable.neposlusna, R.drawable.osjecko,
            R.drawable.ozujsko, R.drawable.ozujsko_amber, R.drawable.pan};
    private RecyclerAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerAdapter(images);
        recyclerView.setAdapter(adapter);
    }


}


