//Day 61

import java.util.*;
import static java.lang.System.out;
class Chess_Format
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		out.println("Enter the size:");
		int size = sc.nextInt();

		for(int i=0;i<size;i++)
		{
			int a= sc.nextInt();
			int b= sc.nextInt();
			int c=a+b;

			if(c<3)
		   		out.println("1");
			else if(3<=c && c<=10)
		  		out.println("2");
			else if(11<=c && c<=60)
		   		out.println("3");
			else 
		   		out.println("4");
		}
		

	}
}