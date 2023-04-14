package com.example.examtrip;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TripAdapter extends RecyclerView.Adapter<TripAdapter.TripHolder>{

    ArrayList<TripModel> modelArrayList;
    Context context;
    public TripAdapter(ArrayList<TripModel> modelArrayList) {
        this.modelArrayList = modelArrayList;
    }

    @NonNull
    @Override
    public TripHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new TripHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TripHolder holder, int position) {

        holder.txtname.setText(modelArrayList.get(position).places);
        holder.image.setImageResource(modelArrayList.get(position).photos);
        holder.txtDuration.setText(modelArrayList.get(position).Duration);
        holder.txtFood.setText(modelArrayList.get(position).Food);
        holder.txtFamous.setText(modelArrayList.get(position).Famous);

    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    class TripHolder extends RecyclerView.ViewHolder{

        TextView txtname,txtFamous,txtDuration,txtFood;
        ImageView image;
        public TripHolder(@NonNull View itemView) {
            super(itemView);

            txtname = itemView.findViewById(R.id.txtname);
            txtFamous = itemView.findViewById(R.id.txtFamous);
            txtDuration = itemView.findViewById(R.id.txtDuration);
            txtFood = itemView.findViewById(R.id.txtFood);
            image = itemView.findViewById(R.id.image);
        }
    }
}
