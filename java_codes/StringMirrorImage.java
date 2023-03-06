package java_codes;

import java.util.Scanner;

public class StringMirrorImage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Inter a String : ");
        String input = sc.nextLine();
        sc.close();
        
        String output = mirrorImage(input);
        System.out.println("Mirror image: " + output);
    }
    
    public static String mirrorImage(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }
}
