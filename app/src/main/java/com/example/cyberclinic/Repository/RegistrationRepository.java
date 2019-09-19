package com.example.cyberclinic.Repository;

import android.app.Application;
import android.os.AsyncTask;
import android.widget.Toast;

import androidx.lifecycle.LiveData;

import com.example.cyberclinic.Api.ApiClient;
import com.example.cyberclinic.Api.ApiUserService;
import com.example.cyberclinic.RoomDataBase.RegistrationDAO;
import com.example.cyberclinic.RoomDataBase.RegistrationRoomDataBase;
import com.example.cyberclinic.RoomDataBase.RegistrationTable;


import java.util.List;

public class RegistrationRepository  {

    private RegistrationDAO registrationDAO;
    private LiveData<List<RegistrationTable>> listLiveData;
    private  RegistrationTable getItemById;
    public RegistrationRepository(Application application) {
        RegistrationRoomDataBase dataBase = RegistrationRoomDataBase.getDatabase(application);
        registrationDAO = dataBase.registrationDAO();
        listLiveData = registrationDAO.getAllData();

    }




//        data=getItemById.getEmail();
//      registrationDAO.getDataByid(data);


    public LiveData<List<RegistrationTable>> getAllData() {
        return listLiveData;
    }



    public void insertData(RegistrationTable data) {

        new RegistrationInsertion(registrationDAO).execute(data);
    }




    private class RegistrationInsertion extends AsyncTask<RegistrationTable, Void, Void> {
        private RegistrationDAO registrationDAO;

        public RegistrationInsertion(RegistrationDAO registrationDAO) {
            this.registrationDAO = registrationDAO;
        }


        @Override
        protected Void doInBackground(RegistrationTable... registrationTables) {
            registrationDAO.insertDetail(registrationTables[0]);
            return null;
        }
    }
}
