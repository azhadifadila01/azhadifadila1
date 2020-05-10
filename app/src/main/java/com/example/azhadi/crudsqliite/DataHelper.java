package com.example.azhadi.crudsqliite;




import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    // 10-05-2020
    // 10117277
    // Azhadi Fadila
    // IF-8

    private static final String DATABASE_NAME = "biodatadiri.db";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        String sql = "create table biodata(no integer primary key, nama text null, nim text null, kelas text null, alamat text null, nohp text null, ig text null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT INTO biodata (no, nama, nim, kelas, alamat, nohp, ig) VALUES ('1', 'Azhadi Fadila', '10117277', 'IF-8', 'azhadifadila16@gmail.com', '082115304033', 'azhadi_');";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        // TODO Auto-generated method stub

    }

}