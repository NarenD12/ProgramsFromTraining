//@Naren
//Check if a variable is a Single Digit Number
public class SingleDigit
{
	public static void main(String args[])
	{
		int a = 0;
		int b = 10;
		{
			//Checking if a is a number between 0 and 10
			if( a<10 && a>=0 )
				System.out.println("a is a Single Digit Number");
			else 
				System.out.println("a is not a Single Digit Number");
		}
		
		{
			//Checking if b is a number between 0 and 10
			if( b<10 && b>=0 )
				System.out.println("b is a Single Digit Number");
			else
				System.out.println("b is not a Single Digit Number");
		}
	}
}