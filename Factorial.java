package Logics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		 System.out.println("please enter the number:");
		 
		 int number = scanner.nextInt();
		 
		int i=1,fact=1;
		
		 
		for(i=1;i<=number;i++)
		{
           fact=fact*i;
		}
System.out.println("Factorial of " + number + " is: " + fact);

scanner.close();
}
}


