import java.util.*;
abstract class Shape{
    Scanner sc = new Scanner(System.in);
    int l,b;
    double area();
}
class Rectangle extends Shape{
    Rectangle(){
        System.out.println("Enter length , breadth of rectangle: ");
        l=sc.nextInt();
        b=sc.nextInt();
    }
    double area(){
        return (l*b);
    }
}
class Triangle extends Shape{
    Triangle(){
        System.out.println("Enter height ,length of base of triangle: ");
        l=sc.nextInt();
        b=sc.nextInt();
    }
    double area(){
        return (0.5*l*b);
    }
    
}
class Circle extends Shape{
    Circle(){
        System.out.println("Enter radius: ");
        l=sc.nextInt();
    }
    double area(){
        return (3.14*l*l);
    }
}
class shapeEx{
    public static void main(String s[]){
        Circle c = new Circle();
        System.out.println("Area="+c.area());
        Triangle t = new Triangle();
        System.out.println("Area="+t.area());
        Rectangle r = new Rectangle();
        System.out.println("Area="+r.area());
    }
}