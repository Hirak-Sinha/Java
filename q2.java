import java.io.*;
import java.lang.*;
class LessBalanceException extends Exception
{
 LessBalanceException(double amt)
 {
 System.out.println("Withdrawing "+amt+" is invlaid");
 }
}
class Account
{
 static int count=0;
 int accno;
 double bal;