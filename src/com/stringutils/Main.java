package com.stringutils;
import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("\n==== STRING UTILITY TOOL ====");
            System.out.println("1 Reverse String");
            System.out.println("2 Check Palindrome");
            System.out.println("3 Count Vowels");
            System.out.println("4 Remove Duplicate Characters");
            System.out.println("5 Character Frequency");
            System.out.println("6 Capitalize Words");
            System.out.println("7 Check Anagram");
            System.out.println("8 String Compression");
            System.out.println("9 Print Alphabets (a-n)");
            System.out.println("0 Exit");

            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            if (choice == 0) {
                System.out.println("Exiting program...");
                break;
            }

            System.out.print("Enter String: ");
            String input = sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Reversed: " + StringUtils.reverse(input));
                    break;

                case 2:
                    System.out.println("Palindrome: " + StringUtils.isPalindrome(input));
                    break;

                case 3:
                    System.out.println("Vowels: " + StringUtils.noOfvowels(input));
                    break;

                case 4:
                    System.out.println("Without duplicates: " + StringUtils.removeDups(input));
                    break;

                case 5:
                    StringUtils.charFreq(input);
                    break;

                case 6:
                    System.out.println("Capitalized: " + StringUtils.capitalize(input));
                    break;

                case 7:
                    System.out.print("Enter second string: ");
                    String second = sc.nextLine();
                    System.out.println("Anagram: " + StringUtils.validAnagram(input, second));
                    break;

                case 8:
                    System.out.println("Compressed: " + StringUtils.stringcompression(input));
                    break;

                case 9:
                    int n = Integer.parseInt(input);
                    System.out.println(StringUtils.printAtoN(n));
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}