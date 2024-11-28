import java.util.*;
public class Series {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        int n=sc.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++){
            sum+=Math.pow(x, i);
        }
        System.out.println(sum);
    }
}
