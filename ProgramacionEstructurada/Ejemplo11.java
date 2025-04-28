package ProgramacionEstructurada;

import java.util.Scanner;

public class Ejemplo11 {
    public static double DESCUENTO_ESPECIAL = 0.10;
    public static double calcularDescuentoEspecial(double precio){
        double precioFinal = precio * 0.90;
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        System.out.println("Descuento especial aplicado es: $" + descuentoAplicado);
        return precioFinal;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el precio de un producto:\n$");
        double precio = sc.nextDouble();
        double precioFinal = calcularDescuentoEspecial(precio);
        System.out.println("El precio final con descuento es: $" + precioFinal);
    }
}
