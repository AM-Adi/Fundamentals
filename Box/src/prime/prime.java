package prime;
import java.util.Scanner;

public class prime {
	public static void main(String[] args)
	{
		int i;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		i=n/2;
		if(n==i)
		{
			System.out.println("The given number is prime");
		}
		else
		{
			System.out.println("The given number is not prime");
		}
	}

}
