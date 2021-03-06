package com.example.beer_advisor;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class FindBeerActivity extends AppCompatActivity implements RecyclerAdapter.ItemClickListener {

    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Integer> beerView = new ArrayList<>();
        beerView.add(R.drawable.bura);
        beerView.add(R.drawable.neposlusna);
        beerView.add(R.drawable.osjecko);
        beerView.add(R.drawable.ozujsko);
        beerView.add(R.drawable.ozujsko_amber);
        beerView.add(R.drawable.pan);

        ArrayList<String> beerNames = new ArrayList<>();
        beerNames.add("Bura");
        beerNames.add("Neposlusna");
        beerNames.add("Osjecko");
        beerNames.add("Ozujsko");
        beerNames.add("Ozujsko_amber");
        beerNames.add("Pan");

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager verticalLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(verticalLayoutManager);
        adapter = new RecyclerAdapter(this,beerView, beerNames);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }
    @Override
    public void onItemClick(View view, int position){
        Toast.makeText(this, "You clicked " + adapter.getItem(position)
                + " on item position " + position, Toast.LENGTH_SHORT).show();
    }

}


