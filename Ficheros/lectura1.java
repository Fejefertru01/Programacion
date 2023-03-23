package Ficheros;
//mostrar/contar el numero de palabras

//1- Importar las herramientas que voy a usar
import java.io.FileReader;
import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.IOException;

public class lectura1 {

    public static void main(String[] args) {
        //2- Creamos los flujos de datos
        FileReader lector=null;
        BufferedReader mibuffer=null;
        try {
            String ruta = "src/Ficheros/prueba.txt";
             lector = new FileReader(ruta);
             mibuffer = new BufferedReader(lector);

            //3-Leer como necesite y/o me diga
            int cosa = 0;
            do {
                cosa = mibuffer.read();
                if (cosa != -1) {
                    System.out.println((char) cosa);
                }
            } while (cosa != -1);

            //4- Cerramos todos los flujos(NIVEL JUNIOR)
            //mibuffer.close();
            //lector.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("ERROR fichero no encontrado.");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("ERROR leyendo o cerrando datos.");
            System.out.println(e.getMessage());
        }
        finally{
            //Cerramos todos los flujos 
            try{
            if(mibuffer!=null) mibuffer.close();
            if(lector!=null) lector.close();
            }
            catch(IOException e){
                System.out.println("ERROR leyendo o cerrando datos");
                System.out.println(e.getMessage());
            }
        }

    }
}
