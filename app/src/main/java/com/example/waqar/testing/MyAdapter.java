package com.example.waqar.testing;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by waqar on 5/12/2017.
 */

public class MyAdapter extends BaseAdapter {

    public static final String LOGTAG = "LOGTAG";
    Context context;
    List<Student> students;
    List<Integer> photoes;
    View view;


    MyAdapter(Context context,List<Student> students,List<Integer> photoes){
        this.context=context;
        this.students=students;
        this.photoes=photoes;
    }

    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public Student getItem(int position) {
        return students.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        view=convertView;
        ViewHolder holder=null;
        if (view ==null){
            Log.d(LOGTAG,"I am null");
            LayoutInflater layoutInflater= LayoutInflater.from(context);
            view=layoutInflater.inflate(R.layout.mylayout,parent,false);
            holder= new ViewHolder(view);

            view.setTag(holder);
        }else{
            Log.d(LOGTAG,"I am not null");
            holder= (ViewHolder) view.getTag();
        }
        holder.textView.setText(String.valueOf(students.get(position).getStud_id()));
        holder.textView1.setText(students.get(position).getName());
        holder.imageView.setImageResource(photoes.get(position));
        return view;
    }




}
