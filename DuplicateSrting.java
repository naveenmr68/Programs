package StringLogics;

public class DuplicateSrting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string1="Verify application";
		int count;
		char string[]=string1.toCharArray();
		
		System.out.println("Duplicate characters are given string is:");
		
		for(int i=0;i<=string.length-1;i++)
		{
			count=1;
			for(int j=i+1;j<=string.length-1;j++)
			{
				  if(string[i] == string[j] ) 
				  {    
	                    count++;    
	                    //Set string[j] to 0 to avoid printing visited character    
	                    string[j] = '0';    
				  }
			}

			   if(count > 1 && string[i] != '0')    
	                System.out.println(string[i]);    
	}
}
}
