public class ByRefference {
    public static void update(int marks[]){
        for(int index=0;index<marks.length;index++){
            marks[index]=marks[index]+1;
        }
    }
    public static void printArray(int marks[]){
        int index=0;
        while (index<marks.length) {
            System.out.print(marks[index] +" ");
            index++;
        }
    }
    public static void main(String[] args) {
        int marks[]={95,98,99};
        //calling to update funtion just to update the marks by adding 1
        update(marks);
        System.out.println("Updated marks");
        //calling printing funtion just to print the array
        printArray(marks);
    }
}
