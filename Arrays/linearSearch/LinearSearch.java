import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number to be search");
        int searchNumber=sc.nextInt();
        int count=0;
        int index=0;
        while (index<numbers.length) {
            if(numbers[index]==searchNumber){
                System.out.println("Number found at : "+index);
                count++;
            }
            index++;
        }
        if(count==0){
            System.out.println("Number not found");
        }
    }
}
