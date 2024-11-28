import java.util.*;
public class Recu{
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Till which number you want to print fibonachi series");
        int n=sc.nextInt();
        System.out.println("Fibonachi series upto "+n+"th term are as follows:");
        for(int i=0;i<=n;i++){
            System.out.print(fib(i)+" ");
        }
    }
}