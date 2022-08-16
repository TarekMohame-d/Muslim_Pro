package com.example.muslimpro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;

import android.widget.ListView;
import android.widget.TextView;


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
        String hadethTitle[] = {"سسيلاسيلاسلاسلاسلاسلاسلا", "سسيلاسيلاسلاسلاسلاسلاسل", "سسيلاسيلاسلاسلاسلاسلاسل",
                "سسيلاسيلاسلاسلاسلاسلاسل", "سسيلاسيلاسلاسلاسلاسلاسل", "سسيلاسيلاسلاسلاسلاسلاسل", "سسيلاسيلاسلاسلاسلاسلاسل",
                "سسيلاسيلاسلاسلاسلاسلاسل", "سسيلاسيلاسلاسلاسلاسلاسل", "سسيلاسيلاسلاسلاسلاسلاسل", "سسيلاسيلاسلاسلاسلاسلاسل",
                "سسيلاسيلاسلاسلاسلاسلاسل", "سسيلاسيلاسلاسلاسلاسلاسل", "سسيلاسيلاسلاسلاسلاسلاسل", "سسيلاسيلاسلاسلاسلاسلاسل",
                "سسيلاسيلاسلاسلاسلاسلاسل"};
        ArrayList<HadethModel> hadethArrayList = new ArrayList<>();
        for (int i = 0; i < hadethTitle.length; i++) {
            HadethModel hadethModel = new HadethModel(hadethTitle[i]);
            hadethArrayList.add(hadethModel);
        }
        HadethListAdapter hadethListAdapter = new HadethListAdapter(this, hadethArrayList);
        listView.setAdapter(hadethListAdapter);

    }
}