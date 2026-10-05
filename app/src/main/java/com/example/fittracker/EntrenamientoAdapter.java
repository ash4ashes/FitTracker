package com.example.fittracker;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class EntrenamientoAdapter extends RecyclerView.Adapter<EntrenamientoAdapter.ViewHolder> {
    //Datos del adaptador
    ArrayList<EntrenamientoModel> datos ;
    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        private final TextView entrenamiento;
        private final TextView minutos;
        private final TextView intensidad;

        public ViewHolder(View v)
        {
            super(v);
            entrenamiento = v.findViewById(R.id.Tipos_Entrenamiento);
            minutos = v.findViewById(R.id.Minutos_Entrenamiento);
            intensidad = v.findViewById(R.id.Intensidad_Entrenamiento);
        }
    }

    EntrenamientoAdapter (ArrayList<EntrenamientoModel> datos_entrenamiento) {datos = datos_entrenamiento ;}

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.entrenamiento_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(vista);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int posicion_actual )
    {
        EntrenamientoModel entrenamientoActual = datos.get(posicion_actual);
        viewHolder.entrenamiento.setText(entrenamientoActual.ENTRENAMIENTO);
        viewHolder.minutos.setText(entrenamientoActual.MINUTOS);
        viewHolder.intensidad.setText(entrenamientoActual.INTENSIDAD);
    }
    @Override
    public int getItemCount() {return datos.size();}
}
