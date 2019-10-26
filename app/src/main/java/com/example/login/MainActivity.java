package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtnom,txtcla;
    Button btnvali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnom  = findViewById(R.id.txtnom);
        txtcla  = findViewById(R.id.txtcla);
        btnvali = findViewById(R.id.btnvalidar);

        btnvali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtnom.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Campo Nombre Vacio", Toast.LENGTH_SHORT).show();
                    return;
                }else{
                    if (txtcla.getText().toString().isEmpty()){
                        Toast.makeText(MainActivity.this, "Campo Clave vacio", Toast.LENGTH_SHORT).show();
                        return;
                    }
                }
                    if (txtnom.getText().toString().equals("yorvin palacios") &&
                            txtcla.getText().toString().equals("palacios")) {
                        Intent b = new Intent(MainActivity.this,MenuActivity.class);
                        String nombre = txtnom.getText().toString();
                        b.putExtra("nombre",nombre);
                        startActivity(b);
                    } else {
                        Toast.makeText(MainActivity.this, "usuario o contraseña incorrectas", Toast.LENGTH_SHORT).show();
                    }

                }

        });
    }
}
