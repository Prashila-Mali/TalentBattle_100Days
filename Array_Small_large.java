//Day 45

import java.util.*;
class Array_Small_large
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of array:");
		int n = sc.nextInt();

		System.out.println("Enter element of array: ");
		int[] arr = new int[n];
		for (int i=0;i<n;i++ ){
			arr[i]=sc.nextInt();
		}

		int smallest = arr[0];
  		int largest = arr[0];

  		for (int i = 1; i < arr.length; i++) {
   			if (arr[i] > largest)
    			largest = arr[i];
   			else if (arr[i] < smallest)
  				smallest = arr[i];
  		}

  		System.out.println("Largest Number is : " + largest);
  		System.out.println("Smallest Number is : " + smallest);





	}
}