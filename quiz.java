import java.util.*;
public class quiz {
    public static void main (String args[]){
        System.out.println("Enter the number ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        // if(num==1){
        //     System.out.println("Hello");
        // }
        // else if(num==2){
        //     System.out.println("Namaste");
        // }
        // else if(num==3){
        //     System.out.println("Bonjour");
        // }
        // else{
        //     System.out.println("Invalid input");
        // }
        switch (num) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;        
            default:
                System.out.println("invalid input");
                break;
        }
    }    
}
