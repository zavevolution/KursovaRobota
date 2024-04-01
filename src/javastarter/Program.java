package javastarter;

public class Program {
    public static void main(String[] args) {
        System.out.println(sumOfNumber(45));
    }

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
}
