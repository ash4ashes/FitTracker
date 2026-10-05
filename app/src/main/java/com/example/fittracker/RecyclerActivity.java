package com.example.fittracker;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class RecyclerActivity extends AppCompatActivity {
    RecyclerView recycler ;
    ArrayList<EntrenamientoModel> datos_entranimento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recycler);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recycler = findViewById(R.id.recycler_entrenamiento);
        datos_entranimento = new ArrayList<>();
        datos_entranimento.add(new EntrenamientoModel("Yoga", "10:00", "Baja"));
        datos_entranimento.add(new EntrenamientoModel("Fuerza", "14:00", "Media"));
        datos_entranimento.add(new EntrenamientoModel("Cardio", "60:00", "Media - Alta"));
        datos_entranimento.add(new EntrenamientoModel("Calistenia", "30:00", "Alta"));

        EntrenamientoAdapter adapter = new EntrenamientoAdapter(datos_entranimento);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(adapter);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}