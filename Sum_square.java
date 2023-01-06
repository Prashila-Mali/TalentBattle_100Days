//Day 50

import java.util.*;
import static java.lang.System.out;
class Sum_square
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		out.println("Enter the size of array:");
		int size = sc.nextInt();
		int sum=0,square=0;
		int a[]=new int[size];
		out.println("Enter elements of array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
        for(int i=0;i<size;i++)
        {
            square=a[i]*a[i];
            sum=sum+square;
        }
        out.println(sum);
	}
}