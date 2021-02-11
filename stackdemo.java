//any application of stack  
//roll no=69 name=Aayushi Tripathi

import java.util.*;

class stackdemo
{
	public static void main(String args[])
	{
		Stack st=new Stack();
	
		System.out.println("elements of stack before insertion:"+st);

		int a=10;
		st.push(a);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);

		System.out.println("after insertion in stack:"+st);

		boolean status=st.isEmpty();
		System.out.println("status:"+status);
		
		System.out.println("return from isEmpty():"+st.isEmpty());

		int index=st.search(20);

		System.out.println("index:"+index);
	}
}
/*o/p:
C:\Aayushi>java stackdemo
elements of stack before insertion:[]
after insertion in stack:[10, 20, 30, 40, 50]
status:false
return from isEmpty():false
index:4 */
		

		
		
		
