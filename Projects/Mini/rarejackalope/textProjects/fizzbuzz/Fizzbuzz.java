package rarejackalope.textProjects.fizzbuzz;

public class Fizzbuzz 
{
	public static void main(String[] args) 
	{
		fizzbuzz();
	}
	
	public static void fizzbuzz()
	{
		for(int i = 1; i < 101;i++)
		{
			if(i % 3 == 0)
			{
				if(i % 5 == 0)
				{
					System.out.println("fizzbuzz");
				}
				
				System.out.println("fizz");
			}
			else if(i % 5 == 0)
			{
				System.out.println("buzz");
			}
			else
				System.out.println(i);
		}
	}
}
