/*Write a do-while loop that asks the user to enter two numbers.The numbers should be added and the sum displayed.The loop should
ask the user wheather he or she wishes to perform again.If so,the loop should repeat otherwise it should terminate*/
package com.Rakesh;
import java.util.*;
public class AddNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char choice;
		do {
			System.out.println("enter first number");
			int a=sc.nextInt();
			System.out.println("enter second number");
			int b=sc.nextInt();
			int sum=a+b;
			System.out.println("sum:"+sum);
			choice=sc.next().charAt(0);
		}while(choice=='Y');
		sc.close();

	}

}
