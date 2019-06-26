package intrest;

public class gender {
	public static void main(String[] args) {
		char c=args[0].charAt(0);
		int age=Integer.parseInt(args[1]);
		if(args[0].equals("Female")&&(age>=1&&age<=58))
			System.out.println("Percentage of interest is 8.2%");
		if(args[0].equals("Female")&&(age>=59&&age<=100))
			System.out.println("Percentage of interest is 9.2%");
		if(args[0].equals("Male")&&(age>=1&&age<=58))
			System.out.println("Percentage of interest is 8.4%");
		if(args[0].equals("Male")&&(age>=59&&age<=100))
			System.out.println("Percentage of interest is 10.5%");
	}
		
}
