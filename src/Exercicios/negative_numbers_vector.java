package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class negative_numbers_vector {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] vet = new int[n];

        for (int i=0; i<n; i++){
            vet[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i = 0; i < n; i++){
            if (vet[i] < 0){
                System.out.println(vet[i]);
            }
        }


        sc.close();
    }
}
