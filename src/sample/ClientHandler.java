package sample;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler extends Thread {

    final DataInputStream dis;
    final DataOutputStream dos;
    final Socket s;
    public ClientHandler(Socket s, DataInputStream dis, DataOutputStream dos) {
        this.s = s;
        this.dis = dis;
        this.dos = dos;
    }
    @Override
    public void run(){
        String recieved;
        String toreturn;
        while(true){
            try {
                dos.writeUTF("Se ha iniciado un chat!");

                recieved = dis.readUTF();



            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
