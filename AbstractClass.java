abstract class Shape{
    abstract double area();
    void display(){
        System.out.println("Shape");
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    @Override
     double area(){
        return 3.14*radius*radius;  
    }
}
class Rectangle extends Shape{
    double length;
    double width;
    Rectangle (double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
     double area(){
        return length*width;
        
    }
}
public class AbstractClass{
    public static void main (String[] args){
        Shape s;
        s= new Circle(2.5);
        s.display();
        System.out.println("area of circle: "+s.area());
        s= new Rectangle(3.2,5.2);
        s.display();
        System.out.println("area of rectangle: "+s.area());


    }
}