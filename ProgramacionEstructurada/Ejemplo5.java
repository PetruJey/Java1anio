package ProgramacionEstructurada;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplo5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numeros positivos a sumar. Presione 0 para finalizar.");
        ArrayList<Integer> num = new ArrayList<>();
        int sel = 1;
        int res = 0;
        while (sel != 0){
            sel = sc.nextInt();
            if (sel < 0){
                while (sel < 0){
                    System.out.println("Ingrese solo numeros positivos:");
                    sel = sc.nextInt();
                }
            }
            num.add(sel);
        }
        for (int i = 0; i < num.size(); i++){
            if (num.get(i) % 2 == 0){
                res += num.get(i);
            }
        }
        System.out.println("La suma de los numeros pares es: " + res);
    }
}
