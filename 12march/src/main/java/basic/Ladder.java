package basic;

public class Ladder {
	public static void main (String[] args) {
		int marks= 70;
		
		if (marks<=100 && marks>=0)// outer if & invalid marks
		{
			if (marks>=90) //A+grade
			{
			System.out.println("A+ grade");
			}
			else if(marks >=80 && marks<90)
			{
			System.out.println("A grade");
			}
			else if(marks >=70 && marks<80)
			{
			System.out.println("B+ Grade");
			}
			else if(marks >=60 && marks<70)
			{
			System.out.println("B Grade");
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
