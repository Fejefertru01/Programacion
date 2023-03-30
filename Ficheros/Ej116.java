package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ej116 {

    public static void main(String[] args) {
        FileReader lector = null;
        BufferedReader mibuffer = null;
        

        try {
            String ruta = "src/Ficheros/frasesEj116.txt";
            lector = new FileReader(ruta);
            mibuffer = new BufferedReader(lector);
            String linea = "";
            String LineaLarga = "";
            String primeraLinea="";
            String ultimaLinea="";
            String todasLineas="";
            int contador=0;
            do {
                linea = mibuffer.readLine();
                contador++;
                if(contador==1){
                   primeraLinea=linea;
                }
               if(linea!=null){ 
                   if (linea.split("").length > LineaLarga.split("").length) {
                    LineaLarga = linea;
                }
                   ultimaLinea=linea;
                   todasLineas=todasLineas+linea+"\n";
               }
            } while (linea != null);
            System.out.println("LINEA LARGA");
            System.out.println(LineaLarga);
            System.out.println("PRIMERA LINEA");
            System.out.println(primeraLinea);
            System.out.println("ULTIMA LINEA");
            System.out.println(ultimaLinea);
            
            if(contador>1){
                System.out.println("-----------TODAS LAS LINEAS---------");
                System.out.println(todasLineas);
                }
            
        } catch (FileNotFoundException e) {
            System.out.println("ERROR archivo no encontrado." + e.getMessage());
        } catch (IOException e) {
            System.out.println("ERROR al leer archivo." + e.getMessage());

        } finally {
            //Cerramos todos los flujos 
            try {
                if (mibuffer != null) {
                    mibuffer.close();
                }
                if (lector != null) {
                    lector.close();
                }
            } catch (IOException e) {
                System.out.println("ERROR leyendo o cerrando datos");
                System.out.println(e.getMessage());
            }
        }
    }
}
