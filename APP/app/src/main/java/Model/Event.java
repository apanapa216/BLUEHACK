package Model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by jormo on 5/11/2017.
 */

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
