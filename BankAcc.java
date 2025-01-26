import java.util.Scanner;
class Bank{
    String name;
    long Accno;
    double balance;
   public void BankDet(String n,long a, double b){
       name=n;
       Accno=a;
       balance=b;
       System.out.println("Bannk account existed with details below.");
       System.out.println("Name: "+name+"\t Account number: "+Accno+"\tbalance: "+balance);
    }
    public void Deposit(double b){
        if(b>0){
        balance+=b;
        System.out.println("Successfully deposited.");
        }
        else{
            System.out.println("Enter valid amount as deposit");
        }
    }
    public void Withdraw(double w){
        if((balance > w)&& (w>0)){
        balance-=w;
        System.out.println("Debited successfully.");
        }
        else{
            System.out.println("Enter valid amount to withdraw since required amount exceeds than balance, cannot be proceeded.");
        }
    }
    public void CheckBalance(){
        System.out.println("Balance : "+balance);
    }
    public void Exit(){
        System.out.println("Workdone Successfully \nTHANKYOU.");
    }
}
public class BankAcc{
    public static void main(String args[]){
        int ch;
        double bal,d,w;
        System.out.println("Bank Application: ");
        Scanner s=new Scanner(System.in);
        Bank b=new Bank();
        while(true){
            System.out.println("\n1.create \t2.deposit \t3.withdraw \t4.Checkbalance \t5.Exit");
            System.out.println("Enter choice: ");
            ch=s.nextInt();
            switch (ch) {
                case 1:
                   System.out.println("Enter name of useraccount: ");
                   s.nextLine(); 
                   String name=s.nextLine();
                   System.out.println("Enter Account Number: ");
                   long Accno=s.nextLong();
                   System.out.println("Enter balance of your choice (initial deposit): ");
                   bal=s.nextDouble();
                    b.BankDet(name,Accno,bal);
                    break;
                case 2:
                System.out.println("Enter deposite amount: ");
                d=s.nextDouble();
                b.Deposit(d);
                break;
                case 3:
                System.out.println("Enter withdraw amount: ");
                w=s.nextDouble();
                b.Withdraw(w);
                break;
                case 4:
                b.CheckBalance();
                break;
                case 5:
                b.Exit();
                System.exit(0);
                default:
                System.out.println("Enter valid option");
                    break;
            }
        }       
    }
}