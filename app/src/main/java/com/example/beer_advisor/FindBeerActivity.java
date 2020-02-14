package com.example.beer_advisor;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class FindBeerActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private int[] images ={R.drawable.bura, R.drawable.neposlusna, R.drawable.osjecko,
            R.drawable.ozujsko, R.drawable.ozujsko_amber, R.drawable.pan};
    private RecyclerView.LayoutManager layoutManager;

    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
    }

    public void onClickFindBeer(View view){

        TextView brands = findViewById(R.id.brands);
        Spinner color = findViewById(R.id.color);
        String beerType = String.valueOf(color.getSelectedItem());
        brands.setText(beerType);
        List<String> brandsList = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for(String brand : brandsList){
            brandsFormatted.append(brand).append('\n');
        }
        brands.setText(brandsFormatted);


        }
    }

