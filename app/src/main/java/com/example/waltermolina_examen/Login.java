package com.example.waltermolina_examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText usu, pass;
    Button ingresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usu=findViewById(R.id.txtUsuMCWG);
        pass=findViewById(R.id.txtPassMCWG);
        ingresar=findViewById(R.id.butIngresarMCWG);

        Button ingresar = (Button) findViewById(R.id.butIngresarMCWG);
        ingresar.setOnClickListener(new View.OnClickListener() {

                                        @Override

                                        public void onClick(View v) {
                                            String usuario = ((EditText)findViewById(R.id.txtUsuMCWG)).getText().toString();
                                            String password = ((EditText)findViewById(R.id.txtPassMCWG)).getText().toString();
                                            if (usuario.equals("estudiante2019") &&password.equals("uisrael2019"))
                                            {
                                                Intent menu = new Intent(Login.this,Registro.class);
                                                menu.putExtra("valorEnviado",usu.getText());
                                                startActivity(menu);
                                            }
                                            else
                                            { Toast.makeText(getApplicationContext(),"Usuario o Contraseña incorrecta, verifique los datos ingresados",Toast.LENGTH_SHORT).show();
                                            }
                                        }
                                    }

        );    }

}
