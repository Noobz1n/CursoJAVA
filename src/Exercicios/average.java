package Exercicios;

import Entities.Averages;

import java.util.Locale;
import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Averages avg = new Averages();

        System.out.print("Enter your name: ");
        avg.name = sc.nextLine();

        System.out.println("Enter your three grades (1st grade, 2nd grade, 3rd grade): ");
        avg.grade1 = sc.nextDouble();
        avg.grade2 = sc.nextDouble();
        avg.grade3 = sc.nextDouble();

        if (avg.grade1 < 0 || avg.grade1 > 30 ) {
            System.out.println("ERROR! ENTER YOU CORRECTLY GRADE (1st): ");
            avg.grade1 = sc.nextDouble();
        } else if (avg.grade2 < 0 || avg.grade2 > 35) {
            System.out.println("ERROR! ENTER YOU CORRECTLY GRADE (2nd): ");
            avg.grade2 = sc.nextDouble();
        } else if (avg.grade3 < 0 || avg.grade3 > 35) {
            System.out.println("ERROR! ENTER YOU CORRECTLY GRADE (3rd): ");
        }

        if (avg.finalGrade() >= 60.00){
            System.out.printf("FINAL GRADE = %.2f%n", avg.finalGrade());
            System.out.print("PASS");
        } else {
            System.out.printf("FINAL GRADE = %.2f%n", avg.finalGrade());
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", avg.missingPoints());
        }





        sc.close();
    }
}
