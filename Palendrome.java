import java.util.Scanner;
import java.util.Stack;
/**
 * @author Joshua Henderson
 */
/**
 * The program simply creates a stack with the characters of the given phrase.
 * Then it creates a string using the stack in reverse order. 
 * Then it checks if the string before and after are equal.
 */
public class Palendrome {
	public static void main(String[] args) {
	    Stack<Character> stack = new Stack<Character>();
		Scanner myPalendrome = new Scanner(System.in);
		System.out.println("Enter Word");
		System.out.println("Chris has edited this.");
		String Palendrome = myPalendrome.nextLine();
		for (int i=0;i<Palendrome.length();i++) {
			stack.push(Palendrome.charAt(i));
		}//end for loop
		String reversePalendrome = "";
		while (!stack.isEmpty()) {
			reversePalendrome = reversePalendrome+stack.pop();
		}//end while loop
		if (Palendrome.equals(reversePalendrome)) {
			System.out.println("Your phrase is a Palendrome");
			
		}
		else {
			System.out.println("Your phrase is not a Palendrome");
		}//end if statement.
		myPalendrome.close();
	}//end main
	
		
	}//end Palendrome
