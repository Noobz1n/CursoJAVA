package Exercicios;


import Entities.outsourcedEmployee_payments;
import Entities.payments_employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class employee_payments {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<payments_employee> list = new ArrayList<>();

        System.out.print("Enter the numbers of employees: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Employee #" + i + " data: ");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if(ch == 'y' || ch == 'Y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                payments_employee emp = new outsourcedEmployee_payments(name, hours, valuePerHour, additionalCharge);
                list.add(emp);
            }
            else{
                list.add(new payments_employee(name, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");
        for (payments_employee emp : list){
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }






        sc.close();
    }
}
