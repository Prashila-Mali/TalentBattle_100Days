//Day 21

import java.util.*;
class PalindromeNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		int rem,rev=0,temp=n;

		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}

		if(temp==rev)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not Palindrome Number");
		}
	}
	
}