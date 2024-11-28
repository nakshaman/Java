import java.util.*;
public class functions {
    public static void funct(String name){
        System.out.println("Hello "+ name);
        return;
    }
    public static int returnSum(int a ,int b){
        return a+b;
    }
    public static int calcFact(int num){
        if(num<1){
            System.out.println("Invalid number");
            return -1;
        }
        int result=1;
        for(int i=1;i<=num;i++){
            result*=i;
        }
        return result;
    }
    public static void main (String args[]){
        // System.out.println("Enter your name ");
        // Scanner sc=new Scanner(System.in);
        // String name=sc.nextLine();
        // funct(name);
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the first number ");
        // int a=sc.nextInt();
        // System.out.println("Enter the second number ");
        // int b=sc.nextInt();
        // int sum = returnSum(a,b);
        // System.out.println("The sum of these two numbers is "+sum);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        int result=calcFact(num);
        if(result==-1){
            return ;
        }
        else{
            System.out.println("Factorial of "+num +" is "+result);
        }
    }
}
