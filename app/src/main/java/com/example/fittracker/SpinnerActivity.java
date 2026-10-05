package com.example.fittracker;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SpinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_spinner);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //Al elegir un ejercicio se pasa a la pantalla siguiente
        int[] opciones = {
                R.id.Yoga_Spinner_btn,
                R.id.Fuerza_Spinner_btn,
                R.id.Calistenia_Spinner_btn,
                R.id.Cardio_Spinner_btn
        };
        for (int id : opciones) {
            findViewById(id).setOnClickListener(view ->
                    startActivity( new Intent(SpinnerActivity.this, RecyclerActivity.class) )
            );
        }
    }
}