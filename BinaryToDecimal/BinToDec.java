import java.util.Scanner;

public class BinToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number");

        int n = sc.nextInt();
        int pow = 0;
        double decimal_number = 0;

        while (n>0) {
            int lastNumber = n % 10;
            decimal_number = decimal_number + lastNumber * Math.pow(2, pow);
            pow++;
            n = n / 10;
        }
        System.out.println((int) decimal_number);
    }
}
