// Day 51

import java.util.*;
import static java.lang.System.out;
class Sort_Array
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		out.println("Enter the size of array:");
		int size = sc.nextInt();

		int p[]= new int[size];
		out.println("Enter elements of array");
		for(int i=0;i<p.length;i++)
		{
			p[i]=sc.nextInt();
		}
		Arrays.sort(p);
		out.print("After Sorting array:");
		for(int i=0;i<p.length;i++)
		{
			out.print(p[i]+" ");
		}
		
	}
}