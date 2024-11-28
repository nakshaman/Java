import java.util.*;
public class Practise {
    public static void func(){
        int positive=0;
        int negative=0;
        int zero=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Do you want to enter the number? (Yes/No)");
        String choice=sc.next();
        while(choice.equalsIgnoreCase("Yes")){
            System.out.println("Enter the number");
            int num=sc.nextInt();
            if(num>=1){
                positive+=1;
            }
            else if(num==0){
                zero+=1;
            }
            else if(num<0){
                negative+=1;
            }
            System.out.println("Do you want to enter the number? (Yes/No)");
            choice=sc.next();
        }
        System.out.println("Number of positive "+positive);
        System.out.println("Number of negative "+negative);
        System.out.println("Number of zero "+zero);
    }
    public static void main (String args[]){
        func();
    }
}
