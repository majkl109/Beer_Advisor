package com.example.beer_advisor;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    List<String> getBrands(String color){
        List<String> brands = new ArrayList<>();
        if(color.equals("amber")){
            brands.add("Ozujsko Amber");
            brands.add("Neposlusna");
            brands.add("Bura brew amber ale");
        }else{
            brands.add("Osjecko");
            brands.add("Ozujsko");
            brands.add("Pan");
        }
        return brands;
    }
}
