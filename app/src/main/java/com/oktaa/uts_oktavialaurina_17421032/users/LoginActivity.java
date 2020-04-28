package com.oktaa.uts_oktavialaurina_17421032.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.oktaa.uts_oktavialaurina_17421032.R;
import com.oktaa.uts_oktavialaurina_17421032.RegistrasiActivity;

public class LoginActivity extends AppCompatActivity {

    private Button btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        btnDaftar = (Button) findViewById(R.id.btnDaftar);
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RegistrasiActivity();
            }
        });
    }


    public void RegistrasiActivity() {
        Intent intent = new Intent(this, RegistrasiActivity.class);
        startActivity(intent);
    }

}


