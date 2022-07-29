package prct;

public class pract3 {
//		s
//	   sc
//	  sch
//	scho
//	schoo
//	school
	public static void main(String[] args) {
		String a="school";
		int b=a.length();
		for(int c=0;c<=b-1;c++) {
			for (int d=b;d>b;d--) {
				System.out.print(" ");
			}
			for(int d=0;d<=c;d++) {
				System.out.print(" "+a.charAt(d));
			} 
			System.out.println(" ");
		}
	}
	
	
	

}
