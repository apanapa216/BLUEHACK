package Model;

import java.io.Serializable;


public class Plain implements Serializable {

    private String titulo;
    private String  descripcion;
    private double valor;

    public Plain(String titulo, String descripcion, double valor){
        this.descripcion= descripcion;
        this.titulo = titulo;
        this.valor = valor;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public double getValor(){
        return valor;
    }

}
