package Model;

import android.util.Log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Created by jormo on 5/11/2017.
 */

public class User {

    private String nombre;
    private String apellido;
    private ArrayList<Plain> planes;
    private ArrayList<Event> eventos;
    private ArrayList<Parent> familiares;
    private double puntaje;

    private final static String ROUTE_IMAGE = "./data/images.txt";
    private final static String ROUTE_PLANS = "./data/plans.tx";
    private final static String ROUTE_PARENTS = "./data/parents.tx";
    private final static String ROUTE_EVENTS = "./data/events.txt";
    private final static String ROUTE_BACKUP = "./data/back.txt";

    public User() throws Exception {

        BufferedReader in = new BufferedReader(new FileReader(new File(ROUTE_BACKUP)));
        nombre = in.readLine();
        apellido = in.readLine();
        puntaje = Double.parseDouble(in.readLine());

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(ROUTE_PLANS)));

        try {
            planes = (ArrayList<Plain>) ois.readObject();
        } catch (Exception e) {

        }
        try {
            ois = new ObjectInputStream(new FileInputStream(new File(ROUTE_EVENTS)));
            eventos = (ArrayList<Event>) ois.readObject();

        } catch (Exception e) {

        }
        try {
            ois = new ObjectInputStream(new FileInputStream(new File(ROUTE_PARENTS)));
            familiares = (ArrayList<Event>) ois.readObject();

        } catch (Exception e) {

        }
        ois.close();
        in.close();
    }

    public User(String nombre, String apellido, double puntaje) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.puntaje = puntaje;
        planes = new ArrayList<>();
        eventos = new ArrayList<>();
        familiares = new ArrayList<>();
        write();
    }

    public void write() {

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(new File(ROUTE_BACKUP)));
            out.write(nombre + "\n" + apellido + "\n" + puntaje + "\n");
            out.close();

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(ROUTE_EVENTS)));
            oos.writeObject(eventos);
            oos.close();

            oos = new ObjectOutputStream(new FileOutputStream(new File(ROUTE_PLANS)));
            oos.writeObject(planes);
            oos.close();

            oos = new ObjectOutputStream(new FileOutputStream(new File(ROUTE_PARENTS)));
            oos.writeObject(parents);
            oos.close();

        } catch (Exception e) {
            Log.e("ERROR", "SAVE THE INFORMATION");

        }
    }
}
