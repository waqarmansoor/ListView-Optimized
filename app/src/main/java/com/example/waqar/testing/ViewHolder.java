package com.example.waqar.testing;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by waqar on 5/12/2017.
 */

public class ViewHolder {

    TextView textView;
    TextView textView1;
    ImageView imageView;



    ViewHolder(View view){
        textView = (TextView) view.findViewById(R.id.textView);
        textView1 = (TextView) view.findViewById(R.id.textView2);
        imageView = (ImageView) view.findViewById(R.id.imageView2);
    }


}
