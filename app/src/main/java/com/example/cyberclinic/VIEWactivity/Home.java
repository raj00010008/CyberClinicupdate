package com.example.cyberclinic.VIEWactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import com.example.cyberclinic.R;
import com.example.cyberclinic.RoomDataBase.RegistrationDAO;
import com.example.cyberclinic.RoomDataBase.RegistrationRoomDataBase;
import com.example.cyberclinic.RoomDataBase.RegistrationTable;
import com.example.cyberclinic.ViewModel.RegistrationViewModel;

import java.util.List;

public class Home extends AppCompatActivity {
    TextView email, name;
    RegistrationTable registrationTable;
    RegistrationViewModel registrationViewModel;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();
        email = findViewById(R.id.email);
        name = findViewById(R.id.name);
        registrationViewModel = ViewModelProviders.of(this).get(RegistrationViewModel.class);
        registrationViewModel.getAllData().observe(this, new Observer<List<RegistrationTable>>() {
            @Override
            public void onChanged(List<RegistrationTable> registrationTables) {

            }
        });


//    updatedata();
    }


//    private void updatedata() {
//        RegistrationDAO registrationDAO = RegistrationRoomDataBase.getDatabase(context).registrationDAO();
//        RegistrationTable displaydata = registrationDAO.getDataByid("sushil");
//        displaydata.getEmail();
//    }


}
