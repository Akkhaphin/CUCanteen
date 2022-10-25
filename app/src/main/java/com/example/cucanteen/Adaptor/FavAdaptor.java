package com.example.cucanteen.Adaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cucanteen.Domain.FavDomain;
import com.example.cucanteen.Domain.SliderDomain;
import com.example.cucanteen.R;

import java.util.List;

public class FavAdaptor extends RecyclerView.Adapter<FavAdaptor.FavViewHolder> {


    Context context;
    List<FavDomain> favDomainList;

    public FavAdaptor(Context context, List<FavDomain> favDomainList) {
        this.context = context;
        this.favDomainList = favDomainList;
    }


    @NonNull
    @Override
    public FavViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(context).inflate(R.layout.fav_item, parent, false);
        return new FavViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FavViewHolder holder, int position) {

        holder.favimg1.setImageResource(favDomainList.get(position).getImageUrl1());
        holder.favimg2.setImageResource(favDomainList.get(position).getImageUrl2());
        holder.favimg3.setImageResource(favDomainList.get(position).getImageUrl3());
        holder.favtext.setText(favDomainList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return favDomainList.size();
    }

    public static final class FavViewHolder extends RecyclerView.ViewHolder {
        ImageView favimg1, favimg2, favimg3;
        TextView favtext;

        public FavViewHolder(@NonNull View itemView) {
            super(itemView);

            favimg1 = itemView.findViewById(R.id.favimg1);
            favimg2 = itemView.findViewById(R.id.favimg2);
            favimg3 = itemView.findViewById(R.id.favimg3);
            favtext = itemView.findViewById(R.id.favtext);
        }

    }
}


