package ProgramacionEstructurada;

import java.util.Scanner;

public class Ejemplo4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto:");
        double prod = sc.nextInt();
        int sel = 1;
        do {
            if (sel > 3 || sel < 1)
                System.out.println("ERROR.");
            System.out.println("Seleccione un descuento:");
            System.out.println("1) Categoría A: 10% de descuento\n" +
                    "2) Categoría B: 15% de descuento\n" +
                    "3) Categoría C: 20% de descuento");
            sel = sc.nextInt();
        } while (sel > 3 || sel < 1);
        double proddis = 0;
        System.out.println("- Producto: $" + prod);
        switch (sel){
            case 1:
                proddis = (prod * 0.90);
                System.out.println("- Descuento aplicado: 10%");
                break;
            case 2:
                proddis = (prod * 0.85);
                System.out.println("- Descuento aplicado: 15%");
                break;
            case 3:
                proddis = (prod * 0.80);
                System.out.println("- Descuento aplicado: 20%");
                break;
        }
        System.out.println("- Precio Final: $" + proddis);

    }
}
