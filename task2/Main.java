package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();

        int result = TubSonlarKupaytmasi(n);

        System.out.println("Natija : " + countZero(result));

    }

    private static int TubSonlarKupaytmasi(int n) {
        boolean tub ;
        int multiple = 1;

        for (int i = 1; i <= n; i++) {
            tub = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    tub = false;
                    break;
                }
            }
            if (tub) multiple *= i;

        }
        System.out.println(multiple);
        return multiple;
    }

    private static int countZero(int result) {
        int count = 0;
        while (result > 0) {
            if (result % 10 == 0) {
                count++;
            }else {
                break;
            }
            result /= 10;
        }
        return count;
    }
}