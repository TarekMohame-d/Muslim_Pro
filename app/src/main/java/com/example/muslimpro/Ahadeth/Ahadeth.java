package com.example.muslimpro.Ahadeth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;


import com.example.muslimpro.About;
import com.example.muslimpro.MainActivity;
import com.example.muslimpro.R;

import java.util.ArrayList;

public class Ahadeth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahadeth);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        TextView title = (TextView) findViewById(R.id.custom_title);
        ListView listView = (ListView) findViewById(R.id.listView);
        title.setText("أحاديث");
        setTitle("");
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.arrow_back_icon);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        String hadeth[] = {
                getString(R.string.hadeth_1),
                getString(R.string.hadeth_2),
                getString(R.string.hadeth_3),
                getString(R.string.hadeth_4),
                getString(R.string.hadeth_5),
                getString(R.string.hadeth_6),
                getString(R.string.hadeth_7),
                getString(R.string.hadeth_8),
                getString(R.string.hadeth_9),
                getString(R.string.hadeth_10),
                getString(R.string.hadeth_11),
                getString(R.string.hadeth_12),
                getString(R.string.hadeth_13),
                getString(R.string.hadeth_14),
                getString(R.string.hadeth_15)
        };
        String sharhHadeth[] = {
                getString(R.string.sharh_hadeth_1),
                getString(R.string.sharh_hadeth_2),
                getString(R.string.sharh_hadeth_3),
                getString(R.string.sharh_hadeth_4),
                getString(R.string.sharh_hadeth_5),
                getString(R.string.sharh_hadeth_6),
                getString(R.string.sharh_hadeth_7),
                getString(R.string.sharh_hadeth_8),
                getString(R.string.sharh_hadeth_9),
                getString(R.string.sharh_hadeth_10),
                getString(R.string.sharh_hadeth_11),
                getString(R.string.sharh_hadeth_12),
                getString(R.string.sharh_hadeth_13),
                getString(R.string.sharh_hadeth_14),
                getString(R.string.sharh_hadeth_15),
        };
        ArrayList<HadethModel> hadethArrayList = new ArrayList<>();
        for (int i = 0; i < hadeth.length; i++) {
            HadethModel hadethModel = new HadethModel(hadeth[i]);
            hadethArrayList.add(hadethModel);
        }
        HadethListAdapter hadethListAdapter = new HadethListAdapter(this, hadethArrayList);
        listView.setAdapter(hadethListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Ahadeth.this, HadethContent.class);
                intent.putExtra("hadeth", hadeth[i]);
                intent.putExtra("sharhHadeth", sharhHadeth[i]);
                startActivity(intent);
            }
        });

    }
}