package ProgramacionEstructurada;

import java.util.Scanner;

public class Ejemplo3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad:");
        int edad = sc.nextInt();
        String etapa = "";
        while (edad <=0){
            System.out.println("Ingrese una edad válida:");
            edad = sc.nextInt();
        }
        if (edad < 12) {
            etapa = "Niño";
        } else if (edad >= 12 & edad <= 18) {
            etapa = "Adolescente";
        } else if (edad >= 18 & edad <= 59) {
            etapa = "Adulto";
        } else {
            etapa = "Adulto mayor";
        }
        System.out.println("Eres un " + etapa + " a tu edad de " + edad + " años.");
        sc.close();
    }
}
