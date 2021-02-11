//Any application based on queue program 
//roll no=69
//Name=Aayushi Tripathi

import java.util.LinkedList;
import java.util.Queue;

class queuedemo
{
	public static void main(String args[])
	{
		Queue<Integer> q=new LinkedList();

		for(int i=0;i<=5;i++)
		{
		q.add(i);
		}

		System.out.println("elements of queue:"+q);

		System.out.println(q);

		int deleted=q.remove();
		System.out.println("removed element:"+deleted);

		int head=q.peek();
		System.out.println("head of queue:"+head);
		
		int size=q.size();
		System.out.println("size of queue:"+size);

	}
}
/*o/p:
C:\Aayushi>java queuedemo
elements of queue:[0, 1, 2, 3, 4, 5]
[0, 1, 2, 3, 4, 5]
removed element:0
head of queue:1
size of queue:5 */ 