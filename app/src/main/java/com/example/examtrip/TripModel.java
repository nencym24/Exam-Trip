package com.example.examtrip;

public class TripModel {

    public String places,Duration,Famous,Food;
    public int photos;

    public TripModel(String places,int photos,String Duration,String Famous,String Food){
        this.places = places;
        this.Duration = Duration;
        this.Famous = Famous;
        this.Food = Food;
        this.photos = photos;
    }

}
