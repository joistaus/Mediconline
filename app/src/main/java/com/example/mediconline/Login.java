package com.example.mediconline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText txtUsuario, txtClave;
    private Button btnLogin, btnRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        txtClave = (EditText) findViewById(R.id.txtClave);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnRegistro = (Button) findViewById(R.id.btnRegistro);
    }

    public void registrarse(View view){
        Intent intent = new Intent(
                this,
                FormularioRegistro.class
        );
        startActivity(intent);
    }

    public void iniciarSesion(View view){
        Toast toast = Toast.makeText(
                getApplicationContext(),
                "Usted no cuenta con un usuario.",
                Toast.LENGTH_SHORT
        );
        toast.show();
    }
}