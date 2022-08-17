package com.example.muslimpro.Ahadeth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.muslimpro.R;

public class HadethContent extends AppCompatActivity {
    String hadeth, sharhHadeth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadeth_content);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        TextView title = (TextView) findViewById(R.id.custom_title);
        TextView t1 = (TextView) findViewById(R.id.hadeth_content);
        TextView t2 = (TextView) findViewById(R.id.hadeth_sharh);
        title.setText("");
        setTitle("");
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.arrow_back_icon);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        Intent intent = this.getIntent();
        if (intent != null) {
            hadeth = intent.getStringExtra("hadeth");
            sharhHadeth = intent.getStringExtra("sharhHadeth");
        }
        t1.setText(hadeth);
        t2.setText(sharhHadeth);
    }
}