//create bank application
//roll no=69
//name=Aayushi Tripathi

import java.util.Scanner;

 public class bank
 { String name,add; int accno,contact,days; 
double dep,with,amount,intf,principle,prin; 
//Method (function) to create 
public int create() 
{ 
Scanner name1= new Scanner (System.in); 
System.out.print("Enter Name:"); 
name=name1.next(); 
System.out.print("Enter Account Number:"); accno=name1.nextInt(); 
System.out.print("Enter your contact number:"); contact=name1.nextInt(); 
System.out.print("Enter your Address:"); add=name1.next(); 	 return accno;  
//name1.close(); 	//How to close an object with return statement there? 
} 
//Method for deposit 
public double deposit() 
{ 
Scanner name2= new Scanner (System.in); System.out.print("Enter Amount to be deposited:"); 	 
dep=name2.nextInt(); 
return dep; 
} 
//Method for withdraw 
public double with() 
{ 
Scanner name3= new Scanner (System.in); System.out.print("\nEnter amount to be withdrawn:"); with=name3.nextDouble(); 
if(with>dep) 
{ 
System.out.print("Not Enough Funds\n"); 
} 
else 
{ 
amount=dep - with; 
System.out.print("\nAmount has been withdrawn\n"); 
//System.out.print("\nCurrent balance in account:"+amount); 
} 
System.out.print("\nCurrent balance in account:"+amount); dep=amount; 
return amount; 
} 
//METHOD FOR INTEREST 
public double compute() 
{ 
Scanner name4= new Scanner (System.in); System.out.print("Enter Principle amount:"); double prin=name4.nextDouble(); 
System.out.print("Enter rate of Interest:"); double intf=name4.nextDouble(); System.out.print("Enter no of days:"); int days=name4.nextInt(); principle=(prin*intf*days)/100; 
System.out.print("Amount after stipulated time:"+principle); return principle; 
} 
 
//METHOD FOR DISPLAY public void display() 
{ 
System.out.println("\nCustomers account no:"+accno); 
System.out.println("Customer balance:"+amount); 
System.out.println("Your interesrt money issss:"+principle); 
} 
public static void main(String[] args)throws Exception 
{ 
Scanner in = new Scanner(System.in); 
int userChoice; 
float balance = 0f; 
bank bk=new bank(); 
do { 
System.out.println("\n\n-----------------Welcome to HJXL Bank--------------------"); System.out.println("\n\n1. Create account"); System.out.println("2. 
Deposit"); 
System.out.println("3. Withdraw"); 
System.out.println("4. Compute Interest"); 
System.out.println("5. Display Balance"); System.out.print("Your choice, 0 to quit: "); userChoice = in.nextInt(); 
System.out.println("\nuserChoice"+userChoice); 
 	switch (userChoice) 
{ 
case 0: 
 	System.out.print("\n\n---------------Thank you -------------- "); break; 	 case 1: 
bk.create(); 
 
break; 
case 2: bk.deposit(); break; 
case 3: 
bk.with(); //ERROR method with in class bank cannot be applied to given 
types break; 
case 4: bk.compute(); break; 
case 5: bk.display(); break; 
default: System.out.println("Invalid"); break; 
} 
System.out.println(); 
} while (userChoice!=0); 
} 
} 
