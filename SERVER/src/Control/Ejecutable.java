package Control;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.nio.Buffer;

import Modelo.BaseDeDatos;
import Modelo.SW;

public class Ejecutable {

	private final static int TIME = 10000;
	private final static int PORT = 5655;
	private static DatagramSocket socket;
	private static int SIZE_BUFFER = 1000000;
	private static byte buffer[];
	private static SW model;

	public static void main(String args[]) throws Exception {

		socket = new DatagramSocket(PORT);
		socket.setSoTimeout(TIME);

		model = new SW();

		while (true) {

			try {
				buffer = new byte[SIZE_BUFFER];
				DatagramPacket packet = new DatagramPacket(buffer, SIZE_BUFFER);
				socket.receive(packet);
				String msj = new String(buffer);
				(new ThreadAttend(packet.getSocketAddress(), msj)).start();

			} catch (Exception e) {
				// e.printStackTrace();
			}
		}
	}

	private static class ThreadAttend extends Thread {

		private SocketAddress client;
		private String question;

		ThreadAttend(SocketAddress client, String question) {
			this.client = client;
			this.question = question;
		}

		public void run() {
			try {
				// Protocol
				if (question.equals("Protocol")) {
					byte[] buff = ("HOLI SERVER").getBytes();
					DatagramPacket send = new DatagramPacket(buff, buff.length, client);
					socket.send(send);
				} else {

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}