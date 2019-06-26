package PositiveNegative;
import java.util.Scanner;

public class PN {
	public static void main(String[] args) {
	int n;
	Scanner a = new Scanner(System.in);
	n=a.nextInt();
	if(n==0)
	{
		System.out.println("the number is Zero");
	}
	if(n<0)
	{
		System.out.println("the number is negative");
	}
	else
	{
		System.out.println("the number is positive");

	}
	

}
}
