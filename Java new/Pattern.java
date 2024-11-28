import java.util.*;

public class Pattern {
  public static void main(String args[]){
    System.out.println("Enter the number of rows you want ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
  }  
}
