package dan_art.sknowcoin.layout_handlers;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

import dan_art.sknowcoin.R;
import dan_art.sknowcoin.modelo.SKnowCoinApp;
import dan_art.sknowcoin.modelo.Tutoria;
import dan_art.sknowcoin.modelo.Usuario;

/**
 * Created by Luisf0425 on 25/05/17.
 */

public class BuscarTutorActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    private ArrayList<Usuario> tutoriasTutores = new ArrayList<>();

    private AdaptadorTutoriaBuscada adaptadorTutorias;
    private ListView listaTutorias;
    private SKnowCoinApp sKnowCoinApp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_tutor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.menu_tutorias_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view_tutorias);
        navigationView.setNavigationItemSelectedListener(this);

        //LLENADO DE PRUEBA
        /*
        for (int i = 0; i < 15; i++) {
            String codigo = "A00028300";
            String hora = "Lunes 4:00 p.m";
            String materia = "Prueba Búsqueda Materia " + i;
            String area = "Tics";
            String nombreTutor = "Nombre de Prueba";
            String lugar = "Icesi";
            int precio = 18000;

            Tutoria nueva = new Tutoria(codigo, hora, materia, area, nombreTutor, precio, lugar);
            tutoriasMaterias.add(nueva);
        }// for que crea tutorias
        */
        sKnowCoinApp=new SKnowCoinApp();
        sKnowCoinApp.totalTutoriasPorTutor(this);

    }// on create

    public void list_view_content(){
        /// Asignacion del adaptador
        listaTutorias = (ListView) findViewById(R.id.tutorias_tutores_list_layout);

        actualizarLista();

        listaTutorias.setAdapter(adaptadorTutorias);
    }// contenido del list view

    public  void actualizarLista(){

        for(int i = 0; i < tutoriasTutores.size(); i++){
            // TODO
            adaptadorTutorias.notifyDataSetChanged();
        }// for top 5
    }// actualizar lista


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.menu_tutorias_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }//*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.areas_btn_medicina) {
            Intent intent = new Intent(this, AreasConocimientoActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent intent = new Intent(this, HomeActivity.class);
            intent.putExtra("materia","home");
            startActivity(intent);
        } else if (id == R.id.nav_edit_profile) {

        } else if (id == R.id.nav_materias) {

        } else if (id == R.id.nav_buscar_tutor) {

        } else if (id == R.id.nav_top_mensual) {

        } else if (id == R.id.nav_tutorias_solicitadas) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.menu_tutorias_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public ArrayList<Usuario> getTutoriasTutores() {
        return tutoriasTutores;
    }

    public void tutores(){
        adaptadorTutorias = new AdaptadorTutoriaBuscada(this, tutoriasTutores, this);

        list_view_content();
    }
}
