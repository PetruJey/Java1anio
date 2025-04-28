package ProgramacionEstructurada;

import java.util.Scanner;

public class Ejemplo8 {
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento){
        double PrecioFinal;
        PrecioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return PrecioFinal;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio base del producto:\n$");
        double precioBase = sc.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje:\n%");
        double impuesto = sc.nextDouble();
        impuesto = (impuesto/100);
        System.out.print("Ingrese el descuento en porcentaje:\n%");
        double descuento = sc.nextDouble();
        descuento = (descuento/100);
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.println("El precio final del producto es: $" + precioFinal);
        sc.close();
    }
}
