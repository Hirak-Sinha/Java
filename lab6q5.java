class lab6q5{
public static void main(String args[]){
childClass obj=new childClass();
}
}
class baseClass{
baseClass(int a)
{

System.out.println("INSIDE BASE CLASS PARAMETERISED CONSTRUCTOR WITH PARAMETER=" + a);

}
}
class childClass extends baseClass {
childClass(){
super(2);
System.out.println("USED SUPER TO CALL BASE CLASS IN ABOVE LINE"); System.out.println("INSIDE CHILD CLASS");

}
}