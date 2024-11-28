import java.util.*;
public class Search {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int r=sc.nextInt();
        int arr[]=new int[r];
        for(int i=0;i<r;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number you want to search");
        int search=sc.nextInt();
        int turn =0;
        for(int i=0;i<r;i++){
            if(arr[i]==search){
                System.out.println("Element found");
                turn=1;
                break;
            }
        }
        if(turn==0){
            System.out.println("Element not found in this array");
        }
    }
}
