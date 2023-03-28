/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ficheros;

import java.util.Scanner;

public class EjPizarra {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String texto = "Fernando Alonso Díaz (Oviedo, Asturias; 29 de julio de 1981) es un piloto de automovilismo \n"
                + "español, galardonado como Premio Príncipe de Asturias en 2005. Ha ganado dos veces el Campeonato Mundial de Fórmula 1\n"
                + "en 2005 y 2006, ​resultó subcampeón en 2010, 2012 y 2013, y obtuvo un tercer puesto en 2007. Fue campeón del Campeonato\n"
                + "Mundial de Resistencia de la FIA en 2019, las 24 Horas de Le Mans en 2018 y 2019, las 24 Horas de Daytona de 2019 y el\n"
                + "Campeonato Mundial de Karting en 1996.";

        //1
        String Ntexto = texto.replace(" ", "");
        System.out.println(Ntexto.length());

        //2
        System.out.println("Dime un numero");
        int n1 = teclado.nextInt();
        System.out.println("Dime un numero");
        int n2 = teclado.nextInt();

        if(n1>n2)System.out.println(texto.substring(n2, n1));
        else System.out.println(texto.substring(n1, n2));
        //3
       
        System.out.println("Numero de espacios:" + texto.split(" ").length);
        //4
    
        System.out.println("Numero de saltos de linea: " + texto.split(System.lineSeparator()).length);
        //5

        String last = texto.substring(texto.lastIndexOf(" ")+1);
        String resultado =last+ texto.substring(0, texto.lastIndexOf(" "));
        System.out.println(resultado);
        
        

    }
}
