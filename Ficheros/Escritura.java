
package Ficheros;
//1- Importar las herramientas que voy a usar.
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class Escritura {
     public static void main(String[] args) {
        
         String ruta ="src/Ficheros/salida.txt";
         FileWriter escritor =null;
         BufferedWriter paquito =null;
         try{
             //2-Creamos flujos de datos.
             escritor =new FileWriter(ruta,true);
             paquito =new BufferedWriter(escritor);
             
            
             //3-Escribir
             paquito.write("A E I O U");
             paquito.newLine(); //Es igual a poner paquito.write("\n");
             
             //4-Cerrar(facil)
             //paquito.close();
             //escritor.close();
         }catch(IOException e){
             System.out.println("ERROR en escritura: "+e.getMessage());
         }finally{
             try{
               if(paquito!=null) paquito.close();
               if(escritor!=null) escritor.close();
             }catch(IOException e){
                 System.out.println("ERROR cerrando recursos: "+e.getMessage());
             }
         }
         
     }
}
