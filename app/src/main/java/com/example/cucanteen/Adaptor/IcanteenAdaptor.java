package com.example.cucanteen.Adaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cucanteen.Domain.IcanteenDomain;
import com.example.cucanteen.Domain.SliderDomain;
import com.example.cucanteen.R;

import java.util.List;

public class IcanteenAdaptor extends RecyclerView.Adapter<IcanteenAdaptor.IcanteenViewHolder> {

    Context context;
    List<IcanteenDomain> icanteenDomainList;
    public IcanteenAdaptor(Context context, List<IcanteenDomain> icanteenDomainList) {
        this.context = context;
        this.icanteenDomainList = icanteenDomainList;
    }

    @NonNull
    @Override
    public IcanteenViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.icanteen_item, parent, false);
        return new IcanteenViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull IcanteenViewHolder holder, int position) {

        holder.nameRes.setText(icanteenDomainList.get(position).getName());
        holder.menu1.setText(icanteenDomainList.get(position).getName());
        holder.menu2.setText(icanteenDomainList.get(position).getName());
        holder.menu3.setText(icanteenDomainList.get(position).getName());
        holder.menu4.setText(icanteenDomainList.get(position).getName());
        holder.icanteenImg.setImageResource(icanteenDomainList.get(position).getImg());
        holder.imgBg.setImageResource(icanteenDomainList.get(position).getImgBg());

    }



    @Override
    public int getItemCount() {
        return icanteenDomainList.size();
    }

    public static final class IcanteenViewHolder extends RecyclerView.ViewHolder{

        ImageView icanteenImg,imgBg;
        TextView nameRes,menu1,menu2,menu3,menu4;

        public IcanteenViewHolder(@NonNull View itemView) {
            super(itemView);

            icanteenImg = itemView.findViewById(R.id.icanteenImg);
            imgBg = itemView.findViewById(R.id.imgBg);
            nameRes = itemView.findViewById(R.id.nameRes);
            menu1 = itemView.findViewById(R.id.menu1);
            menu2 = itemView.findViewById(R.id.menu2);
            menu3 = itemView.findViewById(R.id.menu3);
            menu4 = itemView.findViewById(R.id.menu4);

            }

        }
    }




