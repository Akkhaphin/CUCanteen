package com.example.cucanteen.Adaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cucanteen.R;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MyviewHolder> {
    private Context context;
    private ArrayList Name,Price;

    public MenuAdapter(Context context, ArrayList name, ArrayList price) {
        this.context = context;
        Name = name;
        Price = price;
    }

    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {View v = LayoutInflater.from(context).inflate(R.layout.foodrecycle2,parent,false);
        return new MyviewHolder(v) ;
    }
    @Override
    public void onBindViewHolder(@NonNull MyviewHolder holder,int position)
    {
        holder.Name.setText(String.valueOf(Name.get(position)));
        holder.Price.setText(String.valueOf(Price.get(position)));
    }
    @Override
    public int getItemCount(){
        return Name.size();
    }
    public class MyviewHolder extends RecyclerView.ViewHolder {
        TextView Name,Price;
        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
            Name = itemView.findViewById(R.id.textname);
            Price = itemView.findViewById(R.id.textprice);
        }
    }

}
