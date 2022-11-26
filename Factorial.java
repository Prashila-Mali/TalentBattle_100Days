//Day 10

import java.util.*;
class Factorial
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		int fact=1;
		if(num==0 || num==1)
			System.out.println(1);
		else
		{
			for(int i=num;i>=1;i--)
				fact=fact*i;
		}
		System.out.println(fact);
	}
	
}