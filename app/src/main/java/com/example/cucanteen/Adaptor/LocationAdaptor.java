package com.example.cucanteen.Adaptor;

import android.content.Context;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cucanteen.Domain.LocationDomain;
import com.example.cucanteen.Domain.SliderDomain;
import com.example.cucanteen.R;

import java.util.List;

public class LocationAdaptor extends RecyclerView.Adapter<LocationAdaptor.LocationViewHolder>{

    Context context;
    List<LocationDomain> locationDomainList;
    private ItemClickListener mItemListener;

    public LocationAdaptor(Context context, List<LocationDomain> locationDomainList,ItemClickListener itemClickListener) {
        this.context = context;
        this.locationDomainList = locationDomainList;
        this.mItemListener=itemClickListener;
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
        holder.itemView.setOnClickListener(view ->{
            mItemListener.onItemClick(locationDomainList.get(position));});
    }

    @Override
    public int getItemCount() {
        return locationDomainList.size();
    }
    public interface ItemClickListener
    {
        void onItemClick(LocationDomain locationDomain);
    }

    public static final class LocationViewHolder extends RecyclerView.ViewHolder{
        ImageView locationImg;

        public LocationViewHolder(@NonNull View itemView) {
            super(itemView);
            locationImg = itemView.findViewById(R.id.locationImg);
        }
    }
}

