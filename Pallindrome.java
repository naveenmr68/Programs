package Logics;

import java.util.Scanner;
public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		
		int num=sc.nextInt();
		int rev=0;
		int revnum=num;
		
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		
		if(revnum==rev)
		{
			System.out.println("the given number is pallindrom");
		}
		else
		{
			System.out.println("the given number is not  pallindrom");
		}
	}

}
