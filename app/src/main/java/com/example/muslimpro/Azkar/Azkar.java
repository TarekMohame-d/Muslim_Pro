package com.example.muslimpro.Azkar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.muslimpro.Database.DatabaseHelper;
import com.example.muslimpro.R;

import java.util.ArrayList;

public class Azkar extends AppCompatActivity {
    DatabaseHelper myDatabase = new DatabaseHelper(this);
    String text; // input from EditText
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkar);

        listView = (ListView) findViewById(R.id.Azkar_listView);
        showData();

        // Toolbar icon "Add azkar"
        ImageButton addButton = findViewById(R.id.addZekr_btn);
        addButton.setVisibility(View.VISIBLE);

        // Toolbar setting
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        TextView title = (TextView) findViewById(R.id.custom_title);
        title.setText("أذكار");
        setTitle("");
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.arrow_back_icon);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        myDatabase.delete("1");
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder myDialog = new AlertDialog.Builder(Azkar.this);
                myDialog.setTitle("إضافة أذكار");
                EditText input = new EditText(Azkar.this);
                input.setHint("أذكار");
                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_MULTI_LINE);
                myDialog.setView(input);
                myDialog.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        text = input.getText().toString();
                        String n = myDatabase.insertData(text);
                        Toast.makeText(getApplicationContext(), "Added Successfully", Toast.LENGTH_SHORT).show();
                        input.setText("");
                        showData();
                    }
                });
                myDialog.setNegativeButton("CANCLE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                myDialog.show();
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                AlertDialog.Builder editDialog = new AlertDialog.Builder(Azkar.this);
                editDialog.setTitle("Delete");
                editDialog.setMessage("Are you sure ?");
                editDialog.setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int k) {
                        String selectedFromList = (String) (listView.getItemAtPosition(i));
                        btn_delete(selectedFromList);
                        Toast.makeText(getApplicationContext(), "Deleted Successfully", Toast.LENGTH_SHORT).show();
                    }
                });
                editDialog.setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                editDialog.show();
            }
        });

    }

    public void showData()
    {
        ArrayList<String> azkarArrayList = myDatabase.getData();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.azkar_item, R.id.azkar_title,azkarArrayList);
        listView.setAdapter(adapter);
    }

    public void btn_delete(String text)
    {
        myDatabase.delete(text);
        showData();
    }

}