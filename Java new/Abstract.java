abstract class Animal{
    abstract void walk();
    public void eat(){
        System.out.println("Animal eats ");
    }
}
class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 leg");
    }
}
public class Abstract {
    public static void main (String args[]){
        Horse h=new Horse();
        h.walk();
        h.eat();
    }
}
