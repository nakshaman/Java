import java.util.*;

public class Arraysop {
    public static void main(String args[]){
        // int arr[]=new int[5];
        // arr[0]=87;
        // arr[1]=77;
        // arr[2]=12;
        // arr[3]=45;
        // arr[4]=0;
        // for(int i=0;i<5;i++){
        //     System.out.println(arr[i]);
        // }
        // array input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();

        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number you are searching for ");
        int search=sc.nextInt();
        int found=0;
        for(int i=0;i<size;i++){
            if(arr[i]==search){
                System.out.println("Element found on index "+ i);
                found=1;
                break;
            }
        }
        if(found==0){
            System.out.println("Element not found");
        }
    }
}
