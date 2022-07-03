package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.next();
        System.out.println("Encryption text: " + encryption(text));
    }


    public static String encryption(String text) {

        char[] encryptionValues1 = {'t', 'c', 'd', 'o', 'p', 'y', 'g', 'e', 'f', 'o', 'p', 'a', 'm',
                'p', 'l', 'p', 'q', 's', 't', 'e', 'f', 'v', 'w', 'x', 'y', 'z'};

        char[] encryptionValues2 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};


        char[] chars = text.toCharArray();

        StringBuilder builder = new StringBuilder();
        for (char s : chars) {

            for (int j = 0; j < encryptionValues2.length; j++) {

                if (encryptionValues2[j] == s) {
                    builder.append(encryptionValues1[j]);
                }

            }
        }

        return builder.toString();
    }
}
