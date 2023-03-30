package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ej115 {

    public static void main(String[] args) {
        String ruta = "src/Ficheros/numeros.txt";
        FileReader lector = null;
        BufferedReader mibuffer = null;
        try {
            int numMax = 0;
            int numMin = 99999999;
            int num = 0;
            int contadorMin = 0;
            int contadorMax = 0;
            lector = new FileReader(ruta);
            mibuffer = new BufferedReader(lector);
            String numero = "";
            do {
                numero = mibuffer.readLine();
                if (numero != null) {
                    num = Integer.parseInt(numero);
                    if (num > numMax) {
                        numMax=num;
                        contadorMax = 0;
                    }
                    if (num < numMin) {
                        numMin=num;
                        contadorMin = 0;
                    }
                    if (num == numMin) {
                        contadorMin++;
                    }
                    if (num == numMax) {
                        contadorMax++;
                    }
                }

            } while (numero != null);
            System.out.println("Numero Maximo: "+numMax+ " se ha repetido: "+contadorMax);
            System.out.println("Numero Minimo: "+numMin+" se ha repetido: "+contadorMin);
        } catch (FileNotFoundException e) {
            System.out.println("ERROR encontrando archivo." + e.getMessage());
        } catch (IOException e) {
            System.out.println("ERROR usando recursos. " + e.getMessage());
        } finally {
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
