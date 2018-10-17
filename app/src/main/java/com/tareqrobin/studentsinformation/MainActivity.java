package com.tareqrobin.studentsinformation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    static List<Student> studentList=new ArrayList<Student>();


    private ListView lv;
    //private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=findViewById(R.id.lview);

        studentList.add(new Student("Amim",89,"A Section",R.drawable.a));
        studentList.add(new Student("Tamim",8,"B Section",R.drawable.j));
        studentList.add(new Student("Samim",9,"C Section",R.drawable.c));
        studentList.add(new Student("Ramim",88,"D Section",R.drawable.d));
        studentList.add(new Student("Robin",91,"C Section",R.drawable.e));
        studentList.add(new Student("tareq",14,"A Section",R.drawable.f));
        studentList.add(new Student("Amim",89,"A Section",R.drawable.g));
        studentList.add(new Student("Tamim",8,"B Section",R.drawable.h));
        studentList.add(new Student("Samim",9,"C Section",R.drawable.a));
        studentList.add(new Student("Ramim",88,"D Section",R.drawable.c));
        studentList.add(new Student("Robin",91,"C Section",R.drawable.d));
        studentList.add(new Student("tareq",14,"A Section",R.drawable.e));

        CustomAdapter adptr=new CustomAdapter(getApplicationContext(),studentList);

        lv.setAdapter(adptr);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getApplicationContext(),"Name: "+studentList.get(i).getName(),Toast.LENGTH_SHORT).show();
                Intent p=new Intent(getApplicationContext(),StudentDetails.class);
                p.putExtra("x",i);
                startActivity(p);
            }
        });
    }
}
