import java.util.Scanner;
class lab5q2
{
   public static void main(String args[]) 
    {   
      double l,b,area,perimeter;
       
      Scanner myobj= new Scanner(System.in);
        
         System.out.println("Enter the length:");
          l= myobj.nextDouble();
        System.out.println("Enter the breadth:");
          b= myobj.nextDouble();
        
          
           area=l*b;
      System.out.println("Area of Rectangle is: " + area);
       perimeter=2*(l+b);      
       System.out.println("Perimeter of Rectangle is: " + perimeter);
   }
}