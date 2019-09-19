package com.example.cyberclinic.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.cyberclinic.Repository.RegistrationRepository;
import com.example.cyberclinic.RoomDataBase.RegistrationTable;
import com.example.cyberclinic.VIEWfragment.LoginFragment;

import java.util.List;

public class RegistrationViewModel extends AndroidViewModel {
    private LoginFragment loginFragment;
    private RegistrationRepository registrationRepository;
    private LiveData<List<RegistrationTable>> listLiveData;

    public RegistrationViewModel(@NonNull Application application) {
        super(application);
        loginFragment=new LoginFragment();
        registrationRepository = new RegistrationRepository(application);
        listLiveData = registrationRepository.getAllData();
    }

    public void insert(RegistrationTable data) {
        registrationRepository.insertData(data);
    }

    public LiveData<List<RegistrationTable>> getAllData() {
        return listLiveData;
    }
}
