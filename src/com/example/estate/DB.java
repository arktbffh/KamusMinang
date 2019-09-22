package com.example.estate;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DB extends SQLiteOpenHelper {
 private static final String DATABASE_NAME = "dbkamus";
 public static final String INDONESIA = "indonesia";
 public static final String MINANG= "minang";
 public static final String DESKRIPSI="deskripsi";



 //Constructor DataKamus untuk initiate database
 public DB(Context context) {
  super(context, DATABASE_NAME, null, 1);
 }

 //method createTable untuk membuat table kamus
 public void createTable(SQLiteDatabase db){
  db.execSQL("DROP TABLE IF EXISTS kamus");
  db.execSQL("CREATE TABLE if not exists kamus (id INTEGER PRIMARY KEY AUTOINCREMENT, indonesia TEXT, minang TEXT);");
 }

 //method generateData untuk mengisikan data ke kamus.
 public void generateData(SQLiteDatabase db){
  ContentValues cv=new ContentValues();
  
  cv.put(INDONESIA, "ada");
  cv.put(MINANG, "ado");
  db.insert("kamus", MINANG, cv);
  
  cv.put(INDONESIA, "kakak");
  cv.put(MINANG, "uda");

  db.insert("kamus", MINANG, cv);
  cv.put(INDONESIA, "kakak");
  cv.put(MINANG, "uda");

  db.insert("kamus", MINANG, cv);
  
  
  

  
  
 }

 @Override
 public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
  // TODO Auto-generated method stub
 }

 @Override
 public void onCreate(SQLiteDatabase db) {
  // TODO Auto-generated method stub
 }
}
