package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MenuActivity extends AppCompatActivity {

    TextView txtnom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        txtnom = findViewById(R.id.txtnom);
        Bundle bundle = getIntent().getExtras();
        String nombre = bundle.getString("nombre");

        txtnom.setText("Bienvenido : " + nombre);
    }
}
