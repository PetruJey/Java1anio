package ProgramacionEstructurada;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplo13 {
    public static void preciosOriginales(ArrayList precios, int in){
        if (in == 0){
            System.out.println("----Precios Originales----");
        }
        System.out.println("Precio N°" + (in + 1) + ": $" + precios.get(in));
        if (in < (precios.size()-1)) {
            preciosOriginales(precios, in + 1);
        }
    }
    public static void preciosModificados(ArrayList precios, int in){
        if (in == 0){
            System.out.println("----Precios Modificados----");
        }
        System.out.println("Precio N°" + (in + 1) + ": $" + precios.get(in));
        if (in < (precios.size()-1)) {
            preciosModificados(precios, in + 1);
        }
    }
    public static void main (String[] args){
        ArrayList<Double> precios = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        double precio;
        int in = 0;
        for (int i = 0; i < 6; i++){
            precio = (i * 100);
            if (i == 0) {
                precio = 50;
            }
            precios.add(i, precio);
        }
        preciosOriginales(precios, in);
        precios.set(3, (precios.get(3) - 30));
        preciosModificados(precios, in);
    }
}
