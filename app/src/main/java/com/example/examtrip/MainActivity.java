package com.example.examtrip;

import static com.example.examtrip.R.drawable.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String places[] = {"Canada","Switzerland","South Korea","Turkey","Italy","Spain","Grece","Thailand","France","Egypt","Dubai","Maldives"};
    int photos[] = {canadaimg,switzerlandimg,southkoreaimg,italyimg,spainimg,greceimg,thailandimg,franceimg,dubaiimg,maldives};
    String Duration[] = {"10 Days","1 Month","2 Month","20 Days","25 Days","1 Month","10 Days","2 Month","15 Days","10 Days","1 Month","25 Days"};
    String Famous[] = {"LandMarks","Mountains","BTS","Air Baloons","Att","The food","Beaches","Dance","Piramid","Efile Tower","Environment"};
    String Food[] = {"Maple Syrup","Swiss cheese","kimchi","Turkish sub","Pasta","Paella","Pork","noodle soup","Onion soup","Koshri","Samboosa","Fish curry"};
    ArrayList<TripModel> modelArrayList = new ArrayList<>();

    RecyclerView rcvList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < places.length; i++) {
            TripModel model = new TripModel(places[i],photos[i],Duration[i],Famous[i],Food[i]);
            modelArrayList.add(model);
        }
        rcvList = findViewById(R.id.rcvList);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        TripAdapter adapter = new TripAdapter(modelArrayList);
        rcvList.setLayoutManager(manager);
        rcvList.setAdapter(adapter);


    }
}