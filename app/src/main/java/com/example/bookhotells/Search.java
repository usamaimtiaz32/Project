package com.example.bookhotells;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookhotells.Adapter.RecentsAdapter;
import com.example.bookhotells.Adapter.TopPlaceAdapter;
import com.example.bookhotells.Modal.RecentsData;
import com.example.bookhotells.Modal.TopPlaceData;

import java.util.ArrayList;
import java.util.List;

public class Search extends AppCompatActivity {
    RecyclerView recentRecycler,topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlaceAdapter topPlaceAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_search);

        List<RecentsData> recentDataList = new ArrayList<>();
        recentDataList.add(new RecentsData("Naran","pakistan","FromS200",R.drawable.des));
        recentDataList.add(new RecentsData("Naran","pakistan","FromS200",R.drawable.dse1));
        recentDataList.add(new RecentsData("Naran","pakistan","FromS200",R.drawable.first));
        recentDataList.add(new RecentsData("Naran","pakistan","FromS200",R.drawable.dse1));
        recentDataList.add(new RecentsData("Naran","pakistan","FromS200",R.drawable.des));

        setRecentRecycler(recentDataList);

        List<TopPlaceData>topPlaceDataList=new ArrayList<>();
        topPlaceDataList.add(new TopPlaceData("sja","ssds","ds",R.drawable.des));
        topPlaceDataList.add(new TopPlaceData("sja","ssds","ds",R.drawable.des));
        topPlaceDataList.add(new TopPlaceData("sja","ssds","ds",R.drawable.des));
        topPlaceDataList.add(new TopPlaceData("sja","ssds","ds",R.drawable.des));
        topPlaceDataList.add(new TopPlaceData("sja","ssds","ds",R.drawable.des));
        setTopPlacesRecycler(topPlaceDataList);


    }



    private void setRecentRecycler(List<RecentsData> recentDataList){
        recentRecycler=(RecyclerView)findViewById(R.id.Recent_recycler);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recentRecycler.setLayoutManager(layoutManager);
         recentsAdapter =new RecentsAdapter(this,recentDataList);
recentRecycler.setAdapter(recentsAdapter);
        }

    private void setTopPlacesRecycler(List<TopPlaceData>topPlaceDataList){

        topPlacesRecycler=findViewById(R.id.Top_places_Recycler);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlaceAdapter =new TopPlaceAdapter(this,topPlaceDataList);
        topPlacesRecycler.setAdapter(topPlaceAdapter );

    }
}


