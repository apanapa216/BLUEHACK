package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDeDatos {

	private Connection conexion;
	private final static String HOST = "169.48.108.244";
	private final static String USER = "admin";
	private final static String NAME_BDD = "mydb";
	private final static String PASSWORD = "KYYXHVNSLIKTBDWQ";
	private final static int PORT = 3306;

	public void conexion() throws SQLException, ClassNotFoundException {
		con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://" + HOST + ":" + PORT + "/" + NAME_BDD, USER,
					PASSWORD);
		} catch (SQLException e) {
			System.out.println("No se puede conectar a la base de datos: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("No exíste el paquete: " + e.getMessage());
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


	public String consultaMensajes(){	
		Statement stmt=con.createStatement();
		stmt.executeQuery("Select descripcion from MensajeTipsSemanal where idMensajeTipsSemanal==1;");
		con.close();
	}

	public String eventos(){
	Statement stmt=con.createStatement();
	stmt.executeQuery(
			"Select fecha,descripcion from evento where id==1;"
			);
			con.close();

	}


	public String profesor(){


	Statement stmt=con.createStatement();
	stmt.executeQuery(
			"Select nombres,apellidos from Profesor where cedula==234247;"
			);
			con.close();

	}

	public String pregunta(){

	Statement stmt=con.createStatement();
	stmt.executeQuery(
			" Select pregunta from PreguntaJuego
	where idPreguntaJuego==1;"
			);
			con.close();
	}

	public String familiar(){

	Statement stmt=con.createStatement();
	stmt.executeQuery(
			"Select familiar.nombres,familiar.apellidos, profesor.nombres,profesor.apellidos from Profesor, Familiar
	where familiar.cedula==480933;"
			);
			con.close();

	}

	public String nombrePlan(){
	Statement stmt=con.createStatement();
	stmt.executeQuery(
			"Select nombrePlan from Plan
	where idPlan==1;"
			);
			con.close();

	}


}
