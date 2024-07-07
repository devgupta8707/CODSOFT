package codsoft;

import java.util.Scanner;

public class ATMmachine {
    private double balance;
    public void menu(){
        System.out.println("Enter 1 to Check Balance ");
        System.out.println("Enter 2 to Deposit Money");
        System.out.println("Enter 3 to Withdraw Money");
        }
    public void Withdraw(int n){
        if (n>0 && n<balance) {
            balance = balance - n;
            System.out.println("Amount of Rs. "+n+" has been Withdrawn Successfully");
            System.out.println("Remaining Balance = "+balance);
        }
        else if(n>balance){
            System.out.println("Insufficient Balance");
        }
        else {
            System.out.println("Amount should be greater than 0 ");
        }
    }
    public void Deposit(int n){
        if (n>0){
        balance+=n;
        System.out.println("Amount of Rs. "+n+"has been Deposited Successfully");
        System.out.println("Balance = "+balance);}
        else {
            System.out.println("Amount should be greater than 0 ");
        }

    }
    public double CheckBalance(){
        return balance;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pinn=4321;
        ATMmachine atm=new ATMmachine();
        System.out.println("Enter 0 to Insert a ATM Card or 1 to Exit");
        int insert= sc.nextInt();
        if (insert==0){
        System.out.println("Welcome to ATM");
        System.out.println("Card Inserted");
        System.out.println("Please Enter a Valid Pin");
        int pin=sc.nextInt();
        if (pin==pinn){
            int menu=0;
            while (menu==0){
            atm.menu();
            int a= sc.nextInt();
            switch (a){
                case 1:
                    System.out.println("Balance: "+ atm.CheckBalance());
                    break;
                case 2:
                    System.out.println("Enter Amount to Deposit");
                    int amount= sc.nextInt();
                    atm.Deposit(amount);
                    break;
                case 3:
                    System.out.println("Enter amount to Withdraw");
                    int amt= sc.nextInt();
                    atm.Withdraw(amt);
                    break;

            }
            System.out.println("Enter 0 for Menu");
            System.out.println("Enter 1 to remove the card");
             menu= sc.nextInt();
        }
            System.out.println("Card Removed");
        }
        else{
            System.out.println("Invalid Pin");
        }
        System.out.println("THANK YOU");
    }
        else {
            System.out.println("ATM Card not Inserted,Please insert a ATM Card");
        }

}}
