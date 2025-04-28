package ProgramacionEstructurada;

import java.util.Scanner;

public class Ejemplo7 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una nota entre 0 y 10:");
        int nota;
        do {
            nota = sc.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("⚠ ERROR. Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        }while (nota < 0 || nota > 10);
        System.out.println("✅ Nota guardada correctamente.");
        sc.close();
    }
}
