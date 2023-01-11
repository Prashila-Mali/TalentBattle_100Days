// Day 54

import java.util.*;
import static java.lang.System.*;
class Disjoint
{
	static boolean isDisjoint(int a[],int b[])
	{
		for(int i=0;i<a.length;i++)
			for(int j=0;j<b.length;j++)
				if(a[i]==b[j])
				{
					return false;				
				}
		return true;	
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		out.println("Enter the size of 1st array:");
		int size1 = sc.nextInt();
		int a[] = new int[size1];
		for(int i=0;i<size1;i++)
			a[i] = sc.nextInt();

		out.println("Enter the size of 2nd array:");
		int size2 = sc.nextInt();
		int b[] = new int[size2];
		for(int i=0;i<size2;i++)
			b[i] = sc.nextInt();

		if(isDisjoint(a,b))
		{
			out.println("Not Disjoint");
		}
		else
		{
			out.println("Disjoint");
		}
		
	}
}