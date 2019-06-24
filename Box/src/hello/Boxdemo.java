 package hello;

public class Boxdemo 
{
	public static void main(String[] args)
	{
		Box b=new Box(5,10,15);
		System.out.println("the volume is "+b.height*b.lenght*b.width);
		
		System.out.println("the area is "+b.area());
	}
	

}