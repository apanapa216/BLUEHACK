package dan_art.sknowcoin.layout_handlers;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;
import com.jorgemoreno971.segurobolivarapp.R;

import dan_art.sknowcoin.Firebase.Autenticacion;
import dan_art.sknowcoin.Firebase.ConexionFirebase;
import dan_art.sknowcoin.R;
import dan_art.sknowcoin.modelo.Usuario;
import dan_art.sknowcoin.modelo.copySKnowCoin;

/**
 * Created by dan_a on 11/05/2017.
 */

public class LoginActivity extends AppCompatActivity {


    public final static String USUARIO_PREFERENCES = "USUARIO_PREFERENCES";

    private EditText correo;
    private EditText contrasena;

    private Button loginButton;
    private Button singupButton;

    private SharedPreferences preferences;

    private SharedPreferences prefs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        correo = (EditText) findViewById(R.id.editText_correo);
        contrasena = (EditText) findViewById(R.id.editText_contrasena);

        loginButton = (Button) findViewById(R.id.button_login);
        singupButton = (Button) findViewById(R.id.iniciar_registro_enLogin);

        prefs = getSharedPreferences(USUARIO_PREFERENCES, Context.MODE_PRIVATE);

        String codigo = prefs.getString("codigo_usuario", "000");

        if(codigo != "000"){

            Intent intent = new Intent(this, HomeActivity.class);
            intent.putExtra("codigo_usuario", codigo);
            intent.putExtra("materia","home");
            startActivity(intent);

        }
    }

    public void clickLogin(View v) {

        final String elCorreo = correo.getText().toString();
        String laContrasena = contrasena.getText().toString();

    }// click login

    private boolean isEmpty(EditText etText) {
        return etText.getText().toString().trim().length() == 0;
    }

    public void mostrarToast(String mensaje) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, mensaje, duration);
        toast.show();
    }// mostrar toast

    public void iniciarRegistro(View v) {
       // Intent intent = new Intent(this, SingUpActivity_uno.class);
       // startActivity(intent);
    }// click Registro

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }

}
