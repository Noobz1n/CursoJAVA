package Exercicios;

import java.util.Scanner;

public class matriz_numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();  //qntdd de linhas
        int n = sc.nextInt();  //qntdd de colunas

        int[][] mtz = new int[m][n]; // cria a matriz com m linhas e n colunas


        //laço pra adicionar os valores a matriz
        for(int i=0; i<mtz.length; i++){
            for(int x=0; x<mtz[i].length; x++){
                mtz[i][x] = sc.nextInt();
            }
        }



        //para achar o valor que o usuario digitar
        int x = sc.nextInt();


        //laço para percorrer a lista e verificar se tem o numero inserido
        for (int i=0; i<mtz.length; i++) {
            for (int j=0; j<mtz[i].length; j++) {
                if (mtz[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + mtz[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mtz[i-1][j]);
                    }
                    if (j < mtz[i].length-1) {
                        System.out.println("Right: " + mtz[i][j+1]);
                    }
                    if (i < mtz.length-1) {
                        System.out.println("Down: " + mtz[i+1][j]);
                    }
                }
            }
        }







        sc.close();
    }
}
