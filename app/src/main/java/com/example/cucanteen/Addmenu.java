package com.example.cucanteen;




import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.util.Log;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Addmenu extends AppCompatActivity {
    //private final int GALLERY_REQ_CODE=1000;
    private static final String TAG = "Addmenu";
    EditText NameInput;
    EditText PriceInput;
    TextView textView23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addmenu);
        NameInput = (EditText) findViewById(R.id.editTextTextPersonName2);
        PriceInput = (EditText) findViewById(R.id.editTextNumberSigned);
        textView23 = (TextView) findViewById(R.id.textView23);
        //textView = (TextView) findViewById(R.id.textView);
        //ImageView imgGallery = findViewById(R.id.imGallery);
        //Button button3 = findViewById(R.id.button3);
        //button3.setOnClickListener(new View.OnClickListener())
        //{@Override
        //        public void onClick(View v)
        //    {
        //       Intent iGallery = new Intent(Intent.ACTION_PICK);
        //       iGallery.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        //      startActivityForResult(iGallery,);
        // }


    }

    public void SEND(View view) {
            //textView23.setText(NameInput.getText().toString()+PriceInput.getText().toString());
        Intent senderIntent = new Intent(this,Menu_Restaurant.class);
                senderIntent.putExtra("NameInput",NameInput.getText().toString());
                senderIntent.putExtra("PriceInput",PriceInput.getText().toString());
        startActivity(senderIntent);
    }
}



