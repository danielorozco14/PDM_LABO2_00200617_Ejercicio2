package com.example.ejercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private GridLayout mGridLayout;
    private ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGridLayout=findViewById(R.id.gridLayout);

        img1=findViewById(R.id.pic1);
        img2=findViewById(R.id.pic2);
        img3=findViewById(R.id.pic3);
        img4=findViewById(R.id.pic4);
        img5=findViewById(R.id.pic5);
        img6=findViewById(R.id.pic6);
        img7=findViewById(R.id.pic7);
        img8=findViewById(R.id.pic8);
        img9=findViewById(R.id.pic9);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
        img7.setOnClickListener(this);
        img8.setOnClickListener(this);
        img9.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        int viewID=v.getId();
        Log.i("id",viewID+"");

        switch (viewID){
            case R.id.pic1:
                img1.setImageResource(R.drawable.paisaje3);
                break;
            case R.id.pic2:
                img2.setImageResource(R.drawable.paisaje3);
                break;
            case R.id.pic3:
                img3.setImageResource(R.drawable.paisaje3);
                break;
            case R.id.pic4:
                img4.setImageResource(R.drawable.paisaje3);
                break;
            case R.id.pic5:
                img5.setImageResource(R.drawable.paisaje3);
                break;
            case R.id.pic6:
                img6.setImageResource(R.drawable.paisaje3);
                break;
            case R.id.pic7:
                img7.setImageResource(R.drawable.paisaje3);
                break;
            case R.id.pic8:
                img8.setImageResource(R.drawable.paisaje3);
                break;
            case R.id.pic9:
                img9.setImageResource(R.drawable.paisaje3);
                break;


        }
    }
}
