package com.example.hayvangalerisi;

import android.icu.text.PluralRules;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private GridView mgridview;
    private String[] hayvanlar={"At" , "Fil","Kedi",  "Köpek","Kurt",
            "Ördek","Panda","Papağan","Sincap","Tavşan","Tilki"};
    private int[] resimler={R.drawable.at,R.drawable.fil,R.drawable.kedi,R.drawable.kopek,R.drawable.kurtjpg,R.drawable.ordek,
    R.drawable.panda,R.drawable.papagan,R.drawable.sincap,R.drawable.tavsan,R.drawable.tilki};

    private HayvanAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mgridview=findViewById(R.id.main_activtiy_gridview);

        adapter=new HayvanAdapter(hayvanlar,resimler,this);
        mgridview.setAdapter(adapter);

        mgridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),hayvanlar[position], Toast.LENGTH_SHORT).show();
            }
        });

    }
}