import java.util.*;
import java.io.*;

public class palindrome{
  public static void main(String [] agrs){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String  :  ");
    String str = sc.next();
    System.out.println("The string is : "+str);
    StringBuilder temp = new StringBuilder(str);
    temp.reverse();
    System.out.println("The reversed string is : "+temp.toString());
  }
}
  
