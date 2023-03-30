
package Ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Ej113 {
     public static void main(String[] args) {
         String ruta ="src/Ficheros/Ej113.dat";
         FileWriter escritor= null;
         BufferedWriter mibuffer=null;
         Scanner teclado =new Scanner(System.in);
         try{
             escritor = new FileWriter(ruta);
             mibuffer = new BufferedWriter(escritor);
             String linea="";
             do{
                 System.out.println("Dime la frase para escribir");
                 linea=teclado.nextLine();
                 if(linea.length()!=0){
                   mibuffer.write(linea);
                   mibuffer.newLine();
                         }
             }while(linea.length()!=0);
         }catch(IOException e){
             System.out.println("Error en escritura."+e.getMessage());
         }finally{
             try{
                 if(mibuffer!=null)mibuffer.close();
                 if(escritor!=null)escritor.close();
             }catch(IOException e){
                 System.out.println("ERROR cerrando recursos."+e.getMessage());
             }
         }
         
     }
}
