import java.util.*;
public class Two {
    public static double func(double a){
        return Math.sqrt(a);
    }
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        // int b=sc.nextInt();
        double sum=func(a);
        System.out.println(sum);
    }    
}
