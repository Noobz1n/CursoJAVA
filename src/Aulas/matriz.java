package Aulas;

import java.util.Scanner;

public class matriz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for(int i=0; i<mat.length; i++){
            for(int x=0; x<mat[i].length;x++){
                mat[i][x] = sc.nextInt();
            }
        }



        System.out.println("Main diagonal: ");
        for(int i=0; i<mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int count = 0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.print("Negative numbers: " + count);







        sc.close();
    }
}
