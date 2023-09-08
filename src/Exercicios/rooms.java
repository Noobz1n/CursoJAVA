package Exercicios;

import Entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class rooms {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent r = new Rent("Maria", "maria@gmail.com");

        //criando vetor de 10 posições
        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine(); //limpar a quebra de linha
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            vect[roomNumber] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i = 0; i<10; i++){
            //verifica se o vetor esta ocupado, se tiver ocupado, mostra o que tem, no caso os dados do quarto
            if(vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }



        sc.close();
    }
}
