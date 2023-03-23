
package Ficheros;

import java.util.Scanner;
public class EjPizarra {
     public static void main(String[] args) {
         Scanner teclado= new Scanner(System.in);
         String texto ="Fernando Alonso Díaz (Oviedo, Asturias; 29 de julio de 1981) es un piloto de automovilismo "
            + "español, galardonado como Premio Príncipe de Asturias en 2005. Ha ganado dos veces el Campeonato Mundial de Fórmula 1 "
            + "en 2005 y 2006, ​resultó subcampeón en 2010, 2012 y 2013, y obtuvo un tercer puesto en 2007. Fue campeón del Campeonato "
            + "Mundial de Resistencia de la FIA en 2019, las 24 Horas de Le Mans en 2018 y 2019, las 24 Horas de Daytona de 2019 y el "
            + "Campeonato Mundial de Karting en 1996.";
         
         //1
         
         String  Ntexto= texto.replace(" ", "");
         System.out.println(Ntexto.length());
         
          //2
         System.out.println("Dime un numero");
         int n1=teclado.nextInt();
         System.out.println("Dime un numero");
         int n2=teclado.nextInt();
         
        
         System.out.println(texto.substring(n1, n2));
         //3
         int contador=0;
         String salida[]=texto.split(" ");
         for(int i=0; i<salida.length;i++){
         contador++;
         }
         //4
         int contador2=0;
         String salida2[]=texto.split("\n");
         for(int i=0; i<salida2.length;i++){
         contador++;
        }
         //5
         
         String ultimaPalabra=(salida[salida.length-1]); 
         for(int i=0;i<salida.length-1;i++){
         salida[i]=salida[i+1];
         salida[0]=ultimaPalabra;
         }
         
          for(int i=0;i<salida.length-1;i++){
              System.out.println(salida[i]);
         }
     
         
         
     }
}
