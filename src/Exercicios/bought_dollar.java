package Exercicios;

import java.util.Locale;
import java.util.Scanner;
import Entities.Dollar;

public class bought_dollar {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        Dollar.doll = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        Dollar.bought = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f", Dollar.CurrencyConverter());

        sc.close();
    }
}
