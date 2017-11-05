package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by jormo on 5/11/2017.
 */

public class User {

    private String nombre;
    private String apellido;
    private ArrayList<String> planes;
    private double puntaje;

    private String routeImage;
    private String routeBack;

    public User(){
        try {
            BufferedReader in = new BufferedReader(new FileReader(new File(routeImage)));
            
        }catch (Exception e) {

        }
    }

}
