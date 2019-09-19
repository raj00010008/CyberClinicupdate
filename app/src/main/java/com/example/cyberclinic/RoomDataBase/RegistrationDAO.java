package com.example.cyberclinic.RoomDataBase;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface RegistrationDAO {
    @Query("select *from REGISTRATION_TABLE order by firstName ASC")
    LiveData<List<RegistrationTable>> getAllData();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertDetail(RegistrationTable data);
    @Delete
    void deleteInfo(RegistrationTable data);
//    @Query("select *from REGISTRATION_TABLE where email= :email limit 1")
//     RegistrationTable getDataByid(String email);

}
