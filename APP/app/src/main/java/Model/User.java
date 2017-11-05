package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * Created by jormo on 5/11/2017.
 */

public class User {

    private String nombre;
    private String apellido;
    private ArrayList<Plain> planes;
    private ArrayList<Event> eventos;
    private double puntaje;

    private final static String ROUTE_IMAGE = "./data/images.txt";
    private final static String ROUTE_PLANS = "./data/plans.tx";
    private final static String ROUTE_EVENTS = "./data/events.txt";
    private final static String ROUTE_BACKUP = "./data/back.txt";

    public User() throws Exception{

        BufferedReader in = new BufferedReader(new FileReader(new File(ROUTE_BACKUP)));
        nombre = in.readLine();
        apellido = in.readLine();
        puntaje = Double.parseDouble(in.readLine());

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(ROUTE_PLANS)));

        try {
            planes = (ArrayList<Plain>) ois.readObject();
        }catch (Exception e){

        }
        try {
            ois = new ObjectInputStream(new FileInputStream(new File(ROUTE_EVENTS)));
            eventos = (ArrayList<Event>) ois.readObject();

        }catch (Exception e){

        }
        ois.close();
        in.close();
    }

    public User(String nombre, String apellido, double puntaje){
        this.nombre = nombre;
        this.apellido = apellido;
        this.puntaje = puntaje;
        planes = new ArrayList<>();
        eventos = new ArrayList<>();
    }



}
