class Student {
    String name;
    int age;
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println(name+" "+age);
    }
}
public class Inhertance {
    public static void main(String args[]){
        Student s1=new Student();
        s1.printInfo(19);
        s1.printInfo("aman");
        s1.printInfo("naksh", 24);
    }
}
