package com.example.beer_advisor;

public class Beer {

    public static final Beer[] beers = {
            new Beer("Osjecko", R.drawable.osjecko),
            new Beer("Ozujsko", R.drawable.osjecko),
            new Beer("Pan", R.drawable.pan),
            new Beer("Neposlusna", R.drawable.neposlusna),
            new Beer("Ozujsko Amber", R.drawable.ozujsko_amber)
    };

    public Beer(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName(){
        return name;
    }
     public int getImageResourceId(){
        return imageResourceId;
    }

}
