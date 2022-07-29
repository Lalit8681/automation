package basic;

public class Method {
	
	public void righttringle(int m) {
		for (int a=1; a<=m; a++)//1
		{for (int b=1; b<=a; b++)//1
			System.out.print(" *");//*  
		{
			System.out.println();
		}
		}
	}
	public void ighttringle(int l) {
		for (int a=1; a<=l; a++)//1
		{for (int b=l; b>=a; b--)//1
			System.out.print(" *");//*  
		{
			System.out.println();
		}
		}
	}
	//public void retriangle() {
	//	for (int a=1; a<=5; a++)//1
	//	{for (int b=1; b<=a; b++)//1
		//	System.out.print(" *");//*  
		//}
		//	System.out.println();
		//}	
public static void main (String[] args) {
	Method obj = new Method();
	obj.righttringle(5);
	obj.ighttringle(4);
	obj.righttringle(5);
	obj.ighttringle(4);
	
	
}
}
	


