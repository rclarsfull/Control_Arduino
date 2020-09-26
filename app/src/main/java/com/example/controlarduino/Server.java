package com.example.controlarduino;
import java.io.IOException;
import java.net.*;

public class Server extends Thread {

    private DatagramSocket socket;
    private boolean running;
    int port;
    private byte[] buf = new byte[256];

    public Server(int port) {
        this.port=port;
        try {
            socket = new DatagramSocket(port);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }


    public void sendUdpPacket(InetAddress address, byte[] buf){
        DatagramPacket packet = new DatagramPacket(buf, buf.length, address, port);
        try {
            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void stopSocket(){
        socket.close();

    }

    public boolean send(String ip,byte [] data){

        try {
            this.sendUdpPacket(InetAddress.getByName(ip),data);

        } catch (UnknownHostException e) {
            e.printStackTrace();
            System.out.println("Fehler");
            this.stopSocket();
            return false;
        }
        return true;
    }


    public void run(String ip,byte [] data) {
        try {
            this.sendUdpPacket(InetAddress.getByName(ip),data);

        } catch (UnknownHostException e) {

            System.out.println("Fehler");
            this.stopSocket();
            throw new AssertionError(e);
        }

    }
}

