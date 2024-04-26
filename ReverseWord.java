package StringLogics;

import javax.swing.Spring;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s[]
		            = "I LOVE YOU".split(" ");
		        String ans = "";
		        for (int i = s.length - 1; i >= 0; i--) {
		            ans += s[i] + " ";
		        }
		         
		        System.out.println(
		            ans.substring(0, ans.length() - 1));
		    }
}
	

