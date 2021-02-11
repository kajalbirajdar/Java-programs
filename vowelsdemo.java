//write  a java program to count number of vowels and consonants from the given string
//roll no=69
//Name=Aayushi Tripathi

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class vowelsdemo {

   


    public static void main(String[] args) throws IOException {
        String s1;
        int vowels=0,consonants=0,spaces=0,others=0,numbers;
        numbers = 0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter a string value!!!");
        s1=br.readLine();
        
        int size=s1.length();
        
        
        for(int i=0;i<size;i++)
        {
             char ch=s1.charAt(i);
             if((ch>=65&&ch<=95)||(ch>=97&&ch<=122))
             {
                  if(ch==65||ch==69||ch==73||ch==79||ch==85||ch==97||ch==101||ch==105||ch==111||ch==117
)
                  {
                      vowels++;
                  }
                  else
                  {
                      consonants++;
                  }
         
             }
             else if(ch>=48&&ch<=57)
             {
                
                 numbers++;
             }
             else if(ch==32)
             {
                 spaces++;
             }
             else
             { 
                 others++;
             }
        }  
             
             System.out.println("\n"+vowels+" vowels are present in the entered string");
             System.out.println("\n"+consonants+" consonants are present in the entered string");
              System.out.println("\n"+numbers+" numbers are present in the entered string");
             System.out.println("\n"+spaces+" spaces are present in the entered string");
             System.out.println("\n"+others+" other characters are present in the entered string");
        }
        
        
        
    }
/*
o/p:
C:\Aayushi>java vowelsdemo
Enter a string value!!!
kajal

2 vowels are present in the entered string

3 consonants are present in the entered string

0 numbers are present in the entered string

3 spaces are present in the entered string

0 other characters are present in the entered string */
    



 
