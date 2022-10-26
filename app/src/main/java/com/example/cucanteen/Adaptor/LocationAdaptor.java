package com.example.cucanteen.Adaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cucanteen.Domain.LocationDomain;
import com.example.cucanteen.R;

import java.util.List;

public class LocationAdaptor extends RecyclerView.Adapter<LocationAdaptor.LocationViewHolder>{
    private RecycleViewClicklistener listener;
    Context context;
    List<LocationDomain> locationDomainList;

    public LocationAdaptor(Context context, List<LocationDomain> locationDomainList) {
        this.context = context;
        this.locationDomainList = locationDomainList;
        this.listener=listener;
    }




    @NonNull
    @Override
    public LocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.location_item,parent,false);
        return new LocationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LocationViewHolder holder, int position) {

        holder.locationImg.setImageResource(locationDomainList.get(position).getLocationImg());
    }

    @Override
    public int getItemCount() {
        return locationDomainList.size();
    }
    public interface RecycleViewClicklistener{
        void onClick(View v,int position);
    }

    public class LocationViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView locationImg;

        public LocationViewHolder(@NonNull View itemView) {
            super(itemView);
            locationImg = itemView.findViewById(R.id.locationImg);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listener.onClick(view,getAdapterPosition());
        }
    }
}

