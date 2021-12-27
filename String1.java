package string;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		String r="";
		String s= sc.nextLine();
		
	   for(int i=s.length()-1;i>=0;i--) {
		   r=r+s.charAt(i);
	   }
	   if(s.equals(r)) {
		   System.out.println("Pallin");
	   }
	   else {
		   System.err.println("NotPallin");
	   }
	   
				
				

	

}
}
