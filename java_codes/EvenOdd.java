package java_codes;

import java.util.Scanner;

public class EvenOdd {
	/* odd and even */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no : ");
        int n = sc.nextInt();
        sc.close();
        if (n%2==0) {
            System.out.print("Number "+n+" is even.");	
		} else {
	        System.out.print("Number "+n+" is odd.");
		}
        
    }
}