import java.lang.Runnable;
import java.util.Scanner;

class Account{
    public int balance;
    public Account(int balance){this.balance=balance;}
    public boolean isSufficientBalance(int amount){
        if(balance>amount)
            return(true);
        else 
            return(false);
    }
    public void withdraw(int amount){
        balance=balance-amount;
        System.out.println("withdrawl money is "+amount);
        System.out.println("Your current balance is "+balance);
    }
}
class Customer implements Runnable{
    private String name;
    private Account account;
    public Customer(Account account,String name){
        this.account=account;
        this.name=name;
    }
    public void run(){
        Scanner sc=new Scanner(System.in);
        synchronized(account){
            System.out.print(name+" : enter amount to withdraw = ");
            int amount=sc.nextInt();
            if(account.isSufficientBalance(amount)){
                System.out.println(name);
                account.withdraw(amount);
            }
            else {System.out.println("Insufficient balance");}
        }
    }
}
public class SynchronizingThreads{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter balance in account = ");
        int a=sc.nextInt();
        Account a1=new Account(a);
        Customer c1=new Customer(a1,"Customer1");
        Customer c2=new Customer(a1,"Customer2");
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
        t1.start();
        t2.start();       
    }
}