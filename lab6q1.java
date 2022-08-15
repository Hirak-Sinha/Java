import java.util.Scanner;

// Write a program in java to input and display the details of n number of students having
// roll, name and cgpa as data members. Also display the name of the student having lowest
// cgpa.
public class lab6q1{
    public static void main(String[] args)
    {
        
      student[] s=new student[3];
      for(int i=0;i<3;i++)
      {
          s[i]=new student();
          System.out.println("Enter roll name and cgpa of student "+ (i+1));
          s[i].setdata();

      }  
      for(int i=0;i<3;i++)
      {
          System.out.println("Student "+i );
         s[i].showdata();

      } 
      int j=0;
      double mincgpa=s[0].cgpa; 
      for(int i=1;i<3;i++)
      {
           if(s[i].cgpa<mincgpa) 
           {
            j=i;
            mincgpa=s[i].cgpa;
           }
           
      }
      System.out.println("Student with lowest cgpa:");
      s[j].showdata();

    }
}

class student{
    int roll;
    String name;
    double cgpa;
public void setdata(){
    Scanner sc=new Scanner(System.in);
    this.roll=sc.nextInt();
    // sc.nextLine();
    this.name=sc.next();//first name only
    this.cgpa=sc.nextDouble();
}

public void showdata(){
    System.out.println("Roll: "+this.roll +"\n Name: "+ this.name +"\nCGPA: "+ this.cgpa +"\n\n");
}

}