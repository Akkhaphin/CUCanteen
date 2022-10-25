package com.example.cucanteen.Adaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cucanteen.Domain.SliderDomain;
import com.example.cucanteen.R;

import java.util.List;

public class SliderAdaptor extends RecyclerView.Adapter<SliderAdaptor.SliderViewHolder> {


    Context context;
    List<SliderDomain> SliderDomainList;

    public SliderAdaptor(Context context, List<SliderDomain> sliderDomainList) {
        this.context = context;
        SliderDomainList = sliderDomainList;
    }

    @NonNull
    @Override
    public SliderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.slider_item,parent,false);

        return new SliderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SliderViewHolder holder, int position) {

        holder.foodImage.setImageResource(SliderDomainList.get(position).getImageUrl());
        holder.name.setText(SliderDomainList.get(position).getName());
        holder.location.setText(SliderDomainList.get(position).getLocation());

    }

    @Override
    public int getItemCount() {
        return SliderDomainList.size();
    }


    public static final class SliderViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView location,name;
        public SliderViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.foodImage);
            location = itemView.findViewById(R.id.location);
            name = itemView.findViewById(R.id.name);


        }
    }
}
