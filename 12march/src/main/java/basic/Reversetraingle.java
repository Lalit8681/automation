package basic;

public class Reversetraingle {
	public static void main(String args[]) {
		int a=6;
		for(int i=1;  i<=a;i++) {
		for(int k=1;k<i; k++) //
		 {
		 System.out.print(" * ");
		 }
		
		System.out.println(" ");
		}
		for(int i=1;  i<=a;i++) {
			for(int k=a-1;k>=i; k--) //
			 {
			 System.out.print(" * ");
			 }
			
			System.out.println(" ");
			}
		}

}
