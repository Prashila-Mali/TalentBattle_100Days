// Day 55

import java.util.*;
import static java.lang.System.*;
class Max_Scalar_Product
{
	public static void main(String[] args) 
	{
		int sum=0;
		Scanner sc = new Scanner(System.in);
		out.println("Enter the size of array:");
		int size = sc.nextInt();

		int a[] = new int[size];
		out.println("Enter elements of 1st array:");
		for(int i=0;i<a.length;i++)
			a[i]= sc.nextInt();

		int b[] = new int[size];
		out.println("Enter elements of 2nd array:");
		for(int i=0;i<b.length;i++)
			b[i]= sc.nextInt();

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