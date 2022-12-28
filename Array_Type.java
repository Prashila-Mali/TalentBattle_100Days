//Day 43

import java.util.*;
class Array_Type
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int odd=0,even=0;
		System.out.println("Enter Size of Array:");
		int a= sc.nextInt();

		System.out.println("Enter Elements:");
		int[] arr = new int[a];
        for (int i = 0; i < a; i++) 
        {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < a; i++)
        {
      		if(arr[i] % 2 == 1)
        		odd++;
      	    if(arr[i] % 2 == 0)
      			even++;
   		}
   		if(odd == a)
     		 System.out.println("Odd Array");
   		else if(even == a)
     		 System.out.println("Even Array");
   		else
     		 System.out.println("Mixed Array");
    }
}