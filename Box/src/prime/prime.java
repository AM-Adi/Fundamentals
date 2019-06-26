package prime;
import java.util.Scanner;

public class prime {
	public static void main(String[] args)
	{
        int i=0,count=0,num=Integer.parseInt(args[0]);
		
		for(i=2;i<=num;i++)
		{
		
			if(num%i==0)
				count++;
		}
		
		if(count==1)
			System.out.println("Given Number "+num+" is Prime");
		else
			System.out.println("Given Number "+num+" is Not Prime");
	}
	}


