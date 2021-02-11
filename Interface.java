// program for interface 
//note::Calculate cgpi using your indivisual subject marks of sem 2
//roll no=69
//Name=Aayushi Tripathi

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

interface Dbit
{
    public void getNoOfSubjectInSeit();
    public String getAreaOfInterest()throws Exception;
    public double calculateCGPI();
}

public class inheritdemo implements Dbit {
    int n;
    String opinion;
    Scanner sc=new Scanner(System.in);
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    /**
     *
     */
    @Override
    public void getNoOfSubjectInSeit()
    {
         System.out.println("Enter the number of subject that you had in last semester");
         n=sc.nextInt();
    }
    
    /**
     *
     * @return
     * @throws java.io.IOException
     */
    @Override
   
    
    public String getAreaOfInterest() throws IOException
    {
        System.out.println("What is the area of your interest");
        opinion=br.readLine();
        return(opinion);
        
    }
    
    @Override
    public double calculateCGPI()
    {
        int sum=0;
        double CGPI;
        System.out.println("Enter marks of your each subject");
        for(int i=0;i<n;i++)
        {
            sum=sum+sc.nextInt();
        }
        
        CGPI=(sum/n)*100;
        return(CGPI);
    }       

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Interface i1=new Interface();
        i1.getNoOfSubjectInSeit(); 
        try {
            String view=i1.getAreaOfInterest();
        } catch (Exception ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        double grade=i1.calculateCGPI();
        System.out.println("Your CGPI is "+grade);
    }
    
}
/*
o/p:
C:\Aayushi>javac inheritdeno.java

C:\Aayushi>java inheritdemo
Enter the number of subject that you had in last semester
5
What is the area of your interest
100
Enter marks of your each subject
50
23
45
89
12
Your CGPI is 4300.0 */
