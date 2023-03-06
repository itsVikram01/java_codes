package java_codes;

import java.util.Scanner;

public class ReverseInt {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no : "); // 1234
        int num = sc.nextInt();
        sc.close(); 

        int reversedNum = reverseNumber(num);
        System.out.println("reverseNumber : "+reversedNum);
    }
	
	public static int reverseNumber(int num) {
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        return reverse;
    }
}
