package com.example.testforproject.Db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

public class MyDataBaseHelper extends SQLiteOpenHelper {
    public static final String CREATE_FORM="create table Book("
        +"id integer primary key autoincrement,"
        +"author text,"
        +"price integer)";

    private Context mContext;

    public MyDataBaseHelper(Context context,String name,SQLiteDatabase.CursorFactory factory,int version){
        super(context,name,factory,version);
        mContext=context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_FORM);
        Log.e("DataBase","create successfully");
        Toast.makeText(mContext, "Has Created A Form", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
