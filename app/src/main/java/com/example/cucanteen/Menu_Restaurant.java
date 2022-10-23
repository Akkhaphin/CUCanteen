package com.example.cucanteen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Menu_Restaurant extends AppCompatActivity {
    TextView textView22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_restaurant);
        textView22 = (TextView) findViewById(R.id.textView22);
        Intent recieverIntent =getIntent();
        String recievedValue = recieverIntent.getStringExtra("NameInput");
        textView22.setText(recievedValue);
    }
    public void Goaddmenu(View v) {
        Intent i = new Intent(this,Addmenu.class);
        startActivity(i);
    }

}