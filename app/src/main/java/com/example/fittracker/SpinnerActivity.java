package com.example.fittracker;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity {
    Button btn_Volver;
    Spinner Entrenamiento_Spinner;
    ArrayList<String> Tipos_de_Ejercicios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_spinner);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), ((v, insets) -> ) {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btn_Volver = findViewById(R.id.btn_Spinner_Volver);
        Entrenamiento_Spinner = findViewById(R.id.Entrenamiento_Spinner);
         //Tipos de ejercicios
        Tipos_de_Ejercicios = new ArrayList<String>();
        Tipos_de_Ejercicios.add("Yoga");
        Tipos_de_Ejercicios.add("Cardio");
        Tipos_de_Ejercicios.add("Fuerza");
        Tipos_de_Ejercicios.add("Calistenia");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Tipos_de_Ejercicios);
        Entrenamiento_Spinner.setAdapter(adapter);
    }
}
