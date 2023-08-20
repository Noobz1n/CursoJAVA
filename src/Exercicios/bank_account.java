package Exercicios;

import java.util.Locale;
import java.util.Scanner;
import Entities.Bank;
public class bank_account {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Bank bnk;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        sc.nextLine(); //foi usado aqui para poder consumir a quebra de espaço do input anterior
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();


        System.out.print("Is there an initial deposit (Y/N)? ");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.print("Enter a initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            bnk = new Bank(number, name, initialDeposit);
        } else {
            bnk = new Bank(number, name);
        }


        System.out.println();
        System.out.println("Account Data: ");
        System.out.print(bnk);
        System.out.println();
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double balance = sc.nextDouble();
        bnk.deposit(balance);

        System.out.println("Updated account data: ");
        System.out.print(bnk);
        System.out.println();
        System.out.println();


        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        bnk.withdraw(withdraw);
        System.out.println();



        System.out.println("Updated account data: ");
        System.out.print(bnk);





        sc.close();
    }
}
