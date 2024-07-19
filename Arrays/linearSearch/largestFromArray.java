public class largestFromArray {
    public static int getLargestNum(int numbers[]){
        int largest = Integer.MIN_VALUE;//Considering - infinity
        int smallest=Integer.MAX_VALUE;//2147483647
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = { 1, 2, 6, 3, 5, 89 };

        // write a program to find the largest from the array

       int largest= getLargestNum(numbers);
       System.out.println(largest);
       
    }

}
