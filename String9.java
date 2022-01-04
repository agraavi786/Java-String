//the first character of b, second character of a, second character of b and so on. Any characters left, will go to the end of the result.
//Example1) i/p:Hello,World  , o/p:HWeolrllod





package string;

import java.util.Scanner;

public class String9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String s = sc.nextLine();
		String s1=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i)+""+s1.charAt(i));
		}

	}

}
