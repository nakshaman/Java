class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // Student(String name,int age){
    //     this.name=name;
    //     this.age=age;
    //     System.out.println("constructor called");
    // }
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    Student(){}
}
public class Oops {
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="aman";
        s1.age=18;
        // s1.printInfo();
        Student s2=new Student(s1);
        s2.printInfo();
    }
}
