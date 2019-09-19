package com.example.cyberclinic.VIEWfragment;


import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.cyberclinic.Api.ApiClient;
import com.example.cyberclinic.Api.ApiUserService;
import com.example.cyberclinic.R;
import com.example.cyberclinic.RoomDataBase.RegistrationTable;
import com.example.cyberclinic.VIEWactivity.Home;
import com.example.cyberclinic.ViewModel.RegistrationViewModel;
import com.example.cyberclinic.VIEWactivity.LoginPage;
import com.example.cyberclinic.model.UserData;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    private static final String TAG = "Abc";
    Button login;
    EditText email, password, alert_Dialog;
    View view;
    LayoutInflater layoutInflater;
    TextView forgotPass;
    ImageView registration;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    String passwordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,}$";
    RegistrationViewModel registrationViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_login, container, false);
        login = view.findViewById(R.id.login);
        email = view.findViewById(R.id.E_mail);

        alert_Dialog = view.findViewById(R.id.editText_dialog);
        password = view.findViewById(R.id.password);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginRegisterUser();
            }
        });
        registrationViewModel = ViewModelProviders.of(this).get(RegistrationViewModel.class);
        registrationViewModel.getAllData().observe(this, new Observer<List<RegistrationTable>>() {

            @Override
            public void onChanged(List<RegistrationTable> registrationTables) {

            }
        });

        registration = view.findViewById(R.id.back_action);
        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((LoginPage) getActivity()).callFragmentRegistration();
            }
        });
        forgotPass = view.findViewById(R.id.forgotPassword);
        forgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prompt();
            }
        });

        return view;

    }


    private void prompt() {
        LayoutInflater factory = LayoutInflater.from(getContext());
        final View deleteDialogView = factory.inflate(R.layout.dialog_edittext_layout, null);
        final AlertDialog.Builder deleteDialog = new AlertDialog.Builder(getContext());
        deleteDialog.setView(deleteDialogView);
        deleteDialog.setTitle("Enter E-mail");
        deleteDialog.setPositiveButton("Send", null);
        deleteDialog.setNegativeButton("Cancel", null);
        deleteDialog.show(); }

    private void loginRegisterUser() {
        String checkEmail = email.getText().toString().trim();
        String checkPassword = password.getText().toString().trim();
        validation(checkEmail, checkPassword);

    }
    private void validation(String checkEmail, String checkPassword) {

        if (TextUtils.isEmpty(checkEmail)) {
            email.setError("Please enter your email addres");
            return;
        }
        if (TextUtils.isEmpty(checkPassword)) {
            password.setError("please enter Password");
            return;
        }

        if (!checkEmail.matches(emailPattern)) {
            email.setError("Please enter valid email addres");
            return;
        }

        onValidate(checkEmail, checkPassword);
    }

    private void onValidate(final String email, final String password) {
        ApiUserService apiService = ApiClient.getClient().create(ApiUserService.class);
        apiService.loginUser(email, password, "", "", "").enqueue(new Callback<UserData.Data>() {
            @Override
            public void onResponse(Call<UserData.Data> call, Response<UserData.Data> response) {
                Log.i(TAG, "post submitted to API.");

               RegistrationTable registrationTable =new RegistrationTable(response.body().getEmail(),response.body().getPassword(),response.body().getMobileno(),response.body().getName(),response.body().getLastname());
                registrationViewModel.insert(registrationTable);
                Toast.makeText(getContext(), "data is saved", Toast.LENGTH_SHORT).show();

                Intent myIntent = new Intent(getActivity(), Home.class);
                getActivity().startActivity(myIntent);

                // ((LoginPage) getActivity()).callFragmentLogin();
            }

            @Override
            public void onFailure(Call<UserData.Data> call, Throwable t) {
                Log.e(TAG, "Unable to submit post to API.");
            }
        });


    }


}
