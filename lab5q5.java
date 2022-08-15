import java.util.Scanner;

class lab5q5 {
  private static Scanner sc;
  
  public static void main(String[] args) {
    
    int i, j, rows, columns, sum = 0;
    
    sc= new Scanner(System.in);
    
    System.out.println("\n Enter Rows and Columns :  ");
    rows = sc.nextInt();
    columns = sc.nextInt();
    
    int[][] Sod_arr = new int[rows][columns];
    
    System.out.println("\n Please Enter the Items :  ");
    for(i = 0; i < rows; i++) {
      for(j = 0; j < columns; j++) {
        Sod_arr[i][j] = sc.nextInt();
      }   
    }
  
    for(i = 0; i < Sod_arr.length ; i++)
    {
      System.out.format("\nThe Item at " + i + "," + i +
          " position = " + Sod_arr[i][i]);
      sum = sum + Sod_arr[i][i];
    }
  System.out.println("\nThe Sum of the Matrix Diagonal Items = " + sum);

  }
}