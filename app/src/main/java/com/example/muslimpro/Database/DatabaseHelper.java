package com.example.muslimpro.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Azkar.db";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table azkar (id integer primary key AUTOINCREMENT, zekr text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS azkar");
        onCreate(sqLiteDatabase);
    }

    public String insertData(String data) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues row = new ContentValues();
        row.put("zekr", data);
        long result = db.insert("azkar", null, row);
        if (result == -1) {
            return "Error";
        } else {
            return "Inserted Successfully";
        }
    }

    public ArrayList<String> getData() {
        ArrayList<String> arrayList = new ArrayList<String>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery("select * from azkar", null);
        c.moveToFirst();
        while (c.isAfterLast() == false) {
            arrayList.add(c.getString(1));
            c.moveToNext();
        }
        return arrayList;
    }

    public void updateDate(String id, String data) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues row = new ContentValues();
        row.put("zekr", data);
        db.update("azkar", row, "id=?", new String[]{id});
    }

    public void delete(String text) {
        SQLiteDatabase db = this.getWritableDatabase();
        //db.delete("azkar", "id=?", new String[]{id});
        //db.delete("azkar", "id = ?", new String[]{id});
        //db.delete("azkar","id='" + id + "'", null);
        db.delete("azkar","zekr='" + text + "'", null);
        //db.execSQL("DELETE FROM azkar WHERE id= 'id'");
    }
}
