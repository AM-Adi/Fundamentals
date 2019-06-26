package sum;

public class sumofdigits {
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int sum=0,i;
		for(i=0;i>num;i++)
		{
			sum=sum+(num%10);
			num=num/10;
		}
		System.out.println("the sum is "+sum);
	}

}
