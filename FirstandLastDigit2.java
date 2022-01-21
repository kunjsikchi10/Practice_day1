
//Kunj Sikchi,kunjsikchi2002@gmail.com
import java.util.Scanner;

public class FirstandLastDigit2 {
    private static Scanner sc;

    public static void main(String[] args) {
        int number, first_digit, last_digit;
        sc = new Scanner(System.in);

        System.out.print(" Please Enter any Number more than two digit that you wish : ");
        number = sc.nextInt();
        first_digit = firstDigit(number);

        last_digit = lastDigit(number);

        System.out.println("\n The First Digit of a Given Number " + number + "  =  " + first_digit);
        System.out.println("\n The Last Digit of a Given Number " + number + "  =  " + last_digit);
    }

    public static int firstDigit(int num) {
        while (num >= 10) {
            num = num / 10;
        }
        return num;
    }

    public static int lastDigit(int num) {
        return num % 10;
    }
}
