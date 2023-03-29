package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ej2PizzaraPoema {

    public static void main(String[] args) {

        FileReader lector = null;
        BufferedReader miBuffer = null;

        try {
            String ruta = "src/Ficheros/Poema.txt";
            lector = new FileReader(ruta);
            miBuffer = new BufferedReader(lector);
            String linea = "";
            do {
                linea=miBuffer.readLine();
               if(linea!=null){ String[] cadena = linea.split(" ");
                for (int i = 0; i < cadena.length; i++) {
                    System.out.println(cadena[i]);
                }
               }
            } while (linea != null);
            
         
        } catch (FileNotFoundException e) {
            System.out.println("ERROR " + e.getMessage());
        } catch (IOException e) {
            System.out.println("ERROR " + e.getMessage());
        }finally{
            try{
            if(miBuffer!=null) miBuffer.close();
            if(lector!=null) lector.close();
            }
            catch(IOException e){
                System.out.println("ERROR leyendo o cerrando datos");
                System.out.println(e.getMessage());
        }
       }
    }
}
