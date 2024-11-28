// Multi Level inheritance
class A{
    int a;
}
class B extends A{
    int b;
}
class C extends B{
    int c;
    void printInfo(){
        System.out.println("Value of a is "+a);
        System.out.println("Value of b is "+b);
        System.out.println("Value of c is "+c);
    }
}
public class X {
    public static void main (String args[]){
        C x=new C();
        x.a=1;
        x.b=2;
        x.c=3;
        x.printInfo();
    }
    
}
