package com.example.travelexperts;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DBConnect {
        
//        extends SQLiteOpenHelper {
//
//    private static final String DATABASE_NAME = "TravelExpertsSqlLite.db";
//    private static final String PATH = "/data/data/com.example.christopherpotvin_assignment3/databases/";
//    private static final int VERSION = 1;
//    private Context context;
//
//    public DBConnect (Context context)
//    {
//        super(context, DATABASE_NAME, null, VERSION);
//        this.context = context;
//    }
//
//    public void copyDatabase() {
//        boolean exists = checkDatabase();
//        if (!exists)
//        {
//            this.getReadableDatabase();
//            try {
//                InputStream inputStream = context.getAssets().open(DATABASE_NAME);
//                OutputStream outputStream = new FileOutputStream(PATH + DATABASE_NAME);
//                byte [] buffer = new byte[1024];
//                int length;
//                while ((length = inputStream.read(buffer)) > 0)
//                {
//                    outputStream.write(buffer);
//                }
//                outputStream.flush();
//                outputStream.close();
//                inputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    private boolean checkDatabase() {
//        SQLiteDatabase db = null;
//        try {
//            db = SQLiteDatabase.openDatabase(PATH + DATABASE_NAME, null, SQLiteDatabase.OPEN_READONLY);
//        } catch (SQLiteException e) {
//            e.printStackTrace();
//        }
//        if (db != null)
//        {
//            db.close();
//        }
//        return db != null;
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//
//    }
}