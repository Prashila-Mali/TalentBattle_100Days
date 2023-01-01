//Day 46

import java.util.*;
class Sum_of_Array
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = sc.nextInt();

		//int sum=0;
		int a[]=new int[n];

		System.out.println("Enter elements of array:");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}

		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		
	}
}