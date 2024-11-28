interface Animal{
    void walk();
}
class Horse implements Animal{
    public void walk(){
        System.out.println("Start walking");
    }
}
public class Inter {
    public static void main(String artgs[]){
        Horse h=new Horse();
        h.walk();
    }
}
