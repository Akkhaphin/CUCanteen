package com.example.cucanteen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Menu_Restaurant extends AppCompatActivity {
    TextView textView22;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_restaurant);
        textView22 = (TextView) findViewById(R.id.textView22);
        Intent recieverIntent =getIntent();
        String recievedValue = recieverIntent.getStringExtra("NameInput");
        String recievedValue2= recieverIntent.getStringExtra("PriceInput");
        textView22.setText(recievedValue2);
        recyclerView = findViewById(R.id.recyclerview);
    }
    public void Goaddmenu(View v) {
        Intent i = new Intent(this,Addmenu.class);
        startActivity(i);
    }

}