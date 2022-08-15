class overloading
{
void area(float x) {System.out.println("area= " + 3.14*x*x);}
void area(float x,float y) {System.out.println("area= " + x*y);}
void area(double x) {System.out.println("area= " + x*x);}
}
public class lab4q5 {
public static void main(String[] args){
overloading ob=new overloading();
ob.area(2);
ob.area(2,5);
ob.area(3,7);
}
}
