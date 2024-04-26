package StringLogics;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		String str= "I LOVE YOU", reverse="";
        char ch;
       
      
     // System.out.println("input parameter"); //Example word
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        reverse= ch+reverse; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ reverse);
		
		
//		String str="printreverse",reverse="";
//		char ch;
//		for(int i=0;i<=str.length();i++)
//		{
//             ch=str.charAt(i);
//             reverse=ch+reverse;
//             
//		}
//		System.out.println("Reverse string is:"+reverse);
    }
	}


