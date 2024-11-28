import java.util.*;
public class Rev {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int sum=0;
        while(n!=0){
            int lastDigit=n%10;
            rev=rev*10+lastDigit;
            sum+=lastDigit;
            n=n/10;
        }
        System.out.println("Reverse number is "+rev);
        System.out.println("Sum of digits is "+sum);
    }
}
