package advance;
import java.util.Scanner;
public class scanner {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scan.nextLine();
		System.out.println("you have entered  "  +  name);
		System.out.println("what is hobby");
		String hobby = scan.nextLine();
		System.out.println("my hobby is"  +hobby);
		System.out.println("what is your age");
		String age= scan.nextLine();
		System.out.println("my age is" +age);
				
		
	}

}
