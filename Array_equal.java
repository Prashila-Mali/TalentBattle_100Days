//Day 56

import java.util.*;
import static java.lang.System.out;
class Array_equal
{
	static boolean array_equal(int a[],int size)
	{
		for(int i=0;i<size;i++)
		{
			while(a[i]%2==0)
				a[i]/=2;

			while(a[i]%3==0)
				a[i]/=3;
		}
		for(int i=1;i<size;i++)
			if(a[i] != a[0])
			{
				return false;
			}
		return true;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		out.println("Enter the size of array:");
		int size = sc.nextInt();

		int a[] = new int[size];
		out.println("Enter elements of array:");
		for(int i=0;i<size;i++)
		{
			a[i] = sc.nextInt();
		}

		if(array_equal(a,size))
			out.println("Yes");
		else
			out.println("No");
		
	}
	
}