//Day 42

import java.util.*;
class Arrays_Same
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first array:");
		int a= sc.nextInt();

		System.out.println("Enter the size of second array:");
		int b= sc.nextInt();
		System.out.println("Enter elements of first array:");
		int[] arr1 = new int[a];
        for (int i = 0; i < b; i++) 
        {
            arr1[i] = sc.nextInt();
        }
		
		System.out.println("Enter elements of second array:");
		int[] arr2 = new int[b];
        for (int i = 0; i < b; i++) 
        {
            arr2[i] = sc.nextInt();
        }
		
		boolean result = Arrays.equals(arr1,arr2);
  
        if (result == true) {
            
            System.out.println("Same");
        }
        else {
           
            System.out.println("Not Same");
        }

	}
}