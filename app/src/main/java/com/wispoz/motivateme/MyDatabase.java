package com.wispoz.motivateme;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
/**
 * Created by wispoz on 15.08.14.
 */
public class MyDatabase extends SQLiteAssetHelper {

    private static final String DATABASE_NAME = "motivates.db";
    private static final int DATABASE_VERSION = 2;

    public MyDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
}