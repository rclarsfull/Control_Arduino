package com.example.controlarduino;

import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (android.os.Build.VERSION.SDK_INT > 9)
        {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        final Button schalter0=findViewById(R.id.button9);
        final Button schalter1=findViewById(R.id.button10);
        final Button schalter2=findViewById(R.id.button11);
        final Button schalter3=findViewById(R.id.button12);
        final Button schalter4=findViewById(R.id.button19);
        final Button schalter5=findViewById(R.id.button20);
        final Button schalter6=findViewById(R.id.button21);
        final Button schalter7=findViewById(R.id.button23);

        final Button schalterE=findViewById(R.id.button24);

        final EditText iPAdressF=findViewById(R.id.iPAdressF2);


        final boolean[] pressd = {false,false,false,false,false,false,false,false,false};

        //final int port=Integer.parseInt(String.valueOf(portF.getText()));
        final Server server=new Server(5000);



        schalter0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                byte [] data=new byte[255];
                String ip= String.valueOf(iPAdressF.getText());
                String dataStr="";

                if (pressd[0]){
                    dataStr="0LOW";
                    data=dataStr.getBytes();
                    pressd[0] =false;
                    System.out.println("True");
                } else {
                    dataStr="0HIGH";
                    data=dataStr.getBytes();
                    pressd[0] =true;
                    System.out.println("false");
                }

                server.run(ip,data);

            }
        });



        schalter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                byte [] data=new byte[255];
                String ip= String.valueOf(iPAdressF.getText());
                String dataStr="";

                if (pressd[1]){
                    dataStr="1LOW";
                    data=dataStr.getBytes();
                    pressd[1] =false;
                    System.out.println("True");
                } else {
                    dataStr="1HIGH";
                    data=dataStr.getBytes();
                    pressd[1] =true;
                    System.out.println("false");
                }

                server.run(ip,data);

            }
        });

        schalter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                byte [] data=new byte[255];
                String ip= String.valueOf(iPAdressF.getText());
                String dataStr="";

                if (pressd[2]){
                    dataStr="2LOW";
                    data=dataStr.getBytes();
                    pressd[2] =false;
                    System.out.println("True");
                } else {
                    dataStr="2HIGH";
                    data=dataStr.getBytes();
                    pressd[2] =true;
                    System.out.println("false");
                }

                server.run(ip,data);

            }
        });

        schalter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                byte [] data=new byte[255];
                String ip= String.valueOf(iPAdressF.getText());
                String dataStr="";

                if (pressd[3]){
                    dataStr="3LOW";
                    data=dataStr.getBytes();
                    pressd[3] =false;
                    System.out.println("True");
                } else {
                    dataStr="3HIGH";
                    data=dataStr.getBytes();
                    pressd[3] =true;
                    System.out.println("false");
                }

                server.run(ip,data);
            }
        });

        schalter4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                byte [] data=new byte[255];
                String ip= String.valueOf(iPAdressF.getText());
                String dataStr="";

                if (pressd[4]){
                    dataStr="4LOW";
                    data=dataStr.getBytes();
                    pressd[4] =false;
                    System.out.println("True");
                } else {
                    dataStr="4HIGH";
                    data=dataStr.getBytes();
                    pressd[4] =true;
                    System.out.println("false");
                }

                server.run(ip,data);

            }
        });

        schalter5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                byte [] data=new byte[255];
                String ip= String.valueOf(iPAdressF.getText());
                String dataStr="";

                if (pressd[5]){
                    dataStr="5LOW";
                    data=dataStr.getBytes();
                    pressd[5] =false;
                    System.out.println("True");
                } else {
                    dataStr="5HIGH";
                    data=dataStr.getBytes();
                    pressd[5] =true;
                    System.out.println("false");
                }

                server.run(ip,data);
            }
        });

        schalter6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                byte [] data=new byte[255];
                String ip= String.valueOf(iPAdressF.getText());
                String dataStr="";

                if (pressd[6]){
                    dataStr="6LOW";
                    data=dataStr.getBytes();
                    pressd[6] =false;
                    System.out.println("True");
                } else {
                    dataStr="6HIGH";
                    data=dataStr.getBytes();
                    pressd[6] =true;
                    System.out.println("false");
                }

                server.run(ip,data);
            }
        });


        schalter7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                byte [] data=new byte[255];
                String ip= String.valueOf(iPAdressF.getText());
                String dataStr="";

                if (pressd[7]){
                    dataStr="7LOW";
                    data=dataStr.getBytes();
                    pressd[7] =false;
                    System.out.println("True");
                } else {
                    dataStr="7HIGH";
                    data=dataStr.getBytes();
                    pressd[7] =true;
                    System.out.println("false");
                }

                server.run(ip,data);
            }
        });




        schalterE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                byte [] data=new byte[255];
                String ip= String.valueOf(iPAdressF.getText());
                String dataStr="";

                if (pressd[8]){
                    dataStr="ELOW";
                    data=dataStr.getBytes();
                    pressd[8] =false;
                    System.out.println("True");
                } else {
                    dataStr="EHIGH";
                    data=dataStr.getBytes();
                    pressd[8] =true;
                    System.out.println("false");
                }

                server.run(ip,data);

            }
        });




    }



}
