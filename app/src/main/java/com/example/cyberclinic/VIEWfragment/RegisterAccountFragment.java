package com.example.cyberclinic.VIEWfragment;


import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.cyberclinic.R;
import com.example.cyberclinic.RoomDataBase.RegistrationTable;
import com.example.cyberclinic.VIEWactivity.Home;
import com.example.cyberclinic.ViewModel.RegistrationViewModel;
import com.example.cyberclinic.VIEWactivity.LoginPage;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterAccountFragment extends Fragment {
    Button registrationButton;
    EditText firstName, lastName, email, password, mobileNumber, confirmPassword;
    View view;
    TextView signInClicked;
    RegistrationViewModel registrationViewModel;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    String passwordPattern="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,}$";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_register_account, container, false);
        firstName = view.findViewById(R.id.setFirstName);
        lastName = view.findViewById(R.id.setLastName);
        email = view.findViewById(R.id.setE_mail);
        password = view.findViewById(R.id.setPassword);
        signInClicked=view.findViewById(R.id.signIn);
        mobileNumber = view.findViewById(R.id.setMobileNumber);
        confirmPassword = view.findViewById(R.id.confirmPassword);
        registrationButton = view.findViewById(R.id.newRegister);
        registrationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newRegistration();
            }
        });
        registrationViewModel = ViewModelProviders.of(this).get(RegistrationViewModel.class);
        registrationViewModel.getAllData().observe(this, new Observer<List<RegistrationTable>>() {
            @Override
            public void onChanged(List<RegistrationTable> registrationTables) {

            }
        });

        signInClicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((LoginPage) getActivity()).callFragmentLogin();
            }
        });
        return view;
    }


    private void newRegistration() {


        String saveFirstName = firstName.getText().toString().trim();
        String saveLastName = lastName.getText().toString().trim();
        String saveEmail = email.getText().toString().trim();
        String savePassword = password.getText().toString().trim();
        String saveMobile = mobileNumber.getText().toString().trim();
        //   int saveMobileNumber = Integer.parseInt(saveMobile);
        String checkPassword = confirmPassword.getText().toString().trim();
        validData(saveFirstName, saveLastName, saveEmail, savePassword, saveMobile, checkPassword);

    }

    private void validData(String saveFirstName, String saveLastName, String saveEmail, String savePassword, String saveMobile, String checkPassword) {

        if (TextUtils.isEmpty(saveFirstName)) {
            firstName.setError("please enter First Name");
            return;
        }
        if (TextUtils.isEmpty(saveLastName)) {
            lastName.setError("please enter Last Name");
            return;
        }
        //   if (!(saveMobile != null))
//        {
//            mobileNumber.setError("please enter Mobile Number");status=true;
//        }
        if (TextUtils.isEmpty(saveEmail)) {
            email.setError("please enter Email");
            return;
        }

        if(!saveEmail.matches(emailPattern))
        {
            email.setError("Please enter valid email addres");
            return;
        }

        if (TextUtils.isEmpty(checkPassword)) {
            confirmPassword.setError("please enter Password");
            return;
        }
        if (!checkPassword.equals(savePassword)) {
            confirmPassword.setError("Password is not match");
            return;
        }
        if (TextUtils.isEmpty(savePassword)) {
            password.setError("please enter Password");
            return;
        }

        if(!savePassword.matches(passwordPattern)) {
            password.setError("please enter Valid Password,should contain atleast 0-9,Aa-Za,@ and 4 digit ");

            return;
        }

        onValidData(saveFirstName, saveLastName, saveEmail, savePassword, saveMobile, checkPassword);
    }

    private void onValidData(String saveFirstName, String saveLastName, String saveEmail, String savePassword, String saveMobile, String checkPassword) {
RegistrationTable registrationTable =new RegistrationTable(saveEmail,savePassword,saveMobile,saveFirstName,saveLastName);

     registrationViewModel.insert(registrationTable);
//        Toast.makeText(getContext(), "data is saved", Toast.LENGTH_SHORT).show();
//        ((LoginPage) getActivity()).callFragmentLogin();



    }


}


