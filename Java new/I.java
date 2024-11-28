class Shape{
    String color;
}

// single level inheritance
class Rectangle extends Shape{
    Rectangle(){}
    int length;
    int breadth;
    Rectangle(int l,int b){
        this.length=l;
        this.breadth=b;
    }
    void printInfo(){
        System.out.println("Length is "+length);
        System.out.println("Breadth is "+breadth);
        System.out.println("Color is "+color);
    }
}
class Square extends Rectangle{
    int side;
    Square(int s){
        this.side=s;
    }
}
public class I {
    public static void main(String args[]){
        // Rectangle r=new Rectangle(1, 2);
        // r.color="yellow";
        // r.printInfo();
        
    }
}
