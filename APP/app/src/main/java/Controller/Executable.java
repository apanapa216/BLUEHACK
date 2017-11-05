package Controller;

import android.util.Log;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import Model.User;

public class Executable {

    private final static String HOST = "localhost";
    private final static int TIME = 10000;
    private final static int PORT = 5655;
    private static DatagramSocket socket;
    private static int SIZE_BUFFER = 1000000;
    private static byte buffer[];
    private static User user;

    public static void main(String args[])throws Exception{
        socket = new DatagramSocket(PORT, InetAddress.getByName(HOST));
        buffer = new byte[SIZE_BUFFER];
        DatagramPacket packet = new DatagramPacket(buffer,buffer.length,InetAddress.getByName(HOST),PORT);
        try {
            user = new User();
        }catch (Exception e){
            try {
                //Pidale la informacion al server
            }catch (Exception e2){
                Log.e("ERROR", "Lo sentimos no hemos podido establecer una conexion con el servidor");
                System.exit(1);
            }
        }
    }
}
