package com.example.atelier_d_amelie_android.model.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Picture {

    @PrimaryKey
    public int id;

    @ColumnInfo(name = "filename")
    public String filename;

    @ColumnInfo(name = "was_sent")
    public Boolean wasSent;

}
