//Day 12

import java.util.*;
class SumOfDigit
{
	public static void main(String args[])
	{
		 int sum=0,digit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
       
		while(n > 0)
		{
			digit = n % 10;
			sum = sum + digit;
			n = n / 10;

		}
		System.out.println(sum);
	} 
	
}