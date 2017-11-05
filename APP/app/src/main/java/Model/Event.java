package Model;

import java.io.Serializable;
import java.util.Date;


public class Event implements Serializable{

    private String descripcion;
    private String titulo;
    private String lugar;
    private Date fecha;

    public Event(String descripcion,String titulo, String lugar, Date fecha ){
        this.descripcion= descripcion;
        this.titulo = titulo;
        this.lugar= lugar;
        this.fecha = fecha;
    }

}
