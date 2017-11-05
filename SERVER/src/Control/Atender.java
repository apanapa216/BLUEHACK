package Control;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 
 * @author Jorge Andres Moreno Mera
 *
 */
public class Atender extends Thread {

	/**
	 * 
	 */
	private int TIME_OUT = 400000;

	/**
	 * 
	 */
	private DatagramSocket servidor;

	/**
	 * 
	 */
	private DatagramPacket paquete;

	/**
	 * 
	 * @param servidor
	 * @param paquete
	 */
	public Atender(DatagramSocket servidor, DatagramPacket paquete) {
		this.servidor = servidor;
		this.paquete = paquete;
		System.out.println(new String(paquete.getData()));
	}

	/**
	 * 
	 */
	public void run() {

		try {
			while (true) {
				servidor.receive(paquete);
				String peticion = "";

			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
