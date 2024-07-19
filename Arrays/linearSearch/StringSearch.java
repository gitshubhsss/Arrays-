import java.util.Scanner;

public class StringSearch {
    public static int searchName(String names[],String keyName){
        int index=0;
        while (index<names.length) {
            if(keyName.equals(names[index])){
                return index;
            }
            index++;
        }
        return -1;

    }
    public static void main(String[] args) {
        String names[]={"shubham","neeta","shubhangi","pavan","ashish"};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name to search");
        String keyName=sc.nextLine();
        int result=searchName(names,keyName);
        if(result==-1){
            System.out.println("Name not found in the String array");
        }
        else{
            System.out.println("Your name is found on index  "+result);
        }
    }
}
