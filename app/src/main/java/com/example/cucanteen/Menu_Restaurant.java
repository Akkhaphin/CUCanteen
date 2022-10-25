package com.example.cucanteen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cucanteen.Adaptor.MenuAdapter;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Menu_Restaurant extends AppCompatActivity {
    TextView textView22;
    RecyclerView recyclerView;
    ArrayList<String> Name,Price;
    DBHelper db;
    MenuAdapter adapter;
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
        db = new DBHelper(this);
        Name = new ArrayList<>();
        Price = new ArrayList<>();
        adapter = new MenuAdapter(this,Name,Price);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        displaydata();
    }

    private void displaydata() {
        Cursor cursor = db.getdata();
        if (cursor.getCount() == 0) {
            Toast.makeText(Menu_Restaurant.this,"No Entry Exists",Toast.LENGTH_SHORT).show();
            return;
        }
        else
        {
            while(cursor.moveToNext())
            {
                Name.add(cursor.getString(0));
                Price.add(cursor.getString(1));
            }
        }
    }

    public void Goaddmenu(View v) {
        Intent i = new Intent(this,Addmenu.class);
        startActivity(i);
    }

}