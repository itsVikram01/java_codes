package java_codes;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		sc.close();
		
		int result=factorial(num);
		System.out.println(num+"! = "+result);
	}

	private static int factorial(int num) {
		if (num==0 || num==1) {
			return 1;
		} else {
			return num*factorial(num-1);
		}
	}
}
