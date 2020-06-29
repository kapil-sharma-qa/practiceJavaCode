package mainSolutions;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str= scan.nextLine();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev= rev+str.charAt(i);
		}
		if(str.equalsIgnoreCase(rev)) {
			System.out.println(str+" "+rev+ "  "+"Palindrome");
		}
		else {
			System.out.println(str+" "+rev+ "  "+"Not Palindrome");
		}

	}

}
