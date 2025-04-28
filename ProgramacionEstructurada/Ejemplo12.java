package ProgramacionEstructurada;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplo12 {
    public static void main (String[] args){
        ArrayList<Double> precios = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        double precio;
        for (int i = 0; i < 6; i++){
            precio = (i * 100);
            if (i == 0){
                precio = 50;
            }
            precios.add(i, precio);
        }
        System.out.println("----Precios Originales----");
        for (int i = 0; i < 6; i++){
            System.out.println("Precio N°" + (i + 1) + ": $" + precios.get(i));
        }
        precios.set(3, (precios.get(3) - 30));
        System.out.println("----Precios Modificados----");
        for (int i = 0; i < 6; i++){
            System.out.println("Precio N°" + (i + 1) + ": $" + precios.get(i));
        }
    }
}
