package programs22dec;
import java.util.Scanner;
public class exceptionage {
	

	
	public static void main(String[] args) throws Exception {
		
		try (Scanner a = new Scanner(System.in)) {
			System.out.println("enter the age");
			int b=a.nextInt();
			if(b>=18)
			{
				System.out.println("you are eligible to vote");
			}
			else
			{
				
				
				throw new Exception("age is not correct U are not eligible for vote");
				
			}
		}
			
	}
	}


