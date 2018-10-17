package com.tareqrobin.studentsinformation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter {

    List<Student> studentInfo=new ArrayList<Student>();

    public CustomAdapter(Context con, List<Student> studentInfo){
        super(con,R.layout.single_row,studentInfo);
        this.studentInfo=studentInfo;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row=inflater.inflate(R.layout.single_row,parent,false);
        TextView tview=(TextView)row.findViewById(R.id.tv);
        ImageView x=(ImageView)row.findViewById(R.id.iv);
        tview.setText(studentInfo.get(position).getName());
        x.setImageResource(studentInfo.get(position).getImage());
        return row;
    }
}