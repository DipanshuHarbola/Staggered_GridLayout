package com.deepanshu.staggered_gridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int placeImage[]= {R.drawable.agattia_airport_lakshadweep,R.drawable.nainital,R.drawable.goa,
            R.drawable.lotus_temple,R.drawable.valley_of_flowers,R.drawable.ranikhet,R.drawable.dehradun,R.drawable.nainital1};

    String placeName[]= {"Lakshadweep, India","Nainital, India","Goa, India","Lotus-Temple, India","Valley-Of-Flowers, India","Ranikhet, India",
    "Dehradun, India","Nainital, India"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView favPlaces = (RecyclerView) findViewById(R.id.favPlaces);

        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        layoutManager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_NONE);
        favPlaces.setLayoutManager(layoutManager);
        favPlaces.setHasFixedSize(true);
        ArrayList<PlaceDetails> placeList = getPlaces();

        StaggeredAdapter staggeredAdapter = new StaggeredAdapter(placeList);
        favPlaces.setAdapter(staggeredAdapter);
    }

    private ArrayList<PlaceDetails> getPlaces() {
        ArrayList<PlaceDetails> details = new ArrayList<>();
        for (int index=0; index<placeImage.length;index++){
            details.add(new PlaceDetails(placeImage[index],placeName[index]));
        }
        return details;
    }
}
