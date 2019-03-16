package com.example.ejercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ArrayList<Integer> randList= new ArrayList<>();
    Random rand = new Random();
    private GridLayout mGridLayout;
    private ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGridLayout=findViewById(R.id.gridLayout);

        //OBTENIENDO LOS ID DE LAS IMAGENES Y AGREGANDOLAS A LA LISTA

        randList.add(R.drawable.paisaje1);
        randList.add(R.drawable.paisaje2);
        randList.add(R.drawable.paisaje3);


        img1=findViewById(R.id.pic1);
        img2=findViewById(R.id.pic2);
        img3=findViewById(R.id.pic3);
        img4=findViewById(R.id.pic4);
        img5=findViewById(R.id.pic5);
        img6=findViewById(R.id.pic6);
        img7=findViewById(R.id.pic7);
        img8=findViewById(R.id.pic8);
        img9=findViewById(R.id.pic9);
        //COLOCANDO LOS LISTENER EN CADA IMAGEVIEW
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
        ImageView Img = findViewById(v.getId());
        int indiceLista = (int)rand.nextInt(randList.size());
        System.out.println("ID "+indiceLista);
        Img.setImageResource(randList.get(indiceLista));

    }
}
