import java.util.*;

public class S {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rating ");
        int x=sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("*");
                break;
            case 2:
                System.out.println("**");
                break;
            case 3:
                System.out.println("***");
                break;
            default:
                System.out.println("Envalid input");
                break;
        }
    }
}
