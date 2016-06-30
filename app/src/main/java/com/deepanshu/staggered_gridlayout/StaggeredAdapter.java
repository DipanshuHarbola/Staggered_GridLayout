package com.deepanshu.staggered_gridlayout;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class StaggeredAdapter extends RecyclerView.Adapter<StaggeredAdapter.ViewHolder> {

    private ArrayList<PlaceDetails> placeList;
    // Provide a reference to the views for each data item
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView placeName;
        public ImageView placePic;

        public ViewHolder(View itemView) {
            super(itemView);
            placeName = (TextView) itemView.findViewById(R.id.placeName);
            placePic = (ImageView) itemView.findViewById(R.id.placePic);
        }
    }

    public StaggeredAdapter(ArrayList<PlaceDetails> placeList){
        this.placeList = placeList;
    }


    // Create new views (invoked by the layout manager)
    @Override
    public StaggeredAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.staggered_layout, parent, false);
        // set the view's size, margins, paddings and layout parameters
        return new ViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.placeName.setText(placeList.get(position).getName());
        holder.placePic.setImageResource(placeList.get(position).getImageUrl());


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return placeList.size();
    }
}


