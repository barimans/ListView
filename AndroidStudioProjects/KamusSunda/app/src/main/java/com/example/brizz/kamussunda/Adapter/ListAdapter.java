package com.example.brizz.kamussunda.Adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.brizz.kamussunda.Pojo.ListProperties;
import com.example.brizz.kamussunda.R;

import java.util.ArrayList;

/**
 * Created by brizz on 9/19/17.
 */

public class ListAdapter extends ArrayAdapter<ListProperties> {
    //private static final String LOG_TAG = ListAdapter.class.getSimpleName();

    private int mColorResourceID;

    public ListAdapter(Activity context, ArrayList<ListProperties> number, int colorResourceID) {
        super(context, 0 , number);
        mColorResourceID = colorResourceID;
    }

    @Nullable
    @Override
    public View getView(int position, View convertView,@Nullable ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        ListProperties currentListProperties = getItem(position);

        TextView tv_bahasa = listItemView.findViewById(R.id.tvBahasa);
        tv_bahasa.setText(currentListProperties.getbIndo());

        TextView tv_sunda = listItemView.findViewById(R.id.tvSunda);
        tv_sunda.setText(currentListProperties.getbSunda());

        ImageView iconView = listItemView.findViewById(R.id.imageView);
        if (currentListProperties.dapatGambar()){
            iconView.setImageResource(currentListProperties.getImageView());
        }else {
            iconView.setVisibility(View.GONE);
        }

        View tvContainer = listItemView.findViewById(R.id.tv_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceID);
        tvContainer.setBackgroundColor(color);

        return listItemView;
    }
}
