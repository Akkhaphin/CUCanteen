package com.example.cucanteen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;


import com.example.cucanteen.Adaptor.FavAdaptor;
import com.example.cucanteen.Adaptor.IcanteenAdaptor;
import com.example.cucanteen.Adaptor.LocationAdaptor;
import com.example.cucanteen.Adaptor.SliderAdaptor;
import com.example.cucanteen.Domain.FavDomain;
import com.example.cucanteen.Domain.LocationDomain;
import com.example.cucanteen.Domain.SliderDomain;

import java.util.ArrayList;
import java.util.List;

public class HomeUser extends AppCompatActivity {

    RecyclerView sliderRecycler,favRecycler,locationRecycler;
    SliderAdaptor sliderAdaptor;
    FavAdaptor favAdaptor;
    LocationAdaptor locationAdaptor;
    private LocationAdaptor.RecycleViewClicklistener listener;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //not neccessary
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_home_user);

        List<SliderDomain> sliderDomainList = new ArrayList<>();
        sliderDomainList.add(new SliderDomain("ข้าวมันไก่ทอด","ร้านรัตน์ จานด่วน : โรงอาหารI-canteen @วิศวะ", R.drawable.picscroll));
        sliderDomainList.add(new SliderDomain("สปาเกตตีคาโบนาร่า","ร้านสักอย่างจำไม่ได้ : ศูนย์อาหารคณะครุศาสตร์", R.drawable.picscroll1));
        sliderDomainList.add(new SliderDomain("ข้าวผัดอเมริกัน","ร้านของทอด : โรงอาหารอาคารจุลจักรพงษ์ @วิทยา", R.drawable.picscroll2));

        setSliderRecycler(sliderDomainList);

        List<FavDomain> favDomainList = new ArrayList<>();
        favDomainList.add(new FavDomain("เพิ่มรายการใหม่",R.drawable.rectangular_fav,R.drawable.circle_fav, R.drawable.plus_fav));
        favDomainList.add(new FavDomain("เพิ่มรายการใหม่",R.drawable.rectangular_fav_pink,R.drawable.circle_fav_pink, R.drawable.plus_fav_pink));
        favDomainList.add(new FavDomain("เพิ่มรายการใหม่",R.drawable.rectangular_fav,R.drawable.circle_fav, R.drawable.plus_fav));
        favDomainList.add(new FavDomain("เพิ่มรายการใหม่",R.drawable.rectangular_fav_pink,R.drawable.circle_fav_pink, R.drawable.plus_fav_pink));
        favDomainList.add(new FavDomain("เพิ่มรายการใหม่",R.drawable.rectangular_fav,R.drawable.circle_fav, R.drawable.plus_fav));
        setFavRecycler(favDomainList);

        List<LocationDomain> locationDomainList = new ArrayList<>();
        locationDomainList.add(new LocationDomain(R.drawable.eng));
        locationDomainList.add(new LocationDomain(R.drawable.sci));
        locationDomainList.add(new LocationDomain(R.drawable.art));
        setLocationRecycler(locationDomainList);


    }

    private void setSliderRecycler(List<SliderDomain> sliderDomainList){

        sliderRecycler = findViewById(R.id.slider_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        sliderRecycler.setLayoutManager(layoutManager);
        sliderAdaptor = new SliderAdaptor(this, sliderDomainList);
        sliderRecycler.setAdapter(sliderAdaptor);

    }

    private void setFavRecycler(List<FavDomain> favDomainList){
        favRecycler = findViewById(R.id.fav_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        favRecycler.setLayoutManager(layoutManager);
        favAdaptor = new FavAdaptor(this, favDomainList);
        favRecycler.setAdapter(favAdaptor);
    }

    private void setLocationRecycler(List<LocationDomain> locationDomainList){
        setOnclickListener();
        locationRecycler = findViewById(R.id.location_Recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        locationRecycler.setLayoutManager(layoutManager);
        locationAdaptor = new LocationAdaptor(this, locationDomainList);
        locationRecycler.setAdapter(locationAdaptor);
    }

    private void setOnclickListener() {
        listener = new LocationAdaptor.RecycleViewClicklistener() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(), icanteen.class);
                startActivity(intent);
            }
        };
    }
}


