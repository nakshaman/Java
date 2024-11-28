import java.util.*;
public class ifelse {
    public static void main (String args[]){
        // System.out.println("Enter your age ");
        System.out.println("Enter the number ");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        // if(age>=18){
        //     System.out.println("Adult");
        // }
        // else{
        //     System.out.println("Not adult");
        // }
        if(age%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
