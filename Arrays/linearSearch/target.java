import java.util.Scanner;

public class target {
    public static int search(int arr[],int target){
        int index=0;
        while (index<arr.length) {
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,14,15,9,8,11};

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter target");
        int target=sc.nextInt();

        System.out.println(search(arr, target));
    
    }
}
