import java.util.*;
import java.util.Arrays;
public class lab5q1
{
public static int sub (int a, int b)

{ int res=a-b; return res;

}
public static float sub (float a, float b) { float res= a-b;

return res;
}
public static int sub (int b)
{ int a=10; int res=a-b; return res;

}
public static void main (String[]args)
{
Scanner sc = new Scanner (System.in); 
lab5q1 obj = new lab5q1();

int n=sub(10,5);

float p=sub(10.0f,2.0f); 
int q=sub(30); 
System.out.println(n); 
System.out.println(p);
 System.out.println(q);

}
}

