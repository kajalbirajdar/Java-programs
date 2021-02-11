//any application based on linked list  roll no=69 Name=Aayushi Tripathi

import java.util.*;
class listdemo1
{
	public static void main(String args[])
	{
		LinkedList l1=new LinkedList();
		
		l1.add("k");
		l1.add("a");
		l1.add("j");
		l1.add("a");
		l1.add("l");

		System.out.println("original contents of l1:"+l1);

		l1.remove("l");

		System.out.println("contents of ll after deletion: "+l1);

	}
}