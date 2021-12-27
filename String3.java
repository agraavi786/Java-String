package string;

import java.util.Scanner;

public class String3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s = sc.nextLine();
		String r="";
		for (int i=0;i<2;i++) {
			r=r+s.charAt(i);
		}
		
		for(int i=0;i<s.length();i++) {
		System.out.print(r);
		}
		

	}

}

