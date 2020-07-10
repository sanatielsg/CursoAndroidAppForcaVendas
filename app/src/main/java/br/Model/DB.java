package br.Model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DB extends SQLiteOpenHelper {

    public static String DBName = "vendas.db";
    public static int versao = 1;

    public DB(Context ctx) {
        super(ctx, DBName, null, versao);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int antiga, int nova) {


    }
}
