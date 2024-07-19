import java.util.Scanner;

public class ArrayCC {
    public static void main(String[] args) {
        int marks[]=new int[50];
        Scanner sc=new Scanner(System.in);
        
        marks[0]=sc.nextInt();//chemestry
        marks[1]=sc.nextInt();//physics
        marks[2]=sc.nextInt();//maths

        System.out.println("Chemistry : "+marks[0]);
        System.out.println("physics : "+marks[1]);
        System.out.println("maths : "+marks[2]);


        //updating the Mathematics marks
        marks[2]=marks[2]+1;
        System.out.println("Upadated Maths-Mars :"+marks[2]);

        //calculate the percentage of marks

        double percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("Total percentage : "+percentage+" % ");

        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
    }
}
