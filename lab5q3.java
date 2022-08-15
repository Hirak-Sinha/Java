import java.util.*;
import java.util.Arrays;
public class lab5q3
{
public static void main(String[] args) { 
	Scanner in=new Scanner(System.in); 
System.out.println("Enter the size of the array : ");
 int size = in.nextInt();

int a[]=new int[size];
int freq[]=new int[size];
int i,j,count;
System.out.println("Enter the elements in the array :"); 
for(i=0;i<size;i++)

{ 
	a[i]=in.nextInt(); 
	freq[i]= -1;

}
for(i=0;i<size;i++)
 { 
	count=1;
	 for(j=i+1;j<size;j++) 
	 {

if(a[i]==a[j]) 
	{ 
		count++; 
		freq[j]=0;

}
}
if(freq[i]!=0) 
	{ 
		freq[i]=count;

}
}
System.out.println("Frequency of all the elements: ");
System.out.println("Element | Frequency"); 

for(i=0;i<size;i++) 
{

System.out.println(a[i]+" "+ freq[i]); 
System.out.println();

}
}
}