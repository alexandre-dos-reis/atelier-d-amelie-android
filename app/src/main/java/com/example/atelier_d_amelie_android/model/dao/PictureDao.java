package com.example.atelier_d_amelie_android.model.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.atelier_d_amelie_android.model.entity.Picture;

import java.util.List;

@Dao
public interface PictureDao {

    @Query("SELECT * FROM picture")
    List<Picture> getAll();

    @Query("SELECT * FROM picture WHERE id IN (:pictureIds)")
    List<Picture> getAllByIds(int[] pictureIds);

    @Query("SELECT * FROM picture WHERE filename LIKE :filename LIMIT 1")
    Picture findByFilename(String filename);

    @Insert
    void insertAll(Picture... pictures);

    @Delete
    void delete(Picture picture);

}
