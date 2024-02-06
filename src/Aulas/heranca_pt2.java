package Aulas;

import Entities.herancaAccount;
import Entities.herancaBusinessAccount;
import Entities.herancaSavingsAccount;

public class heranca_pt2 {
    public static void main(String[] args){
        herancaAccount acc1 = new herancaAccount(1001, "Alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        herancaAccount acc2 = new herancaSavingsAccount(1002, "Maria", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        herancaAccount acc3 = new herancaBusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc3.withdraw(200);
        System.out.println(acc3.getBalance());


    }
}
