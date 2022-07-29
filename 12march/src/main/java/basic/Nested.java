package basic;

public class Nested {
	public static void main(String[] args) {
		int marks= 101;// Marks should be smaller or equla to 100 or more than 40%
		
		if (marks<=100)//outer if
		{
			if (marks>=40)//inner  if
			{
				System.out.println("you are passed");
			}
			else
			{
				System.out.println("you are faild");
			}
		}
		else
		{
			System.out.println("invalid marks");
			
		}
			
	}

}
