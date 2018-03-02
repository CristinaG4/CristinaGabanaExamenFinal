package com.example.a21621866.cristinagabanaexamenfinal;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    TextView tituloLogin;
    TextInputEditText userNameField, passwordField;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        tituloLogin = findViewById(R.id.tituloLogin);
        userNameField = findViewById(R.id.userNameField);
        passwordField = findViewById(R.id.passwordField);
        btnLogin = findViewById(R.id.btnLogin);

        //Fuente titulo
        Typeface myFont = Typeface.createFromAsset(getAssets(), "Nettizen_TRIAL.ttf");
        tituloLogin.setTypeface(myFont);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        });
    }
}
