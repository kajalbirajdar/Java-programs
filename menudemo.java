/*write a menu driven java program which will read a number and should implement the
following methods:
1.factorial()
2.reverce()
3.testArmstrong()
4.testpalindrome()
5.testprime()
6.fibonacciseries()

roll no=69
Name=Aayushi Tripathi */


import java.util.Scanner;


public class menudemo {
    void factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
             fact=fact*i;
        }
        
        System.out.println("\nFactorial of "+n+" is "+fact);
    }
     
    void reverse(int n)
    {
        int rem,rev=0,n1=n;
        while(n1!=0)
        {
         rem=n1%10;
         rev=(rev*10)+rem;
         n1=n1/10;
        }
        System.out.println("Reverse of "+n+" is "+rev);
    }

    void armstrong(int n)
    {
        int count=0;
        int rem,n1=n,n2=n;
        double arm=0;
        while(n1!=0)
        {
         n1=n1/10;
         count++;
        }
        while(n2!=0)
        {
         rem=n2%10;
         arm=arm+Math.pow(rem,count);
         n2=n2/10;
        }
        if(arm==n)
        {
            System.out.println(n+" is an armstrong number");
        }
        else
        {
            System.out.println(n+" is not an armstrong number");
        }
        
    }
    
    void palindrome(int n)
    {
        int rem;
        int rev=0;
        int n1=n;
        while(n1!=0)
        {
         rem=n1%10;
         rev=(rev*10)+rem;
         n1=n1/10;
        }
        
        if(n==rev)
        {
            System.out.println(n+" is palindrome number");
        }
        else
        {
            System.out.println(n+" is not palindrome number");
        }
    }   
    
    void prime(int n)
    {
        int flag=0;
        for(int i=2;i<(n/2);i++)
        {
             if(n%i==0)
             {
                 System.out.println(n+" is not prime number");
                 flag=1;
             }
        }
        
        if(flag==0)
        {
            System.out.println(n+" is prime number");
        } 
    }  
    
    void fibonacci(int n)
    {
        int f=0,s=1,t;
        System.out.print(f+"\t"+s);
        while(n!=0)
        {
             t=f+s;
             System.out.print("\t"+t);
             f=s;
             s=t;
             n--;
        }
    }    
    
    public static void main(String[] args) {
        
        int num,ch,n=1;
        Scanner sc=new Scanner(System.in);
        Calculate c1=new Calculate();
        
        System.out.println("!!!Welcome to calculate world!!!");
        do
        {
         n++;    
        System.out.println("\n1.Factorial");
        System.out.println("\n2.Reverse");
        System.out.println("\n3.Test armstrong");
        System.out.println("\n4.Test palindrome");
        System.out.println("\n5.Test Prime");
        System.out.println("\n6.Fibonacci series");
        
        System.out.println("\nEnter your choice");
        ch=sc.nextInt();
        
        System.out.println("Enter a numeric value");
        num=sc.nextInt();
        
        switch(ch)
        {
            case 1:
                c1.factorial(num);
                break;
            case 2:
                c1.reverse(num);
                break;
            case 3:
                c1.armstrong(num);
                break;
            case 4:
                c1.palindrome(num);
                break;
            case 5:
                c1.prime(num);
                break;
            case 6:
                c1.fibonacci(num);
                break;
            default:
                System.out.println("Dear user you entered wrong choice");
        }        
        System.out.println("\nDo you want to continue 1/0");
        n=sc.nextInt();
    }while(n==1);
        
    }
}
/*
o/p:
C:\Aayushi>javac menudemo.java

C:\Aayushi>java menudemo

1.Factorial

2.Reverse

3.Test armstrong

4.Test palindrome

5.Test Prime

6.Fibonacci series

Enter your choice
1
Enter a numeric value
5

Factorial of 5 is 120

Do you want to continue 1/0
1

1.Factorial

2.Reverse

3.Test armstrong

4.Test palindrome

5.Test Prime

6.Fibonacci series

Enter your choice
2
Enter a numeric value
234
Reverse of 234 is 432

Do you want to continue 1/0
1

1.Factorial

2.Reverse

3.Test armstrong

4.Test palindrome

5.Test Prime

6.Fibonacci series

Enter your choice
3
Enter a numeric value
153
153 is an armstrong number

Do you want to continue 1/0
1

1.Factorial

2.Reverse

3.Test armstrong

4.Test palindrome

5.Test Prime

6.Fibonacci series

Enter your choice
4
Enter a numeric value
121
121 is palindrome number

Do you want to continue 1/0
1

1.Factorial

2.Reverse

3.Test armstrong

4.Test palindrome

5.Test Prime

6.Fibonacci series

Enter your choice
5
Enter a numeric value
11
11 is prime number

Do you want to continue 1/0
1

1.Factorial

2.Reverse

3.Test armstrong

4.Test palindrome

5.Test Prime

6.Fibonacci series

Enter your choice
6
Enter a numeric value
9
0       1       1       2       3       5       8       13      21      34      55
Do you want to continue 1/0 */
