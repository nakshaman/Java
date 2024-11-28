import java.util.*;
public class Rec{
    public static void sum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        sum(i+1,n,sum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of i");
        int i=sc.nextInt();
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        sum(i,n,0);
    }
}