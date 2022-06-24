package com.example.atelier_d_amelie_android.model.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.atelier_d_amelie_android.model.entity.EnvVar;

import java.util.List;

@Dao
public interface EnvVarDao {

    @Query("SELECT * FROM envVar")
    List<EnvVar> getAll();

    @Query("SELECT * FROM envVar WHERE `key` LIKE :k LIMIT 1")
    EnvVar findByKey(String k);

    @Insert
    void insertAll(EnvVar... envVars);

    @Delete
    void delete(EnvVar envVar);

}
