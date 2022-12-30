// Day44

import java.util.*;
class ArrayElementEvenOdd
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();

		System.out.println("Enter element of array: ");
		int[] arr = new int[n];
		for (int i=0;i<n;i++ ){
			arr[i]=sc.nextInt();
		}

		int odd =0 ,even=0;
		for (int i=0;i<n;i++) {
			if (arr[i] / 2 ==0) {
				even++;
			}
			else {
				odd++;
			}
		}

		System.out.println("Number of even elements: \n"+even);
		System.out.println("Number of odd elements: \n"+odd);
	}
}