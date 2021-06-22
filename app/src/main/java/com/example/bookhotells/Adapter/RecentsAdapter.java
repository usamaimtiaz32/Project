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
import com.example.bookhotells.Modal.RecentsData;
import com.example.bookhotells.R;

import java.util.List;

public class RecentsAdapter extends RecyclerView.Adapter<RecentsAdapter.RecyclerViewHolder> {
    Context context;
    List<RecentsData>recentDataList;

    public RecentsAdapter(Context context, List<RecentsData> recentDataList) {
        this.context = context;
        this.recentDataList = recentDataList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recents_row,parent,false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.countryName.setText(recentDataList.get(position).getCountryName());
        holder.placeName.setText(recentDataList.get(position).getPlace());
        holder.price.setText(recentDataList.get(position).getPrice());
        holder.placeImage.setImageResource(recentDataList.get(position).getImageUrl());
        Glide.with(context).load(recentDataList.get(position).getImageUrl()).into(holder.placeImage);


        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(context, Details.class);

                i.putExtra("Place",recentDataList.get(position).getPlace());
                i.putExtra("Price",recentDataList.get(position).getPrice());
            context.startActivity(i);
            }


        });

    }



    @Override
    public int getItemCount() {
        return recentDataList.size();
    }


    public static final class RecyclerViewHolder extends RecyclerView.ViewHolder{
        ImageView placeImage;
        TextView placeName,countryName,price;
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            placeImage=(ImageView) itemView.findViewById(R.id.place_image);
            placeName=(TextView) itemView.findViewById(R.id.placeName);

            countryName=(TextView)itemView.findViewById(R.id.countrtyName);
            price=(TextView)itemView.findViewById(R.id.price);

        }
    }
}


