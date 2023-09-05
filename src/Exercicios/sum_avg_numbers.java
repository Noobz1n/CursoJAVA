/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
*/
package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class sum_avg_numbers {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vet = new double[n];


        for(int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        double sum = 0;

        System.out.print("VALORES = ");
        for(int i=0; i<vet.length; i++){
            System.out.print(vet[i] + " ");
            sum += vet[i];
        }
        double avg = sum/vet.length;
        System.out.println();
        System.out.printf("SOMA = %.2f%n", sum);
        System.out.printf("MEDIA = %.2f%n", avg);


        sc.close();
    }
}
