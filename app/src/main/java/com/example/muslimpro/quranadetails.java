package com.example.muslimpro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class quranadetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quranadetails);
        PDFView P= (PDFView) findViewById(R.id.pdfopener);
        int choice = getIntent().getIntExtra("filenumber",-1);
        P.fromAsset((choice+".pdf")).load();
    }
}