//Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.
//Example1) i/p:Wipro,3   , o/p:propropro




package string;

import java.util.Scanner;

public class String10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String s = sc.nextLine();
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print(s.substring(s.length()-n));
		}

	}

}
