package color;

public class colorcode {
	public static void main(String[] args)
	{
		char c=args[0].charAt(0);
		switch(c)
		{
		case 'R':
			System.out.println("Red");
		case 'B':
			System.out.println("Blue");
		case 'G':
			System.out.println("Green");
		case 'o':
			System.out.println("orange");
		case 'y':
			System.out.println("yellow");
		case 'w':
			System.out.println("White");
		default:
			System.out.println("invalid code");
			break;

			
		}
	}

}
