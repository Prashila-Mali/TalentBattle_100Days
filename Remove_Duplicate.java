// //Day 48

import java.util.*;
class Remove_Duplicate
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of array:");
		int size = sc.nextInt();

		int a[] = new int[size];

		System.out.println("Enter the Elements of array:");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}

	   int new_arr[] = new int[100];
      
       System.out.println("Array elements after removing duplicates");
       for(int i=0;i<size;i++)
       {
        new_arr[a[i]]++;
        if(new_arr[a[i]]==1)
        {
            System.out.println(a[i]);
        }
       }
    }
}