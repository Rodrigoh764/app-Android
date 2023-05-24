package com.example.exa_3er_hernandez_ap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText etPasswordRH;
    public Button btnEntrarRH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Integracion de XML a JAVA
        etPasswordRH = findViewById(R.id.etPasswordRH);
        btnEntrarRH = findViewById(R.id.btnEntrarRH);

        btnEntrarRH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etPasswordRH.getText().toString().equals("uacm123")) { //Si es la correcta entra
                    Intent intent1 = new Intent(view.getContext(), Video.class);
                    startActivityForResult(intent1,0);
                } else { //Condicion falsa
                    Toast.makeText(MainActivity.this,"Contraseña incorrecta\nVerifica!!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}