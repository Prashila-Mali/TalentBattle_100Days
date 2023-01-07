// Day 52

import java.util.*;
import static java.lang.System.out;
class Reverse_Array_Ele
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		out.println("Enter the array size:");
		int size = sc.nextInt();

		int a[] = new int[size];
		out.println("Enter the elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		out.println("Reverse of an array is :");
		for(int i=size-1; i>=0; i--)
         	out.println(a[i]);
		
	}
	
}