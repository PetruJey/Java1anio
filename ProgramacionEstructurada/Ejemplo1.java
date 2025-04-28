package ProgramacionEstructurada;


import java.util.Scanner;

public class Ejemplo1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un año:");
        int annio = sc.nextInt();
        while (annio < 1){
            System.out.println("Ingrese un año divisible:");
            annio = sc.nextInt();
        }
        if (annio%4==0 & annio%100!=0 || annio%400==0) {
            System.out.println(annio + " Es un año bisiesto.");
        }else System.out.println(annio + " No es un año bisiesto.");
        sc.close();
    }

}
