import java.util.*;
public class TwoDarray {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int twoD[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                twoD[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the number you are searching for ");
        int search=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(twoD[i][j]==search){
                    System.out.println("Element found on index ("+ i +","+j+")");
                }
            }
        }
    }
}
