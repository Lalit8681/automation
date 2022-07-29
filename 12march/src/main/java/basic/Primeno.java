package basic;

public class Primeno {
	public static void main(String[] aregs) {
		int a=0;
		for(int m=1; m<=30; m++)//2
		{
			for(int n=2; n<m; n++)
			{
				if (m%n ==0)
				{
					a++;
				}
					
				}
			if (a == 0)	
				{
					System.out.println(m);
					
				}
			a=0;
			
			
		}
		
		
		
		
		
		
		//int b=1;
		//while (a<=100 && b<=10 ) 
		//{
		//if (a%2 ==1 && a%3 != 0 && a%5 != 0 && a%7 != 0 && b%2 ==1)
		//{
		//System.out.println(b);
		//System.out.println(a);
		//}
		//a++;
		//}
		
	}

}
