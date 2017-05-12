package com.example.waqar.testing;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String LOGTAG = "LOGTAG";
    ListView listView;
    MyAdapter adapter;
    List<Student> students;
    List<Integer> photoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        students=new ArrayList<>();
        photoes=new ArrayList<>();





        listView= (ListView) findViewById(R.id.listview);

        for(int i=0;i<=20;i++){
            students.add(new Student(i,"Student"+i));
        }

        photoes.add(R.drawable.a0);
        photoes.add(R.drawable.a1);
        photoes.add(R.drawable.a2);
        photoes.add(R.drawable.a3);
        photoes.add(R.drawable.a4);
        photoes.add(R.drawable.a5);
        photoes.add(R.drawable.a6);
        photoes.add(R.drawable.a7);
        photoes.add(R.drawable.a8);
        photoes.add(R.drawable.a9);
        photoes.add(R.drawable.a10);
        photoes.add(R.drawable.a11);
        photoes.add(R.drawable.a12);
        photoes.add(R.drawable.a13);
        photoes.add(R.drawable.a14);
        photoes.add(R.drawable.a15);
        photoes.add(R.drawable.a16);
        photoes.add(R.drawable.a17);
        photoes.add(R.drawable.a18);
        photoes.add(R.drawable.a19);
        photoes.add(R.drawable.a20);

        adapter=new MyAdapter(this,students,photoes);

        listView.setAdapter(adapter);



    }





}
