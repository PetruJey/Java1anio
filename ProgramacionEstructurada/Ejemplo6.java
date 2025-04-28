package ProgramacionEstructurada;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplo6 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa 10 numeros:");
        ArrayList<Integer> nums = new ArrayList<>();
        int pos = 0;
        int neg = 0;
        int ceros = 0;
        for (int i = 0; i < 10; i++){
            nums.add(sc.nextInt());
        }
        for (int i = 0; i < nums.size(); i++){
            if (nums.get(i) > 0){
                pos += 1;
            } else if (nums.get(i) < 0) {
                neg += 1;
            } else {
                ceros += 1;
            }
        }
        System.out.println("- Numeros Positivos: " + pos + "\n- Numeros Negativos: " + neg + "\n- Ceros: " + ceros);
        sc.close();
    }
}
