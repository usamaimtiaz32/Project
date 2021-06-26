package com.example.bookhotells;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookhotells.Adapter.RecentsAdapter;
import com.example.bookhotells.Adapter.TopPlaceAdapter;
import com.example.bookhotells.Modal.RecentsData;
import com.example.bookhotells.Modal.TopPlaceData;
import com.example.bookhotells.databinding.ActivitySearchBinding;

import java.util.ArrayList;
import java.util.List;

public class Search extends AppCompatActivity {

ActivitySearchBinding biniding;

    RecyclerView recentRecycler,topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlaceAdapter topPlaceAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
biniding=ActivitySearchBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_search);

        List<RecentsData> recentDataList = new ArrayList<>();
        recentDataList.add(new RecentsData("Naran Valley","Moon Hotel","PKR-2000/-",R.drawable.n));
        recentDataList.add(new RecentsData("Kashmir Valley","Pearl Continental","PKR-3000/-",R.drawable.ka));
        recentDataList.add(new RecentsData("Gilgit Valley","Awari","PKR-4000/-",R.drawable.g));
        recentDataList.add(new RecentsData("Kaghan Valley","Flatties","PKR-7000/-",R.drawable.gi));
        recentDataList.add(new RecentsData("Skardu Valley","Sparko","PKR-6000/-",R.drawable.s));

        setRecentRecycler(recentDataList);

        List<TopPlaceData>topPlaceDataList=new ArrayList<>();
        topPlaceDataList.add(new TopPlaceData("Kashmir Valley","Pearl Hotel","PKR-4000/-",R.drawable.k));
        topPlaceDataList.add(new TopPlaceData("Skardu Valley","Pearl Continental","PKR-14000/-",R.drawable.s));
        topPlaceDataList.add(new TopPlaceData("BabuSar TOP ","Flatties","PKR-8000/-",R.drawable.m));
        topPlaceDataList.add(new TopPlaceData("Muree Valley","Awari","PKR-42000/-",R.drawable.gi));
        topPlaceDataList.add(new TopPlaceData("Gilgit Valley","Sparkel","PKR-43000/-",R.drawable.n));
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


