package factorial;
import java.util.Scanner;

public class factorial 
{

	public static void main(String[] args)
	{
		int n,c;
		int fact=1;
		System.out.println("enter the number");
		Scanner a = new Scanner(System.in);
		n=a.nextInt();
		for(c=1;c<=n;c++) {
			fact=fact*c;
		}
		System.out.println("factoria of a number is "+fact);
		
	}
	
}
