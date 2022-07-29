package basic;

public class Hw1 {
	public static void main (String[] args) {
		int a=20;
		int b=10;
		int c=70;
	
		
		if (a>b && a>c)
		{
		System.out.println("A is the grater value");
		}
		else if (b>a && b>c)
		{
		System.out.println("B is the graeter value");
		}
		else if (c>a && c>b)
		{
		System.out.println("c is the greater value");
		}
		
		else if (a==b || b==c || c==b)
		{
		System.out.println(" all value are smae");
		}
	}

}
