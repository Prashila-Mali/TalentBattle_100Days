// Day 53

import java.util.*;
import static java.lang.System.out;
class Max_Sub_Pro
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		out.println("Enter the array size:");
		int size = sc.nextInt();

		int a[]= new int[size];
		out.println("Enter the elements of array:");
		for(int i=0;i<size;i++)
			a[i] = sc.nextInt();

		int result = a[0];
        int n = a.length;
 
        for (int i = 0; i < n; i++)
        {
            int mul = a[i];
            for (int j = i + 1; j < n; j++)
            {
                result = Math.max(result, mul);
                mul *= a[j];
            }
            result = Math.max(result, mul);
        }
        out.println(result);
	}
	
}