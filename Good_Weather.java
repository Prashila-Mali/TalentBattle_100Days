//Day 60

import java.util.*;
import static java.lang.System.out;
class Good_Weather
{
	public static void main(String[] args) 
	{
		int count_0=0,count_1=1;
		Scanner sc = new Scanner(System.in);
		out.println("Enter the number of days in week:");
		int days = sc.nextInt();
		int a[] = new int[days];
		for(int i=0;i<days;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
				count_0++;
		    else
				count_1++;
		}

		if(count_1>count_0)
			out.println("Yes");
			
		else
			out.println("No");
	}
}


