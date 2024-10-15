package com.example.hayvangalerisi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class HayvanAdapter extends ArrayAdapter<String> {
    private String[]hayvanlar;
    private int[]resimler;
    private Context context;
    private ImageView Hayvanresmi;
    private TextView hayvanismi;


    public HayvanAdapter(String[]hayvanlar,int[]resimler,Context context){
        super(context,R.layout.hayvan_item,hayvanlar);

        this.hayvanlar=hayvanlar;
        this.resimler=resimler;
        this.context=context;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v= LayoutInflater.from(context).inflate(R.layout.hayvan_item,null);
        if(v!=null){
            hayvanismi=v.findViewById(R.id.hayvan_item_textView);
            Hayvanresmi=v.findViewById(R.id.hayvan_item_imgView);
            hayvanismi.setText(hayvanlar[position]);
            Hayvanresmi.setBackgroundResource(resimler[position]);
        }


        return v;
    }
}
