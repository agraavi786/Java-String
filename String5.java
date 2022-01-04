//Given 2 strings, a and b, return a new string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.
//The strings will not be the same length, but they may be empty (length 0).
//If input is "hi" and "hello", then output will be "hihellohi".



package string;
import java.util.*;

public class String5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();
		String s1=sc.nextLine();
		if(s.length()>s1.length()) {
			System.out.println(s1.concat(s).concat(s1));
		}
		else {
			System.out.println(s.concat(s1).concat(s));
			
		}
	}

}
