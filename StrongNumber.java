//Day 15

import java.util.*;
public class StrongNumber {

	 public static void main(String[] args) 
	 {
	 	Scanner sc= new Scanner(System.in);
	 	int n = sc.nextInt();

		int rem=0,sum=0;
		int temp=n;
		while(n>0)
		{
            rem = n % 10;  
			n = n/10;  
		    int fact=1;

		    for(int i=1;i<=rem;i++)
		    {
               fact = fact * i;
		    }
		    sum= sum + fact;
		}
      
		
		if(sum==temp)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not a Strong Number");
		}
	}
}