package com.example.cucanteen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.cucanteen.Adaptor.ChickenAdaptor;
import com.example.cucanteen.Adaptor.IcanteenAdaptor;
import com.example.cucanteen.Domain.ChickenDomain;
import com.example.cucanteen.Domain.IcanteenDomain;

import java.util.ArrayList;
import java.util.List;

public class Chicken extends AppCompatActivity {
    RecyclerView chickenRecycler;
    ChickenAdaptor chickenAdaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE); //not neccessary
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_chicken);

        List<ChickenDomain> chickenDomainList = new ArrayList<>();
        chickenDomainList.add(new ChickenDomain("ข้าวเหนียวไก่ทอด","ข้าวเหนียวไก่ทอดแสนอร่อยที่ครองใจ","เด็กวิศวะมานานนับทศวรรษ","30 บาท",R.drawable.icanteen_chicken,R.drawable.list_icanteen_bg));
        chickenDomainList.add(new ChickenDomain("ข้าวเหนียวไก่ทอด","ข้าวเหนียวไก่ทอดแสนอร่อยที่ครองใจ","เด็กวิศวะมานานนับทศวรรษ","30 บาท",R.drawable.icanteen_chicken,R.drawable.list_icanteen_bg));

        setchickenRecycler(chickenDomainList);
    }
    private void setchickenRecycler(List<ChickenDomain> chickenDomainList){

        chickenRecycler = findViewById(R.id.chickenRecycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        chickenRecycler.setLayoutManager(layoutManager);
        chickenAdaptor = new ChickenAdaptor(this, chickenDomainList);
        chickenRecycler.setAdapter(chickenAdaptor);

    }
}