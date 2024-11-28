class X{
    int a;
}
class Y extends X{
    int b;
}
class Z extends X{
    int c;
}
public class Heirarchical{
    public static void main (String args[]){
        Y y=new Y();
        y.b=2;
        Z x=new Z();
        x.a=1;
        x.c=3;
    }
}