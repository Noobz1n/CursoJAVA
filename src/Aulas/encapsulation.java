package Aulas;

import java.util.Locale;
import java.util.Scanner;
import Entities.Encapsulation_product;

public class encapsulation {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        Encapsulation_product encap = new Encapsulation_product();

        encap.setName("Computer");
        System.out.println("Updated name: " + encap.getName());
        encap.setPrice(1200.00);
        System.out.println("Updated price: " + encap.getPrice());


    }
}
