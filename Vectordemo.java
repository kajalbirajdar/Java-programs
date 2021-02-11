//write a java programs to test whether the given element is present in the vector array
//roll no=69
//Name=Aayushi Tripathi

import java.util.*;

public class Vectordemo
{
	public static void main(String args[])
	{
		Vector v=new Vector();
		
		System.out.println("Initial size of vector:"+v.size());
		
		System.out.println("intial capacity:"+v.capacity());
		
		v.addElement(new Integer(10));
		v.addElement(new Integer(20));
		v.addElement(new Integer(30));
		v.addElement(new Integer(40));
		
		System.out.println("capacity after 4 addition:"+v.capacity());

		if(v.contains(new Integer(10)))
		{
			System.out.println("element found");
		}
		else
		{
			System.out.println("element is not found");
		}
		
	}
}
/*o/p:
C:\Aayushi>java Vectordemo
Initial size of vector:0
intial capacity:10
capacity after 4 addition:10
element found */