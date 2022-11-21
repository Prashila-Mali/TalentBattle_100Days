import java.util.*;
class Quadrant
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter X coordinates: ");
		int x= sc.nextInt();

		System.out.println("Enter Y coordinates: ");
		int y=sc.nextInt();

                if(x>0 && y>0)
                {
                       System.out.println("This point lies in First Quadrant");
                }
                else if(x<0 && y>0)
                {
                	System.out.println("This point lies in second Quadrant");
                }
		else if(x<0 && y<0)
		{
			System.out.println("This point lies in third Quadrant");
		}
		else
		{
			System.out.println("This point lies in Fourth Quadrant");
		}
	}
}
