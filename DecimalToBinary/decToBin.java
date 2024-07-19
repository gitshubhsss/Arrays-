import java.util.Scanner;

public class decToBin {
    public static void main(String[] args) {
        //convert the number from decimal to binary
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        double dec=0;
        int pow=0;
        while (n>0) {
            int rem=n%2;
            dec=dec+rem*Math.pow(10, pow);
            pow++;
            n=n/2;
        }
        System.out.println((int)dec);
    }
}
