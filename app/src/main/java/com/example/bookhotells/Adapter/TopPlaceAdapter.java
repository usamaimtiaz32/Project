package com.example.bookhotells.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.bookhotells.Details;
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
        Glide.with(context).load(TopPlacesDataList.get(position).getImageUrl()).into(holder.placeImage);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, Details.class);

                i.putExtra("Place", TopPlacesDataList.get(position).getPlace());

                i.putExtra("Price", TopPlacesDataList.get(position).getPrice());
                context.startActivity(i);
            }


        });
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


