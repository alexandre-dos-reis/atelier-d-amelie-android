package com.example.atelier_d_amelie_android.model;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.atelier_d_amelie_android.model.dao.PictureDao;
import com.example.atelier_d_amelie_android.model.entity.EnvVar;
import com.example.atelier_d_amelie_android.model.entity.Picture;

// https://developer.android.com/training/data-storage/room#java

@Database(entities = {Picture.class, EnvVar.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract PictureDao pictureDao();
    public abstract EnvVar envVar();

}
