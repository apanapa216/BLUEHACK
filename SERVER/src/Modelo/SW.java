package Modelo;

import java.util.ArrayList;

public class SW {

	private BaseDeDatos bbd;
	private ArrayList<Plan> planes;

	public SW() {
		planes = new ArrayList<>();
		try {
			bbd = new BaseDeDatos();

		} catch (Exception e) {

		}
	}

	public String analisis(Profesor profesor) {
		return "";
	}
	


}
