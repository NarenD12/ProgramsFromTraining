//@Naren
//Comparing 3 variables for Largest and Smallest Number
public class CompareVariable
{
	public static void main(String args[])
	{
		int a=90;
		int b=890;
		int c=78;
		{	//Comparing variables to check for Largest Number
			//Comparing a with b & c 
			if(a>=b && a>=c)		
				System.out.println("a is the Largest Number ");
			
			//Comparing b with a & c
			else if(b>=a && b>=c)	
				System.out.println("b is the Largest Number ");
			
			else 
				System.out.println("c is the Largest Number ");
		}
		{	//Comparing variables to check for the Smallest Number
			//Comparing a with b & c
			if(a<=b && a<=c) 		
			System.out.println("a is the Smallest Number");
		
			//Comparing b with a & c
			else if(b<=a && b<=c) 	
			System.out.println("b is the Smallest Number");
			
			else
			System.out.println("c is the Smallest Number");
		}	
	}
}