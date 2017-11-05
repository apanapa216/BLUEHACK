package Modelo;

public class Plan {

	/**
	 * 
	 */
	private String titulo;

	/**
	 * 
	 */
	private String descripcion;

	/**
	 * 
	 */
	private double precio;

	/**
	 * 
	 * @param titulo
	 * @param descripcion
	 * @param precio
	 */
	public Plan(String titulo, String descripcion, double precio) {
		this.setTitulo(titulo);
		this.setDescripcion(descripcion);
		this.setPrecio(precio);
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio
	 *            the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion
	 *            the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo
	 *            the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
