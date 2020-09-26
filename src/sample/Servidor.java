package sample;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Servidor{
    public static int Puerto = 0;

    public static void main(String[] args) throws IOException {

        ServerSocket ss = null;
        ss = new ServerSocket(0);
        Puerto = ss.getLocalPort();
        System.out.println(Puerto);

        while(true){
            Socket s = null;
            try {
                s = ss.accept();

                DataInputStream dis = new DataInputStream(s.getInputStream());
                DataOutputStream dos = new DataOutputStream(s.getOutputStream());

                Thread t = new ClientHandler(s, dis, dos);
                t.start();
            } catch (IOException e) {
                s.close();
                e.printStackTrace();
            }

            }


    }
}
