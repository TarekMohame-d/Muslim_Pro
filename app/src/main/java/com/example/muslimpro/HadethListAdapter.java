package com.example.muslimpro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class HadethListAdapter extends ArrayAdapter<HadethModel> {

    public HadethListAdapter(Context context, ArrayList<HadethModel> hadethModelArrayList) {
        super(context, 0, hadethModelArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        HadethModel hadethModel = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.hadeth_item, parent, false);
        }
        TextView hadethNumber = (TextView) convertView.findViewById(R.id.hadeth_number);
        TextView hadethTitle = (TextView) convertView.findViewById(R.id.hadeth_title);

        hadethNumber.setText(String.valueOf(position + 1));
        hadethTitle.setText(hadethModel.getHadethTitle());
        return convertView;
    }
}
