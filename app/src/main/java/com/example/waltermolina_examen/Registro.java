package com.example.waltermolina_examen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    EditText usu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        usu = findViewById(R.id.editText6);
    }

    public void msg(View v){
        Toast.makeText(getApplicationContext(),"Monto guardado con éxito",Toast.LENGTH_SHORT).show();
        Intent menu = new Intent(Registro.this,Resumen.class);
        menu.putExtra("valorEnviado",usu.getText());
        startActivity(menu);
    }
}
