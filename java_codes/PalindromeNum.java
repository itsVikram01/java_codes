package java_codes;

import java.util.Scanner;

public class PalindromeNum {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no : "); // 1234
        int num = sc.nextInt();
        sc.close(); 

        int reversedNum = reverseNumber(num);
        System.out.println("reverseNumber : "+reversedNum);
        if (num == reversedNum) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
	
	public static int reverseNumber(int num) {
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return reverse;
    }
}
