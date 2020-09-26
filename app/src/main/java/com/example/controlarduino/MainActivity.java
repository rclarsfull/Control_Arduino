package com.example.controlarduino;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Scanner eingabe=new Scanner(System.in);
        EchoServer test=new EchoServer(5000);
        byte [] data=new byte[255];



        String ip=;

        int port=;

        String dataStr="";
    }




    boolean run=true;

        while (run) {
      //  if (dataStr.equals("stop")){
        //    run=false;
       //    break;
       // }
        dataStr=eingabe.next();
        data=dataStr.getBytes();

        try {
            test.sendUdpPacket(InetAddress.getByName("192.168.178.148"),5000,data);
        } catch (UnknownHostException e) {
            e.printStackTrace();
            System.out.println("Fehler");
            test.stopSocket();
        }

    }
}
