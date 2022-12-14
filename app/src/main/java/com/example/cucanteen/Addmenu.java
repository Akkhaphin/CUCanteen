package com.example.cucanteen;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class Addmenu extends AppCompatActivity {

    // creating variables for our edittext, button and dbhandler
    private EditText courseNameEdt, courseTracksEdt, courseDurationEdt, courseDescriptionEdt;
    private Button addCourseBtn;
    private DBHelper dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addmenu);

        // initializing all our variables.
        courseNameEdt = findViewById(R.id.idEdtCourseName);
        //courseTracksEdt = findViewById(R.id.idEdtCourseTracks);
        courseDurationEdt = findViewById(R.id.idEdtCourseDuration);
        //courseDescriptionEdt = findViewById(R.id.idEdtCourseDescription);
        addCourseBtn = findViewById(R.id.idBtnAddCourse);

        // creating a new dbhandler class
        // and passing our context to it.
        dbHandler = new DBHelper(Addmenu.this);

        // below line is to add on click listener for our add course button.
        addCourseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // below line is to get data from all edit text fields.
                String courseName = courseNameEdt.getText().toString();
                //String courseTracks = courseTracksEdt.getText().toString();
                Integer courseDuration = Integer.valueOf(courseDurationEdt.getText().toString());
                //String courseDescription = courseDescriptionEdt.getText().toString();

                // validating if the text fields are empty or not.
                if (courseName.isEmpty()  && courseDuration.toString().isEmpty() ) {
                    Toast.makeText(Addmenu.this, "Please enter all the data..", Toast.LENGTH_SHORT).show();
                    return;
                }
                else
                {

                    startActivity(new Intent(Addmenu.this, Menu_Restaurant.class));
                }
                dbHandler.addNewCourse(courseName, courseDuration);
                // on below line we are calling a method to add new
                // course to sqlite data and pass all our values to it.


                // after adding the data we are displaying a toast message.
                Toast.makeText(Addmenu.this, "Course has been added.", Toast.LENGTH_SHORT).show();
                courseNameEdt.setText("");
                courseDurationEdt.setText("");
                //courseTracksEdt.setText("");
                //courseDescriptionEdt.setText("");
            }
        });
    }
   //public void GOBACK(View v) {
    //    Intent i = new Intent(this,Menu_Restaurant.class);
     //   startActivity(i);
    //}
}