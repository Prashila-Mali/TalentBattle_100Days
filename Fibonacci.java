//Day 11

import java.util.*;
class Fibonacci
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
        int a=0,b=1,sum=0;
		for(int i=1;i<=n;i++)
		{
		  System.out.println(a);
          sum=a+b;
          a=b;
          b=sum;

		}
	}
	
}

