package Aulas;

import Entities.herancaAccount;
import Entities.herancaBusinessAccount;
import Entities.herancaSavingsAccount;

public class heranca {
    public static void main(String[] args){
        herancaAccount acc = new herancaAccount(1001, "Alex", 0.0);
        herancaBusinessAccount bacc = new herancaBusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING
        herancaAccount acc1 = bacc;
        herancaAccount acc2 = new herancaBusinessAccount(1003, "Bob", 0.0, 200.0);
        herancaAccount acc3 = new herancaSavingsAccount(1004, "Ana", 0.0, 0.1);

        //DOWNCASTING
        herancaBusinessAccount acc4 = (herancaBusinessAccount)acc2;
        acc4.loan(100.0);

        //herancaBusinessAccount acc5 = (herancaBusinessAccount)acc3; jeito errado (acc3 é savings account, nao business account)
        // jeito certo abaixo
        if (acc3 instanceof herancaBusinessAccount) {
            herancaBusinessAccount acc5 = (herancaBusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }
        if (acc3 instanceof herancaSavingsAccount){
            herancaSavingsAccount acc5 = (herancaSavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

    }
}
