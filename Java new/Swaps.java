import java.util.*;
public class Swaps {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The value before swap a:"+a+" and b:"+b);
        // int temp=a;
        // a=b;
        // b=temp;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The value after swap a:"+a+" and b:"+b);
    }
}
