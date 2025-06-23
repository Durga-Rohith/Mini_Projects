import java.util.Scanner;
public class Banking_Application {
  static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
      double balance=0, deposit=0, withdraw=0;
      
      boolean isRunning = true;

      while(isRunning){
        System.out.println("***************");
      System.out.println("BANKING PROGRAM");
      System.out.println("***************");
      System.out.println("1.Show Balance\n2.Deposit\n3.Withdraw\n4.Exit\n***************\nEnter your choice (1-4.)");
      int choice =sc.nextInt();
      
      switch(choice){
        case 1 -> showBalance(balance);
        case 2 -> balance =balance + deposit();
        case 3 -> withdraw =balance-=withdraw(balance);
        case 4 -> isRunning = false;
        default-> System.out.println("INVALID CHOICE");
      }
    
      }System.out.println("");
      System.out.println("***************************");
      System.out.println("Thank you! Have a nice day!");
      System.out.println("***************************");
      sc.close();
    }
    static void showBalance(double balance){
      System.out.println("###############");
      System.out.printf("$%.2f\n",balance);
      
    }
    static double deposit (){
      System.out.println("Enter the amount of deposit");
      double amount=sc.nextDouble();
      if(amount<0){
        System.out.println("Amount cannot be negative!");
        return 0;
      }else{
      return(amount);
      }
    }
    static double withdraw(double balance){
     System.out.println("Enter the withdraw amount");
      double amount=sc.nextDouble();
      if(amount>balance){
        System.out.println("Insufficient Funds!");
        return 0;
      }else if(amount<0){
        System.out.println("Amount cannot be negative!");
        return 0;
      }else {
      return(amount);
      }
    }
  }
    
