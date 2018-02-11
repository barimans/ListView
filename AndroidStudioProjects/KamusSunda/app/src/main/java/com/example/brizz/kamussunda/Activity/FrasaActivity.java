package com.example.brizz.kamussunda.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.brizz.kamussunda.Adapter.ListAdapter;
import com.example.brizz.kamussunda.Pojo.ListProperties;
import com.example.brizz.kamussunda.R;

import java.util.ArrayList;

public class FrasaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView frasaText = (ListView) findViewById(R.id.listView);

        ArrayList<ListProperties> frasa = new ArrayList<>();

        frasa.add(new ListProperties("Akan Berpisah","Rek Papisah"));
        frasa.add(new ListProperties("Sedang Duduk","Keur Diuk"));
        frasa.add(new ListProperties("Telah Membeli","Geus Meser"));
        frasa.add(new ListProperties("Akan Mencuci","Rek Nyeuseuh"));
        frasa.add(new ListProperties("Sedang Menginjak","Keur Nincak"));
        frasa.add(new ListProperties("Telah Makan","Geus Dahar"));
        frasa.add(new ListProperties("Sedang Minum","Keur Nginum"));


        ListAdapter indexNomer = new ListAdapter(this, frasa, R.color.kat_frasa);
        frasaText.setAdapter(indexNomer);
    }
}
