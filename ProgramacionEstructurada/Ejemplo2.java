package ProgramacionEstructurada;

import java.util.Scanner;

public class Ejemplo2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        int mayor = 0;
        for (int i = 0; i <= 2; i++){
            System.out.println("Ingresa el valor " + (i+1));
            num[i] = sc.nextInt();
        }
        for (int i = 0; i <=2; i++){
            mayor = (num[i] > mayor) ? num[i]: mayor;
        }
        System.out.println("El numero mayor es: " + mayor);
        sc.close();
    }
}
