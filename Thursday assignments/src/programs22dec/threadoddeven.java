package programs22dec;

public class threadoddeven {
	
		public static void main(String args[])
		{
		System.out.println("enter number");	
		MyThread t=new MyThread();
		t.start();
			
			for(int i=0;i<=50;i++)
			{
				System.out.println("even number");	
			}	
		}
	}
	class MyThread extends Thread
	{
		
		public void run() //overriding the run()
		{
		for(int i=0;i<=50;i++)
			{
				System.out.println("odd number");	
			}	
		}
	}

