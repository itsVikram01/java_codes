package java_codes;

import java.util.Scanner;

public class Fibonacci_011235 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter no. of terms : ");
		int n=sc.nextInt();
		sc.close();
		
        System.out.println("The first " + n + " terms of the Fibonacci sequence are:");

        int n1 = 0, n2 = 1, n3;
        for (int i = 1; i <= n; ++i) {
            System.out.print(n1 + " ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}