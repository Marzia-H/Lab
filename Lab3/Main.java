package com.mycompany.main;
public class Main {

    public static void main(String[] args) {
      bankaccount account1 = new bankaccount("Ahmed","676327263");
      bankaccount account2 = new bankaccount("Safiq","676327262");
      account1.deposit(3000000);
      account1.withdraw(300);
      account2.deposit(4000000);
      account2.withdraw(400);
     System.out.println("Account1 holder name:"+account1.getAccountName());
     System.out.println("Account1 holder name:"+account1.getBalance());
     System.out.println("Account2 holder name:"+account2.getAccountName());
     System.out.println("Account2 holder name:"+account2.getBalance());
     
    }
}
