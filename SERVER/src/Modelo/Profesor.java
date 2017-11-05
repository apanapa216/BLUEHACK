package Modelo;

import java.util.ArrayList;
import java.util.Date;

public class Profesor {

	private String cedula;
	private String nombres;
	private String apellidos;
	private String direccion;
	private String usuario;
	private String contrase�a;
	private long tiempoPoliza;
	private Date fechaNacimiento;
	private ArrayList<Plan> planes;

	/**
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}

	/**
	 * @param cedula
	 *            the cedula to set
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}

	/**
	 * @param nombres
	 *            the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos
	 *            the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion
	 *            the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario
	 *            the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the contrase�a
	 */
	public String getContrase�a() {
		return contrase�a;
	}

	/**
	 * @param contrase�a
	 *            the contrase�a to set
	 */
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	/**
	 * @return the tiempoPoliza
	 */
	public long getTiempoPoliza() {
		return tiempoPoliza;
	}

	/**
	 * @param tiempoPoliza
	 *            the tiempoPoliza to set
	 */
	public void setTiempoPoliza(long tiempoPoliza) {
		this.tiempoPoliza = tiempoPoliza;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento
	 *            the fechaNacimiento to set
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the planes
	 */
	public ArrayList<Plan> getPlanes() {
		return planes;
	}

	/**
	 * @param planes
	 *            the planes to set
	 */
	public void setPlanes(ArrayList<Plan> planes) {
		this.planes = planes;
	}

}
