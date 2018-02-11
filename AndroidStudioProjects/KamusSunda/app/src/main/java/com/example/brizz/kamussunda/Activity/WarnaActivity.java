package com.example.brizz.kamussunda.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.brizz.kamussunda.Adapter.ListAdapter;
import com.example.brizz.kamussunda.Pojo.ListProperties;
import com.example.brizz.kamussunda.R;

import java.util.ArrayList;

public class WarnaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ListView warnaText = (ListView) findViewById(R.id.listView);

        ArrayList<ListProperties> warna = new ArrayList<>();

        warna.add(new ListProperties("Merah","Bereum"));
        warna.add(new ListProperties("Kuning","Koneng"));
        warna.add(new ListProperties("Hitam","Hideung"));
        warna.add(new ListProperties("Orange","Oranye"));
        warna.add(new ListProperties("Hijau","Hejo"));
        warna.add(new ListProperties("Ungu","Gandaria"));
        warna.add(new ListProperties("Abu-abu","Kulawu"));


        ListAdapter indexNomer = new ListAdapter(this, warna, R.color.kat_warna);
        warnaText.setAdapter(indexNomer);
    }
}
