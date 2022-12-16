//Day 24

import java.util.*;
class Pattern
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n = sc.nextInt();

		
		int i=1;
		while(i<=n)
		{
			int space=1;
			while(space<=n-i)
			{
				System.out.print(' ');
				space++;
			}

			int stars=1;
			while(stars<=i)
			{
				System.out.print("*");
				stars++;
			}

			int star1=1;
			while(star1<=i-1)
			{
				System.out.print("*");
				star1++;
			}
			System.out.println();
			i++;
		}
		
	}
	
}