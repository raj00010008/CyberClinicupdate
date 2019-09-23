package com.example.cyberclinic.Repository;

import android.app.Application;
import android.os.AsyncTask;
import android.util.Log;

import androidx.lifecycle.LiveData;

import com.example.cyberclinic.Api.ApiClient;
import com.example.cyberclinic.Api.ApiUserService;
import com.example.cyberclinic.RoomDataBase.RegistrationDAO;
import com.example.cyberclinic.RoomDataBase.RegistrationRoomDataBase;
import com.example.cyberclinic.RoomDataBase.RegistrationTable;
import com.example.cyberclinic.model.UserData;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegistrationRepository {
    private static final String TAG = "TagData";
    private RegistrationDAO registrationDAO;
    private LiveData<List<RegistrationTable>> listLiveData;

    public RegistrationRepository(Application application) {
        RegistrationRoomDataBase dataBase = RegistrationRoomDataBase.getDatabase(application);
        registrationDAO = dataBase.registrationDAO();
        listLiveData = registrationDAO.getAllData();
    }

    public void checkRepo(String email, String password) {
        ApiUserService apiService = ApiClient.getClient().create(ApiUserService.class);
        apiService.loginUser(email, password, "", "", "").enqueue(new Callback<UserData.Data>() {
            @Override
            public void onResponse(Call<UserData.Data> call, Response<UserData.Data> response) {
                RegistrationTable registrationTable = new RegistrationTable(response.body().getEmail(), response.body().getPassword(), response.body().getMobileno(), response.body().getName(), response.body().getLastname());
                insertData(registrationTable);
            }

            @Override
            public void onFailure(Call<UserData.Data> call, Throwable t) {
                Log.e(TAG, "Unable to submit post to API.");

            }
        });

    }

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
