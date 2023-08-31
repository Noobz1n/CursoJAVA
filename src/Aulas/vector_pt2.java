package Aulas;

import Entities.vector_products;

import java.util.Locale;
import java.util.Scanner;

public class vector_pt2 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();
        vector_products[] vect = new vector_products[n];

        for (int i=0; i<vect.length; i++){
            sc.nextLine(); //pra consumir a quebra de linha
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new vector_products(name, price);
        }

        double sum = 0.0;
        for (int i=0; i<vect.length; i++){
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;


        System.out.printf("AVERAGE PRICE = %.2f%n", avg);





        sc.close();
    }
}
