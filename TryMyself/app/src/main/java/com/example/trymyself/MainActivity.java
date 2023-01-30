package com.example.trymyself;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView garageRecView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        garageRecView = findViewById(R.id.garageRecView);

        ArrayList<Garage> garage = new ArrayList<>();
        garage.add(new Garage("BMW X5","10 BJK 1903","https://www.autocentrum.pl/ac-file/car-version/5cda9b1bc74b350d281952db/bmw-x5-g05.jpg"));
        garage.add(new Garage("MERCEDES AMG","34 PLT 34","https://i2.milimaj.com/i/milliyet/75/0x0/5c8d05bb45d2a08af4197f46.jpg"));
        garage.add(new Garage("AUDI A7","21 ZX 1905","https://pic.mojeauto.pl/b/45/b45ee8911e86c68583cd5ce61fe8b48c.jpg"));
        garage.add(new Garage("TESLA","17 AY 1903","https://tesla-cdn.thron.com/delivery/public/image/tesla/195458a0-ff67-488c-b972-14d23d2c42fb/bvlatuR/std/1200x630/ms-homepage-social"));

        GarageRecViewAdapter adapter = new GarageRecViewAdapter(this);
        adapter.setGarage(garage);

        garageRecView.setAdapter(adapter);
        garageRecView.setLayoutManager(new LinearLayoutManager(this));
    }
}