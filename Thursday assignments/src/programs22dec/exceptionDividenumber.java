package programs22dec;
import java.util.Scanner;
public class exceptionDividenumber {
	
		 public static void main(String[] args)
	 {
	 try
	 {
	  int a,b,c;
	      
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.print("enter first number");
	  a=sc.nextInt();
	  
	  System.out.print("enter second number");
	  b=sc.nextInt ();
	  
	  c=a/b;
	  System.out.println("Ans :"+c);
	  }
	  catch(ArithmeticException e)
	  {
			System.out.println("error"+e);
	  }
	  }
	  }


