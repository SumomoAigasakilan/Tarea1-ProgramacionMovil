package sumomo.aigasaki.tarea1primerparcial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private EditText EnviarNombre;
    private EditText EnviarCuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button GenerarTarjeta = findViewById(R.id.btnGuardar);
        EditText EnviarNombre =findViewById(R.id.EditNombre);
        EditText EnviarCuenta= findViewById(R.id.EditCuenta);

                GenerarTarjeta.setOnClickListener((view  -> {

                            if (!EnviarNombre.getText().toString().isEmpty() && !EnviarCuenta.getText().toString().isEmpty()){
                                Intent generar = new Intent(this, Tarjeta.class);
                                startActivity(generar);
                                EnviarNombre.setText("");
                                EnviarCuenta.setText("");
                            }
                            else if (EnviarNombre.getText().toString().isEmpty()){
                                mostrarMensaje1(view);
                            }
                            else if(EnviarCuenta.getText().toString().isEmpty()){
                                mostrarMensaje2(view);
                            }
                }));

    }


    @Override
    public void onStart() {
        super.onStart();
        Log.i("Ciclo", "onStart");
    }

    @Override
    protected void onResume () {
        super.onResume();
        Log.i("Ciclo", "onResume");
    }
    @Override
    protected void onPause () {
        super.onPause();
        Log.i("Ciclo", "onPause");
    }
    @Override
    protected void onStop () {
        super.onStop();
        Log.i("Ciclo", "onStop");
    }
    @Override
    protected void onDestroy () {
        super.onDestroy();
        Log.i("Ciclo", "onDestroy");
    }

    private void mostrarMensaje1 (View view) {

        Toast.makeText(MainActivity.this, "Por favor ingrese un nombre", Toast.LENGTH_LONG).show();

    }
    private void mostrarMensaje2 (View view) {

        Toast.makeText(MainActivity.this, "Por favor ingrese un  numero de cuenta", Toast.LENGTH_LONG).show();

    }
}

