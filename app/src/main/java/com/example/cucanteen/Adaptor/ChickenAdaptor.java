package com.example.cucanteen.Adaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cucanteen.Chicken;
import com.example.cucanteen.Domain.ChickenDomain;
import com.example.cucanteen.Domain.FavDomain;
import com.example.cucanteen.R;

import java.util.List;

public class ChickenAdaptor extends RecyclerView.Adapter<ChickenAdaptor.ChickenViewHolder>{
    Context context;
    List<ChickenDomain> chickenDomainList;

    public ChickenAdaptor(Context context, List<ChickenDomain> chickenDomainList) {
        this.context = context;
        this.chickenDomainList = chickenDomainList;
    }
    @NonNull
    @Override
    public ChickenAdaptor.ChickenViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(context).inflate(R.layout.chiken_item, parent, false);
        return new ChickenViewHolder(view);

    }
    @Override
    public void onBindViewHolder(@NonNull ChickenAdaptor.ChickenViewHolder holder, int position) {

        holder.imgchicken.setImageResource(chickenDomainList.get(position).getImgchicken());
        holder.imgchickenBG.setImageResource(chickenDomainList.get(position).getImgchickenBG());
        holder.nameFoodChicken.setText(chickenDomainList.get(position).getNameFoodChicken());
        holder.caption1.setText(chickenDomainList.get(position).getCaption1());
        holder.caption2.setText(chickenDomainList.get(position).getCaption2());
        holder.Price.setText(chickenDomainList.get(position).getPrice());
    }
    @Override
    public int getItemCount() {
        return chickenDomainList.size();
    }

    public static final class ChickenViewHolder extends RecyclerView.ViewHolder{

        ImageView imgchicken,imgchickenBG;
        TextView nameFoodChicken,caption1,caption2,Price;

        public ChickenViewHolder(@NonNull View itemView) {
            super(itemView);

            imgchicken = itemView.findViewById(R.id.imgchicken);
            imgchickenBG = itemView.findViewById(R.id.imgchickenBG);
            nameFoodChicken = itemView.findViewById(R.id.nameFoodChicken);
            caption1 = itemView.findViewById(R.id.caption1);
            caption2 = itemView.findViewById(R.id.caption2);
            Price = itemView.findViewById(R.id.Price);
        }
}
}