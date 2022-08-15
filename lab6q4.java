import java.util.Scanner;

class Account{
int acc_no,balance;
Account(int a, int b){
acc_no=a;
balance=b;
}
void disp(){
System.out.println("Account no is : "+acc_no);
System.out.println("Balance is : "+balance);
}
}
class Person extends Account{

int aadhar_no;
String name;
Person(int a,int b,String n,int c){
super(a,b);
name=n;
aadhar_no=c;
}
void disp(){
super.disp();
System.out.println("Name is : "+name);
System.out.println("Aadhar no is : "+aadhar_no);

}
}
public class lab6q4{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
Person viv=new Person(334445,453333,"Hirakjyoti Sinha",20051007);

Person viv1=new Person(345678,5675678,"ajay",2005664);
Person viv2=new Person(34583455,22759999,"Vikram",139939);
viv.disp();
System.out.println();
viv1.disp();
System.out.println();
viv2.disp();




}

}


