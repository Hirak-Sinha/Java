
public class lab6q3 
{
   
    public static void main(String[] args)
    {
        Rectangle obj = new Rectangle();
    obj.Area(15.6, 13.4);
        Circle obj1 = new Circle();
        obj1.Area(3);
        
        
    }
}
class Circle 
{
    static final double PI = Math.PI;    
    void Area(double r)
    {
        double A = PI * r * r;
  
        System.out.println("The area of the circle is :" + A);
    }
  
    
}
class Rectangle 
{
    
    void Area(double l, double b)
    {
        System.out.println("Area of the rectangle: " + l * b);
    }
    
    
}