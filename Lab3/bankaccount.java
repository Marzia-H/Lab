
package com.mycompany.main;

public class bankaccount {
    private String accountName;
    private String accountnumber;
    private double balance=0.0;
    public bankaccount(String accountName,String accountNumber){
        this.accountName=accountName;
        this.accountnumber=accountNumber;
    }
     public String getAccountName(){
        return accountName;
    }
    public double getBalance(){
        return balance;
    }
    public String getAccountNumber(){
        return accountnumber;
    }
    public void setAccountName(String accountName){
        this.accountName=accountName;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit successful.New balance:"+balance);
        }
        else {System.out.println("Invalid deposit");} 
    }
     public void withdraw(double amount){
        if(amount>0&&amount<=balance){
            balance-=amount;
            System.out.println("Withdraw successful.New balance:"+balance);
        }
        else {System.out.println("Insaficient withdrawal balance");} 
    }
        
    }
    
    
        
    
