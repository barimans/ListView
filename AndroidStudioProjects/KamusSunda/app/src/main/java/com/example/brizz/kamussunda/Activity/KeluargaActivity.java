package com.example.brizz.kamussunda.Activity;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.brizz.kamussunda.Adapter.ListAdapter;
import com.example.brizz.kamussunda.Pojo.ListProperties;
import com.example.brizz.kamussunda.R;

import java.util.ArrayList;

public class KeluargaActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView kelText = (ListView) findViewById(R.id.listView);

        final ArrayList<ListProperties> keluarga = new ArrayList<>();

        keluarga.add(new ListProperties("Ayah","Bapa",R.drawable.ayah, R.raw.bapa));
        keluarga.add(new ListProperties("Ibu","Indung",R.drawable.ibu, R.raw.ibu));
        keluarga.add(new ListProperties("Anak","Anak",R.drawable.anak, R.raw.anak));
        keluarga.add(new ListProperties("Cucu","Incu",R.drawable.cucu, R.raw.cucu));
        keluarga.add(new ListProperties("Kakek","Aki",R.drawable.kakek, R.raw.aki));
        keluarga.add(new ListProperties("Nenek","Nini",R.drawable.nenek, R.raw.nenek));
        keluarga.add(new ListProperties("Adik","Adi",R.drawable.adik, R.raw.adi));
        keluarga.add(new ListProperties("Kakak","Lanceuk",R.drawable.kakak, R.raw.kakak));
        keluarga.add(new ListProperties("Paman","Emang",R.drawable.paman, R.raw.paman));
        keluarga.add(new ListProperties("Bibi","Bibi",R.drawable.bibi, R.raw.bibi));

        ListAdapter indexNomer = new ListAdapter(this, keluarga, R.color.kat_keluarga);
        kelText.setAdapter(indexNomer);

        kelText.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                ListProperties audioKeluarga = keluarga.get(position);
                mMediaPlayer = MediaPlayer.create(KeluargaActivity.this, audioKeluarga.getmAudio());
                mMediaPlayer.start();
            }
        });
    }
}
