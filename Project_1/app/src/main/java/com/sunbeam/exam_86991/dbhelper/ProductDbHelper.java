package com.sunbeam.exam_86991.dbhelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.sunbeam.exam_86991.entity.Product;


public class ProductDbHelper extends SQLiteOpenHelper {
    private static final String TABLENAME = "product";
    private static final String PRODUCT_ID = "pid";
    private static final String PRODUCT_NAME = "name";

    private static final String PRODUCT_Category = "category";
    private static final String PRODUCT_PRICE = "price";
    public ProductDbHelper(@Nullable Context context) {
        super(context, "dmc_db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE "
                +TABLENAME+ "("
                +PRODUCT_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "
                +PRODUCT_NAME+" TEXT, "
                +PRODUCT_Category+"TEXT,"
                +PRODUCT_PRICE+" double)";
        db.execSQL(sql);
    }

    public void insertProduct(Product product){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(PRODUCT_NAME,product.getName());
        values.put(PRODUCT_PRICE,product.getPrice());
        db.insert(TABLENAME,null,values);
    }

    public void deleteProduct(Product product){
        SQLiteDatabase db = getWritableDatabase();
        db.delete(TABLENAME,PRODUCT_ID+" = ?",new String[]{""+product.getId()});
    }
    public Cursor getAllProducts(){
        SQLiteDatabase db = getReadableDatabase();
        return db.query(TABLENAME,null,null,null,null,null,null);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
