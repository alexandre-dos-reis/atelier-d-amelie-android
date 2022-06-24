package com.example.atelier_d_amelie_android.model.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(indices = { @Index(value = {"key"}, unique = true) })
public class EnvVar {

    @PrimaryKey
    public int id;

    @ColumnInfo(name = "key")
    public String key;

    @ColumnInfo(name = "value")
    public String value;

}
