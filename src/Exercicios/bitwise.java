package Exercicios;

import java.util.Scanner;

public class bitwise {
    public static void main(String[] args){
        //programa pra verificar se o 6th bit do numero é 0
        Scanner sc = new Scanner(System.in);

        //O 0b antes significa pra dizer que é um numero binario
        int mask = 0b001000000;
        int n = sc.nextInt();

        if ((n & mask) != 0){
            System.out.println("6th bis is false;");
        } else {
            System.out.println("6th bit is true");
        }



    }
}
