package com.example.brizz.kamussunda.Activity;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.brizz.kamussunda.Adapter.ListAdapter;
import com.example.brizz.kamussunda.Pojo.ListProperties;
import com.example.brizz.kamussunda.R;

import java.util.ArrayList;

public class NomerActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        final ListView numText = (ListView) findViewById(R.id.listView);

        final ArrayList<ListProperties> number = new ArrayList<>();

        number.add(new ListProperties("Satu","Hiji", R.drawable.satu, R.raw.satu));
        number.add(new ListProperties("Dua","Dua", R.drawable.dua, R.raw.dua));
        number.add(new ListProperties("Tiga","Tilu", R.drawable.tiga, R.raw.tiga));
        number.add(new ListProperties("Empat","Opat", R.drawable.empat, R.raw.empat));
        number.add(new ListProperties("Lima","Lima", R.drawable.lima, R.raw.lima));
        number.add(new ListProperties("Enam","Genep", R.drawable.enam, R.raw.enam));
        number.add(new ListProperties("Tujuh","Tujuh", R.drawable.tujuh, R.raw.tujuh));
        number.add(new ListProperties("Delapan","Dalapan", R.drawable.delapan, R.raw.delapan));
        number.add(new ListProperties("Sembilan","Salapan", R.drawable.sembilan, R.raw.sembilan));
        number.add(new ListProperties("Sepuluh","Sapuluh", R.drawable.sepuluh, R.raw.sepuluh));


        ListAdapter adapter = new ListAdapter(this, number, R.color.kat_nomer);
        numText.setAdapter(adapter);

        numText.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                ListProperties audioNumber = number.get(position);
                mMediaPlayer = MediaPlayer.create(NomerActivity.this, audioNumber.getmAudio());
                mMediaPlayer.start();
            }
        });

    }
}
