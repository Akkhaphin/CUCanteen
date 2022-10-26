package com.example.cucanteen;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Product.class}, version = 1)
public abstract class cartDatabase extends RoomDatabase
{
    public abstract ProductDao ProductDao();
}
