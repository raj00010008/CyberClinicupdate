package com.example.cyberclinic.RoomDataBase;

import android.content.Context;


import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {RegistrationTable.class}, version = 3, exportSchema = false)
public abstract class RegistrationRoomDataBase extends RoomDatabase {
    public abstract RegistrationDAO registrationDAO();

    private static RegistrationRoomDataBase INSTANCE;

    public static RegistrationRoomDataBase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (RegistrationRoomDataBase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context, RegistrationRoomDataBase.class, "Registration_Database")
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
