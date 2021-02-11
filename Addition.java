// write a java program to demonstrate constructers,parametrized constructers and constructer overloading
//Roll no=69
//Name=Aayushi Tripathi
class Addition
{
	
	Addition()
	{
		int a=10;
		int b=5;
		int c=a+b;
		System.out.println("addition of a+b:"+c);
	}
	
	Addition(int x,int y)
	{
		int z;
		z=x+y;
		System.out.println("addition of x+y:"+z);
	}
	
	public static void main(String args[])
	{
		Addition a1=new Addition();
		Addition a2=new Addition(20,30);
	}
}

/* o/p --
C:\Aayushi>javac Addition.java

C:\Aayushi>java Addition
addition of a+b:15
addition of x+y:50  */
	 