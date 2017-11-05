package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDeDatos {

	private Connection conexion;

	public void conexion() throws SQLException, ClassNotFoundException {
		conexion = null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conexion = DriverManager.getConnection("jdbc:mysql://200.3.193.22:3306/P09728_1_2", "P09728_1_2",
					"DoDk3k7Y");
		} catch (SQLException ex) {
			System.out.println("No se puede conectar a la base de datos: " + ex.getMessage());
		} catch (ClassNotFoundException ex) {
			System.out.println("No exíste el paquete: " + ex.getMessage());
		} catch (InstantiationException e) {
			System.out.println("Error al conectarse: " + e.getMessage());
		} catch (IllegalAccessException e) {
			System.out.println("Error al conectarse: " + e.getMessage());
		}

	}

	public Connection darConectar() {
		return conexion;
	}

	public void cerrar() throws SQLException {
		if (conexion != null) {
			conexion.close();
		}
	}

}
