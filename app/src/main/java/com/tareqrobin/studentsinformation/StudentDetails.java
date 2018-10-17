package com.tareqrobin.studentsinformation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static com.tareqrobin.studentsinformation.MainActivity.studentList;

public class StudentDetails extends AppCompatActivity {
    private ImageView iv;
    private TextView tv1,tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);

        iv=findViewById(R.id.iv);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);

        int y=getIntent().getExtras().getInt("x");

        iv.setImageResource(studentList.get(y).getImage());
        tv1.setText(studentList.get(y).getName());
        tv2.setText(studentList.get(y).getRoll()+"\n"+studentList.get(y).getSection());

    }
}