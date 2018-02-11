package com.example.brizz.kamussunda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.brizz.kamussunda.Activity.FrasaActivity;
import com.example.brizz.kamussunda.Activity.KeluargaActivity;
import com.example.brizz.kamussunda.Activity.NomerActivity;
import com.example.brizz.kamussunda.Activity.WarnaActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nomer = (TextView) findViewById(R.id.nomer);
        TextView keluarga = (TextView) findViewById(R.id.keluarga);
        TextView frasa = (TextView) findViewById(R.id.frasa);
        TextView warna = (TextView) findViewById(R.id.warna);

        nomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nomerInt = new Intent(MainActivity.this, NomerActivity.class);
                startActivity(nomerInt);
            }
        });
        keluarga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keluargaInt = new Intent(MainActivity.this, KeluargaActivity.class);
                startActivity(keluargaInt);
            }
        });
        frasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent frasaInt = new Intent(MainActivity.this, FrasaActivity.class);
                startActivity(frasaInt);
            }
        });
        warna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent warnaInt = new Intent(MainActivity.this, WarnaActivity.class);
                startActivity(warnaInt);
            }
        });
    }
}
