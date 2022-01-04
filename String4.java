//Write a java program that accepts a string and returns a new string without the first and last character of the input string.
package string;
import java.util.Scanner;

public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		String s=sc.nextLine();
		for(int i=1;i<s.length()-1;i++) {
			System.out.print(s.charAt(i));
		}

	}

}
