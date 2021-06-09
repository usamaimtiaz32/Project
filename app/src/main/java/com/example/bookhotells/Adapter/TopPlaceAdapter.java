package com.example.bookhotells.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookhotells.Modal.TopPlaceData;
import com.example.bookhotells.R;

import java.util.List;

public class TopPlaceAdapter extends RecyclerView.Adapter<TopPlaceAdapter.TopPlaceViewHolder> {
    Context context;
    List<TopPlaceData>TopPlacesDataList;


    public TopPlaceAdapter(Context context, List<TopPlaceData> topPlacesDataList) {
        this.context = context;
        TopPlacesDataList = topPlacesDataList;
    }

    @NonNull
    @Override
    public TopPlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recents_places,parent,false);
        return new TopPlaceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopPlaceViewHolder holder, int position) {

        holder.countryName.setText(TopPlacesDataList.get(position).getCountryName());
        holder.placeName.setText(TopPlacesDataList.get(position).getPlace());
        holder.price.setText(TopPlacesDataList.get(position).getPrice());
        holder.placeImage.setImageResource(TopPlacesDataList.get(position).getImageUrl());
    }

    @Override
    public int getItemCount() {
        return TopPlacesDataList.size();
    }


    public static final class TopPlaceViewHolder extends RecyclerView.ViewHolder{
        ImageView placeImage;
        TextView placeName,countryName,price;



        public TopPlaceViewHolder(@NonNull View itemView) {
            super(itemView);

            placeImage=(ImageView) itemView.findViewById(R.id.place_image);
            placeName=(TextView) itemView.findViewById(R.id.placeName);
            countryName=(TextView)itemView.findViewById(R.id.countrtyName);
            price=(TextView)itemView.findViewById(R.id.price);

        }
    }
}


