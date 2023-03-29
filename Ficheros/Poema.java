
package Ficheros;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Poema {
     public static void main(String[] args) {
        
         String ruta="src/Ficheros/poema.txt";
         FileReader lector=null;
         BufferedReader mibufferR= null;
         BufferedWriter mibufferW= null;
         BufferedWriter mibufferW2= null;
         FileWriter  escritor=null;
         FileWriter  escritor2=null;
         
         try{
             lector=new FileReader(ruta);
             mibufferR =new BufferedReader(lector);
             escritor = new FileWriter("src/Ficheros/salida1.dat");
             escritor2 = new FileWriter("src/Ficheros/salida2.dat");
             mibufferW = new BufferedWriter(escritor);
            mibufferW2 = new BufferedWriter(escritor2);
            
            String linea="";
            
            int contador=1;
            do{
                linea=mibufferR.readLine();
                
                if(linea!=null){
                    mibufferW.write(linea);
                    mibufferW2.write(contador+": "+linea);
                    mibufferW.newLine();
                    mibufferW2.newLine();
                    contador++;
                }
                
            }while(linea!=null);
             
         }catch(FileNotFoundException e){
             System.out.println("ERROR no se ha encontrado el archivo. "+e.getMessage());
             
         }catch(IOException e){
             System.out.println("ERROR No se puede leer o cerrar el fichero. "+e.getMessage());
         }finally{
             try{
                 if(mibufferR!=null)mibufferR.close();
                 if(lector!=null)lector.close();
                 if(mibufferW!=null)mibufferW.close();
                 if(mibufferW2!=null)mibufferW2.close();
                 if(escritor!=null)escritor.close();
                 if(escritor2!=null)escritor2.close();
                         
             }catch(IOException e){
                 System.out.println("ERROR No se puede leer o cerrar el fichero.");
             }
         }
         
     }
}
