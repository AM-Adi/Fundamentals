package Floyds;

public class Floyds {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int i,j;
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.println("* ");
			}
			System.out.println("\n");
		}
	}

}
