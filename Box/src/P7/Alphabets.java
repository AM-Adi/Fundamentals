package P7;

import java.util.Scanner;

public class Alphabets {
	 public static void main (String[] args) 
	    {
	        char item1;
	        char item2;
	        Scanner s=new Scanner(System.in);
	        Scanner c=new Scanner(System.in);
	        item1=s.next().charAt(0);
	        item2=c.next().charAt(0);
	        if (item1>item2)
	            System.out.println(item2+" , "+item1);
	        
	        else
	            System.out.println(item1+" , "+item2);
	    }
	    }
