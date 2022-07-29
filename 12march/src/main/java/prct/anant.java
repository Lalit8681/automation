package prct;

public class anant{
public static void main (String[]args) {
int b, c, a = 6; //Outer loop work for rows      
  	
		for (b=0; b<a; b++)   {//inner loop work for space 
		for (c=a-b; c>1; c--)  { //prints space between two stars
			System.out.print(" ");  }  //inner loop for columns 
		for (c=0; c<=b; c++ )   
		{   
			System.out.print("* "); //prints star   
			}//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   
	}   
}
