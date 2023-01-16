//Day 57

import java.util.*;
import static java.lang.System.out;
class Pass_Fail
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,i;
		n=sc.nextInt();
		int t[]=new int [n];
		int c[]=new int [n];
		int m[]=new int [n];
		for(i=0;i<n;i++)
		{
		 	t[i]=sc.nextInt();
		 	c[i]=sc.nextInt();
		 	m[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
		 	if(((c[i]*4)-t[i])>=m[i] )
		 	{
				System.out.println("Pass");
		 	}
			else
			{
				System.out.println("Fail");
			}
		}

	}
	
}