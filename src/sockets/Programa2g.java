


package sockets;

import java.net.*;
import java.io.*;

public class Programa2g {
    
 public static void main(String[] args) throws Exception {

      byte []datos = new byte [256];
      String dirIP;
      String msg = "Hola Soy Julián Camilo Mancipe Triviño\n";
      System.out.println("Escriba la direccion IP a conectarse:");
      BufferedReader x = 
              new BufferedReader(new InputStreamReader(System.in));
      dirIP= x.readLine();
      Socket socket = new Socket (dirIP,5000);
      
      DataInputStream din = new 
            DataInputStream(socket.getInputStream());
      DataOutputStream dos = new
            DataOutputStream(socket.getOutputStream());
      System.out.println("Enviando un mensaje al servidor;"+msg);
      dos.write(msg.getBytes());
      dos.flush();
      din.read(datos,0,datos.length);
      String message = new String(datos);
      
      System.out.println(message);
      din.close();
      dos.close();
      socket.close();
      
  
         
      
     
 }
    
}
