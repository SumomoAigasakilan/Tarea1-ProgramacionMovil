package sumomo.aigasaki.tarea1primerparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Tarjeta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarjeta);

        Button Atras = findViewById(R.id.btnAtras);
        TextView Nombre= findViewById(R.id.TxtPincipal);
        TextView Cuenta=findViewById(R.id.TxtSecundario);

        Atras.setOnClickListener((view  -> {

                Intent atras = new Intent(this, MainActivity.class);
                startActivity(atras);

        }));

    }

}