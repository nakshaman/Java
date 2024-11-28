import java.util.*;
public class Pat {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first value");
        int a=sc.nextInt();
        System.out.println("Enter the second value");
        int b =sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the operation you want to perform ");
        String c=sc.nextLine();
        switch (c) {
            case "+":
                System.out.println("Value after adding :"+(a+b));
                break;
            case "*":
                System.out.println("Value after multiplication :"+(a*b));
                break;
            case "-":
                System.out.println("Value after subtraction :"+(a-b));
                break;
            case "/":
                System.out.println("Value after division :"+(a/b));
                break;
            default:
                System.out.println("Invalid input Please try again");
                break;
        }
    }
}
