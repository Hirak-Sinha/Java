import java.util.Scanner;
class plate {
int length, width;
plate() {
System.out.println("Grandfather Class Constructor Called");

}
}
class box extends plate {
int height;
box() {
System.out.println("Father Class Constructor Called.");
}
}
class wood_box extends box {
int thick;
wood_box() {
System.out.println("Child Class Constructor Called");

}
}
class lab6q2{
public static void main(String args[]) {
wood_box obj = new wood_box();
}
}
