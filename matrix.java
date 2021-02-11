//write a program for multiplycation of matrices
//roll no=69
//name=Aayushi Tripathi
import java.io.*; 
import java.util.*;
import java.lang.*;
 class matrix 
{ 
public static void main(String args[]) 
{ 
int i,j,k,r,c,x[][],y[][],z[][]; Scanner sc=new Scanner(System.in); System.out.println("ENTER THE NUMBER 
OF ROWS OF MATRIX="); r=sc.nextInt(); 
 
 	System.out.println("ENTER THE NUMBER OF COLUMN OF MATRIX="); c=sc.nextInt(); x=new int[r][c]; y=new int[r][c]; z=new int[r][c]; 
System.out.println("ENTER THE ELEMENTS OF MATRIX 
X="); for(i=0;i<r;i++) 
{ for(j=0;j<c;j++) 
{ x[i][j]=sc.nextInt(); 
} 
} 
System.out.println("ENTER THE ELEMENTS OF MATRIX 
Y="); for(i=0;i<r;i++) 
{ for(j=0;j<c;j++) 
{ y[i][j]=sc.nextInt(); 
} 
} 
System.out.println("MULTIPLICATION OF 
MATRIX="); for(i=0;i<r;i++) 
{ for(j=0;j<c;j++) 
{ for(k=0;k<c;k++) 
{ z[i][j]=z[i][j]+x[i][k]*y[j][k]; 
} 
} 
} for(i=0;i<r;i++) 
{ for(j=0;j<c;j++) 
{ 
System.out.println(+z[i][j]); 
} 
System.out.println("\n"); 
} 
} } 
