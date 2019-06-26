package oddeven;

import java.util.Scanner;

public class OddEven{
	public static void main(String[] args) {
		int n;
		Scanner a=new Scanner(System.in);
		n=a.nextInt();
		if (n==0) {
			System.out.println("the number is even");
		}
		else if(n%2==0) {
			System.out.println("the number is even");
		}
		else
		{
			System.out.println("the number is odd");
		}
		
}
}