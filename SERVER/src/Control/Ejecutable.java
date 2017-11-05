package Control;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.Buffer;

/**
 * 
 * @author Jorge Andres Morenno Mera
 *
 */
public class Ejecutable {

	/**
	 * 
	 */
	private final static int PUERTO = 5859;

	/**
	 * 
	 */
	private static DatagramSocket servidor;

	/**
	 * 
	 */
	private static boolean escuchar = true;

	/**
	 * 
	 */
	private static byte[] buffer;

	/**
	 * 
	 */
	private static DatagramPacket paquete;

	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		buffer = new byte[Integer.MAX_VALUE / 100000];
		servidor = new DatagramSocket(PUERTO);
		paquete = new DatagramPacket(buffer, buffer.length);
		while (escuchar) {
			try {
				servidor.receive(paquete);
				String peticion = new String(paquete.getData());
				//aqui toda la parte logica de la peticion
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
