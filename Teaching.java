//program for inheritance
//roll no=69
//Name=Aayushi Tripathi

import java.util.Scanner;

class Faculty
{
     int basic;
     Scanner sc=new Scanner(System.in);
     int getTotalSalary()
     {
         System.out.println("Enter your basic salary amount");
         basic=sc.nextInt();
         return(basic);
     }
}

class Hra extends Faculty
{
    int HRA;
    int getHra()
    {
        System.out.println("Enter your HRA amount");
         HRA=sc.nextInt();
         return(HRA);
     }
}

class Da extends Hra
{
    int DA;
    int getDa()
    {
        System.out.println("Enter your DA amount");
        DA=sc.nextInt();
        return(DA);
    }
}


public class Teaching extends Da {

    static int tax=500;
    public static void main(String[] args) {
        Da d1=new Da();
        int total_sal=d1.getTotalSalary()+d1.getHra()+d1.getDa()-tax;
        System.out.println("Cash in hand is:"+total_sal);
                }
}

/* 
o/p:
C:\Aayushi>javac Teaching.java

C:\Aayushi>java Teaching
Enter your basic salary amount
2000
Enter your HRA amount
3000
Enter your DA amount
2000
Cash in hand is:7000 */

