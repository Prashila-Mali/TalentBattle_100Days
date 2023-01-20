//Day 65

import java.util.*;
import static java.lang.System.out;

class New_Tablet
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int b,p,n,h,w,i,area=0;
		n = sc.nextInt();
		b = sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			w = sc.nextInt();
			h = sc.nextInt();
			p = sc.nextInt();
			if(p<=b && area<w*h)
			{
				area=w*h;
			}
		}
		if(area !=0)
			out.println(area);
		else
			out.println("no tablet");

		
	}
}