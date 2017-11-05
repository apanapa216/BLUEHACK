package Model;

import java.util.Date;

/**
 * Created by jormo on 5/11/2017.
 */

public class Parent {

    private String relacion;
    private String nombres;
    private Date fechaNacimiento;
    private int cedula;

    public Parent(String relacion, String nombres, Date fechaNacimiento, int cedula){
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.nombres = nombres;
        this.relacion = relacion;
    }
}
