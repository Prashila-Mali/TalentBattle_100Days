// Day 63

import java.util.*;
import static java.lang.System.out;
class Balancing_Weight
{
	public static void main(String args[])
	{
		int size,i,lw=0,hw=0;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();

		int w1[] = new int[size];
		int w2[] = new int[size];
		int x1[] = new int[size];
		int x2[] = new int[size];
		int m[] = new int[size];

		for(i=0;i<size;i++)
		{
			w1[i] = sc.nextInt();
			w2[i] = sc.nextInt();
			x1[i] = sc.nextInt();
			x2[i] = sc.nextInt();
			m[i] = sc.nextInt();
		}

		for(i=0;i<size;i++)
		{
			lw = w1[i] + x1[i] * m[i];
			hw = w1[i] + x2[i] * m[i];
			int res = ((lw<=w2[i]) && (hw>=w2[i])) ? 1 :0;
			out.println(res);
		}
	}
}