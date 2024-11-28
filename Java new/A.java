import java.util.*;
public class A {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row's and column");
        int r=sc.nextInt();
        int c=sc.nextInt();
        
        int arr[][]=new int[r][c];
        System.out.println("Taking first array input");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Taking second array input");
        int arr2[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Adding the sum");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
