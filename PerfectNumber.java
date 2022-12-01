//Day 16

import java.util.*;
class PerfectNumber
{
    public static void main(String arg[])
    {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        int sum=0,temp=n;
        for (int i = 1; i < n; i++)
         {
             if (n % i == 0) 
             {
                System.out.println(i);
                sum=sum+i;
            }
           
        }
        
        if(sum==temp)
        {
           System.out.println(" Perfect Number");
        }
        else
        {
        	System.out.println(" Not a Perfect Number");
        }


    }
	
}


 