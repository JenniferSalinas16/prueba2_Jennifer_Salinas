package com.doodlzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private Button btnInicio;
    private EditText editUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editUsuario = findViewById(R.id.editUsuario);
        btnInicio = findViewById(R.id.btnInicio);
    }

    public void onclickInicio(View view) {
        String usuario = editUsuario.getText().toString();

        if (usuario.equals("jennifer")) {
            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivity(intent);

        } else if (usuario.equals("guadalupe")) {
            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Usuario Incorrecto", Toast.LENGTH_LONG).show();
        }
    }


}
