package prct;

public class forprogramme {
	public static void main(String[] args) {
		
	
	int lines=6;
	for(int space=1;space<lines;space++) {
		for(int d=lines-1; d>space;d--) {
			System.out.print(" ");
		}
		for(int k=1; k<=space;k++) {
			System.out.print(" "+k);
		}
      System.out.println();
	}
	}
}
