package javastarter;

public class Program {
    public static void main(String[] args) {
        // Задача №1.
        System.out.println(sumOfNumber(15545)); // out 20
        // Задача №2.
        System.out.println(reversNumber(123456)); // out 654321
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
}
