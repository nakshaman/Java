import java.util.*;
public class input {
    public static void main(String ar[]){
        // System.out.println("Enter your full name ");
        // Scanner sc=new Scanner(System.in);
        // String name=sc.nextLine();
        // System.out.println("Your name is "+name);
        System.out.println("Enter the first number ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter the second number ");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum of two above two numbers is "+(sum));
        if(sum>18){
            System.out.println("Sum is greater than 18 ");
        }
        else{
            System.out.println("Sum is not greater than 18 ");
        }
    }
}
