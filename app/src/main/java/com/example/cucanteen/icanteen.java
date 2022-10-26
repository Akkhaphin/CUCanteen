package com.example.cucanteen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.cucanteen.Adaptor.IcanteenAdaptor;
import com.example.cucanteen.Domain.IcanteenDomain;

import java.util.ArrayList;
import java.util.List;

public class icanteen extends AppCompatActivity {

    RecyclerView icanteenRecycler;
    IcanteenAdaptor icanteenAdaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //not neccessary
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_icanteen);


        List<IcanteenDomain> icanteenDomainList = new ArrayList<>();
        icanteenDomainList.add(new IcanteenDomain("ร้านส้ม อาหารชุด","ข้าวไข่ข้น","ข้าวแกงกะหรี่","ข้าวคัตสึด้ง","ข้าวไก่กรอบเขียวหวาน",R.drawable.icanteen_food,R.drawable.list_icanteen_bg));
        icanteenDomainList.add(new IcanteenDomain("ร้านข้าวเหนียวไก่ทอด","ข้าวลาบไก่","ข้าวเหนียวไก่ทอด","ยำไก่ทอด","ข้าวเหนียวคอหมูย่าง",R.drawable.icanteen_chicken,R.drawable.list_icanteen_bg));

        seticanteenRecycler(icanteenDomainList);
    }

    private void seticanteenRecycler(List<IcanteenDomain> icanteenDomainList){

        icanteenRecycler = findViewById(R.id.chickenRecycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        icanteenRecycler.setLayoutManager(layoutManager);
        icanteenAdaptor = new IcanteenAdaptor(this, icanteenDomainList);
        icanteenRecycler.setAdapter(icanteenAdaptor);

    }
}