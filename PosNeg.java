import java.util.*;
class PosNeg
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  number:");
		int num = sc.nextInt();
		if(num<0)
		{
			System.out.println("Negative Number");
		}
		else if(num>0)
		{
			System.out.println("Postive Number");
		}
		else
			System.out.println("Neither Postive nor Negative");

	}
}