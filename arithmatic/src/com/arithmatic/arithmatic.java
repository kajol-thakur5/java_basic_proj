package com.arithmatic;

import java.util.Scanner;

public class arithmatic {

	public static void main(String[] args) {
		float ans;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.Addition "+"\r\n2.Subtraction "
					+ "\r\n3.Multiplication"+"\r\n4.Division"+"\r\n5.Exit");
			
			System.out.println("Enter your choice for operation:");
			int ch= sc.nextInt();
		if(ch>0 && ch<5) {
			System.out.println("Enter First number:");
			float one= sc.nextFloat();
			System.out.println("Enter Second number:");
			float two= sc.nextFloat();
		switch(ch){
			case 1:
				 ans =one+two; 
				 System.out.println("Answer = "+ans);
				 break;
			case 2:
				 ans =one -two;
				 System.out.println("Answer = "+ans);
				 break;
			case 3:
				ans = one * two;
				System.out.println("Answer = "+ans);
				break;
			case 4:
				ans = one/two;
				System.out.println("Answer = "+ans);
				break;
			case 5:
				 System.exit(0);
				 
		}}else if (ch==5)
		{
			System.out.println("thank you for using calculator");
			break;
		}
		else
		{
			System.out.println("Invalid Operation");
		}
	}
	}
	}


