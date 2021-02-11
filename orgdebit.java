
package packagedemo;

 import java.util.Scanner;

public class orgdebit
{
    String name;
    int acc_no;
    long con_no;
    String adderess;
    static int ROI=10;
    int balance;
    static int bank_acc_count=0;
    static int bank_acc_num[]={244,245,246,247,248,249,250,251,251,253,254};
    Scanner sc=new Scanner(System.in);
    
    
    public void createAccount()
    {
        System.out.println("!!!Welcome dear customer!!!");
        System.out.println("\nEnter your name");
        name=sc.nextLine();
        System.out.println("\nEnter your address");
        adderess=sc.nextLine();
        System.out.println("\nEnter your contact number");
        con_no=sc.nextLong();
        System.out.println("\n!!!Your account is created successfully!!!");
        System.out.println("\nYour account number is "+bank_acc_num[bank_acc_count]);
        bank_acc_count++;
    }
    
    public void deposit()
    {
        int amount;
        System.out.println("\nEnter your amount:");
        amount=sc.nextInt();
        balance=balance+amount;
        System.out.println("\nYour amount is debited successfully");
    }
    
    public void withdraw()
    {
        int amount;
        System.out.println("\nEnter your amount:");
        amount=sc.nextInt();
        balance=balance-amount;
        System.out.println("\nYour amount is withdrawed successfully");
    }
    
    public void computeInterest()
    {
        int amount;
        int time;
        int SI;
        System.out.println("\nEnter your amount:");
        amount=sc.nextInt();
        System.out.println("\nEnter number of years:");
        time=sc.nextInt();
        SI=(amount*time*ROI)/100;
        System.out.println("\nRate of interest is:"+ROI);
        System.out.println("According to above rates value of simple interest is:"+SI);
    }
    
    public void display()
    {
        System.out.println("Name of Accountant   :   "+name);
        System.out.println("Current balance      :   "+balance);
    }
}
    
