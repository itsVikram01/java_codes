package java_codes;

import java.util.Scanner;

public class SwapFirstAndLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Input num is : " + num);
        sc.close();

        // handle single-digit numbers
        if (num < 10) {
            System.out.println("Input number must be 2 digits.");
            return;
        }
        
        // count the number of digits in the input number
        int length = (int) Math.log10(num) + 1;
        System.out.println("Length of no is : " + length);

        int positionValue=(int) Math.pow(10, length-1);
        System.out.println("positionValue of no is : "+positionValue);
        
        // extract the first and last digits        
        int firstDigit = num / positionValue;
        System.out.println("FirstDigit of no is : " + firstDigit);
        int lastDigit = num % 10;
        System.out.println("LastDigit of no is : " + lastDigit);

        // swap the first and last digits
        int tempNo = num - firstDigit*positionValue - lastDigit;
        System.out.println("without fistDigit and lastDigit place value the no is : 0" + tempNo);
        
        num = tempNo + lastDigit*positionValue + firstDigit;
        System.out.println("After swaping fistDigit and lastDigit num is : " + num);
    }
}

