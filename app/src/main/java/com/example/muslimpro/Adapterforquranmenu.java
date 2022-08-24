package com.example.muslimpro;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapterforquranmenu extends RecyclerView.Adapter<Adapterforquranmenu.quranitemviewholder> {
    List<quranitem> allofquransoras ;
    Context context ;
    public Adapterforquranmenu(List<quranitem> allofquransoras,Context c) {
        this.allofquransoras = allofquransoras;
        context=c ;
    }

    @NonNull
    @Override
    public quranitemviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View quranitem = LayoutInflater.from(parent.getContext()).inflate(R.layout.quranitem,parent,false);
        return new quranitemviewholder(quranitem);
    }

    @Override
    public void onBindViewHolder(@NonNull quranitemviewholder holder, int position) {
        quranitem i = allofquransoras.get(position);
        holder.souraname.setText(i.soraname);
        holder.icon.setImageResource(i.img_id);
    }

    @Override
    public int getItemCount() {
        return allofquransoras.size();
    }

    public class quranitemviewholder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView icon ;
        TextView souraname;

        public quranitemviewholder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            icon= itemView.findViewById(R.id.quranimage);
            souraname= itemView.findViewById(R.id.souratext);
        }

        @Override
        public void onClick(View view) {
            int pos = getAdapterPosition();
            String item = allofquransoras.get(pos).soraname;
            Intent i = new Intent(context, quranadetails.class);
            i.putExtra("filenumber",pos+1);
            context.startActivity(i);
        }
    }

}
