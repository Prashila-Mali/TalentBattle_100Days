//Day 62

import java.util.*;
import static java.lang.System.out;
class Gold_Mining
{
	public static void main(String[] args) 
	{
		int n,x,y;
		Scanner sc = new Scanner(System.in);
		out.println("Enter the elements:");
		n = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();

		int max_weight = (n+1) * y;

	    if(max_weight < x)
	    {
			out.println("No");
	    }
	    else
	    {
			out.println("Yes");
	    }
		
	}
}