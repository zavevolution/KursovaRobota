package javastarter;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        // Задача №1.
        System.out.println(sumOfNumber(15545)); // out 20
        // Задача №2.
        System.out.println(reversNumber(123456)); // out 654321
        // Задача №3.
        System.out.println(calculateName("Roman")); // out 61
    }

    /*
     *   Завдання №1
     */
    public static int sumOfNumber(int number) {
        int result = 0;
        int temp;
        while (number > 0) {
            temp = number % 10;
            number /= 10;
            result += temp;
        }
        return result;
    }

    /*
     *  Завдання №2
     */
    public static int reversNumber(int number) {
        int count = Integer.toString(number).length();
        int result = 0;
        int temp;
        while (number > 0) {
            temp = number % 10;
            number /= 10;
            result += temp * Math.pow(10, --count);
        }
        return result;
    }

    /*
     * Завдання №3
     */
    public static int calculateName(String name) {
        int result = 0;
        name = name.toLowerCase();
        String s = "_abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < name.length(); i++) {
            result += s.indexOf(name.charAt(i));
        }
        return result;
    }
}