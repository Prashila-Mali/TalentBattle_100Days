//Day 59

import java.util.*;
import static java.lang.System.out;
class Body_Mass_Index
{
	public static void main(String[] args) 
	{
		int m,h,bmi;
		Scanner sc = new Scanner(System.in);
		out.println("Enter the mass in kg:");
		m = sc.nextInt();

		out.println("Enter the height in metre:");
		h = sc.nextInt();

		bmi = m/(h*h);
		
		if(bmi<=18)
			out.println("1");
		else if(bmi>=19 && bmi<=24)
			out.println("2");
		else if(bmi>=25 && bmi<=29)
			out.println("3");
		else
			out.println("4");


	}	
}