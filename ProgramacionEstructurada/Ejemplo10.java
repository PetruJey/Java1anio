package ProgramacionEstructurada;

import java.util.Scanner;

public class Ejemplo10 {
    public static int actualizarStock(int StockActual, int CantidadVendida, int CantidadRecibida){
        int NuevoStock = StockActual - CantidadVendida + CantidadRecibida;
        return NuevoStock;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el stock actual del producto:");
        int StockActual = sc.nextInt();
        System.out.println("Ingrese la cantidad vendida:");
        int CantidadVendida = sc.nextInt();
        System.out.println("Ingrese la cantidad recibida:");
        int CantidadRecibida = sc.nextInt();
        int NuevoStock = actualizarStock(StockActual, CantidadVendida, CantidadRecibida);
        System.out.println("El nuevo stock del producto es: " + NuevoStock);
    }
}
