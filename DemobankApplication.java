/* write a menu driven program in java to implement simple banking application.
Application should read the customer name,account no,initial balance,rate of interest,
and contact no.....
roll no=78
Name=kajal birajdar */

//Note:: You have to remember your account no when u withdraw

import java.util.Scanner;
import javaapplication2.orgdebit;

public class DemobankApplication {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
       orgdebit b[]=new orgdebit[10];
        int no=0;
        int flag=0;
        int acc;
        int n=1;
        int i;
        
        for(i=0;i<10;i++)
        {
            b[i]=new orgdebit();
        }
        do
        {
            n++;
            System.out.println("1.Create account");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Compute Interest");
            System.out.println("5.Display Balance");
            
            System.out.println("\nEnter your choice");
            int ch=sc.nextInt();
            
            
            switch(ch)
            {
                case 1:
                    if(no>9)
                    {
                        System.out.println("!!!sorry for your inconvenience dear user we can procced your request please try again later!!!");
                        no++;
                    }
                    else
                    {
                        b[no].createAccount();
                        no++;
                    }
                    break;
                    
                case 2:
                    
                    System.out.println("Enter your account number:");
                    acc =sc.nextInt();
                    for(i=0;i<10;i++)
                    {
                        if(acc==orgdebit.bank_acc_num[i])
                        {
                            b[i].deposit();
                            flag=1;
                            break;
                            
                        }
                    }
                    if(flag==0)
                    {
                        System.out.println("\n!!!You are not registred customer....Registere yourself first");
                        flag=0;
                    }
                    break;
                    
                    
                case 3:
                    System.out.println("Enter your account number:");
                    acc =sc.nextInt();
                    for( i=0;i<10;i++)
                    {
                        if(acc==orgdebit.bank_acc_num[i])
                        {
                            b[i].withdraw();
                            flag=1;
                            break;
                            
                        }
                    }
                    
                    if(flag==0)
                    {
                        System.out.println("\n!!!You are not registred customer....Registere yourself first");
                    }
                    
                    break;
                    
                case 4:
                    System.out.println("Enter your account number:");
                    acc =sc.nextInt();
                    for(i=0;i<10;i++)
                    {
                        if(acc==orgdebit.bank_acc_num[i])
                        {
                            b[i].computeInterest();
                            flag=1;
                            break;
                        }
                    }
                    
                    if(flag==0)
                    {
                        System.out.println("\n!!!You are not registred customer....Registere yourself first");
                    }
                    
                    break;
                    
                case 5:
                    System.out.println("Enter your account number:");
                    acc =sc.nextInt();
                    for( i=0;i<10;i++)
                    {
                        if(acc==orgdebit.bank_acc_num[i])
                        {
                            b[i].display();
                            flag=1;
                            break;
                        }
                    }
                    
                    if(flag==0)
                    {
                        System.out.println("\n!!!You are not registred customer....Registere yourself first");
                    }
                    
                    break;
                    
                default:
                    System.out.println("\n!!!Dear dustomer you entered wrong choice");
            }
            System.out.println("Do you want to coninue 1/0:");
            n=sc.nextInt();
        }while(n==1);
        
    }
}
/*
o/p:
C:\submission>javac DemobankApplication.java

C:\submission>java DemobankApplication
1.Create account
2.Deposit
3.Withdraw
4.Compute Interest
5.Display Balance

Enter your choice
1
!!!Welcome dear customer!!!

Enter your name
kajal

Enter your address
pune

Enter your contact number
7028382394

!!!Your account is created successfully!!!

Your account number is 244
Do you want to coninue 1/0:
1
1.Create account
2.Deposit
3.Withdraw
4.Compute Interest
5.Display Balance

Enter your choice
2
Enter your account number:
244

Enter your amount:
15000

Your amount is debited successfully
Do you want to coninue 1/0:
1
1.Create account
2.Deposit
3.Withdraw
4.Compute Interest
5.Display Balance

Enter your choice
5
Enter your account number:
244
Name of Accountant   :   kajal
Current balance      :   15000
Do you want to coninue 1/0:
1
1.Create account
2.Deposit
3.Withdraw
4.Compute Interest
5.Display Balance

Enter your choice
3
Enter your account number:
244

Enter your amount:
500

Your amount is withdrawed successfully
Do you want to coninue 1/0:
1
1.Create account
2.Deposit
3.Withdraw
4.Compute Interest
5.Display Balance

Enter your choice
5
Enter your account number:
244
Name of Accountant   :   kajal
Current balance      :   14500
Do you want to coninue 1/0:
0
 */
