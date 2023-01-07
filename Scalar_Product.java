//Day 49

import java.util.*;
class Scalar_Product
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum=0,size;
		System.out.println("Enter the size of array:");
		size = sc.nextInt();
         
		int a[]=new int[size];
		System.out.println("Enter elements of 1st array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		Integer b[]=new Integer[size];
		System.out.println("Enter elements of 2nd array:");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}

		Arrays.sort(a);
		Arrays.sort(b);
		Collections.reverse(Arrays.asList(b));
		for(int i=0;i<a.length;i++)
		{
			sum += a[i]*b[i];

		}
		System.out.println(sum);
	}
}