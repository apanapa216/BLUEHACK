package Layout_Handlers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.jorgemoreno971.segurobolivarapp.R;

import java.util.ArrayList;

import Model.User;


public class AdaptadorTutoriaBuscada extends ArrayAdapter<User> {

    Activity activity;
    Context context;
    int index;

    private static final String TAG = "MyTutorSerch";

    public AdaptadorTutoriaBuscada(Context context, ArrayList<User> tutorias, Activity activity) {
        super(context, 0, tutorias);
        this.activity = activity;
        this.context=context;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        final User tutor = getItem(position);
        index = position;

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_tutor, parent, false);
        }// convert view not null

        // Lookup view for data population
        TextView tvNombreTutor = (TextView) convertView.findViewById(R.id.tutor_nombre);

        // LLenar los viwes con el contenido del usuario
        tvNombreTutor.setText(tutor.getNombre());

        ImageButton ver = (ImageButton) convertView.findViewById(R.id.btn_eye);
        ver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mostrarToast("Vista Previa " + position);
                //Intent intent = new Intent(getContext(), HomeActivity.class);
                //intent.putExtra("materia",tutor.getNombre());
                //intent.putExtra("char",'a');
                //getContext().startActivity(intent);
            }
        });
        // Return the completed view to render on screen
        return convertView;
    }// view

    public void mostrarToast(String mensaje) {
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, mensaje, duration);
        toast.show();
    }// mostrar toast

}
