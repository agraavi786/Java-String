//Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged.
//If the input is "xHix", then output is "Hi". If the input is "America", then the output is "America".

package string;

import java.util.Scanner;

public class String6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();
		//for(int i=0;i<s.length()-1;i++) {
			if(s.contains("x")) {
				System.out.println(s.replace("x", ""));
			}
			else {
				System.out.println(s);
			}
		//}

	}

}
