package ProgramacionEstructurada;

import java.util.Scanner;

public class Ejemplo9 {
    public static double calcularCostoEnvio (double peso, String zona){
        double envio;
        if (zona == "Nacional"){
            envio = (peso * 5);
        }else {
            envio = (peso * 10);
        }
        System.out.println("El costo del envío es: $" + envio);
        return envio;
    }
    public static void calcularTotalCompra(double precioProducto, double envio){
        double totalCompra = (precioProducto + envio);
        System.out.println("El total a pagar es: $" + totalCompra);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sel;
        double envio;
        String zona = "";
        System.out.print("Ingrese el precio del producto:\n$");
        double precioProducto = sc.nextDouble();
        System.out.println("Ingrese el peso del producto:");
        double peso = sc.nextDouble();
        System.out.println("Ingrese la zona de envio:\n1) Nacional: $5 por kg\n" +
                "2) Internacional: $10 por kg");
        do {
            sel = sc.nextInt();
            if (sel < 1 || sel > 2){
                System.out.println("ERROR. Seleccione una opcion en pantalla.");
            }
        }while (sel < 1 || sel > 2);
        switch (sel){
            case 1:
                zona = "Nacional";
            case 2:
                zona = "Internacional";
        }
        envio = calcularCostoEnvio(peso, zona);
        calcularTotalCompra(precioProducto, envio);
    }
}
