import java.util.*;
public class Fact {
    public static int factSum(int x){
        if(x==1){
            return 1;
        }
        return factSum(x-1)*x;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=factSum(n);
        System.out.println(sum);
    }
}
