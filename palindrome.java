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
    String rev_str = temp.toString();
    System.out.println("The reversed string is : "+rev_str);
    if(rev_str.equals(str)){
      System.out.println("The string is palindrome ");
    }
    else {
      System.out.println("The string is not a palindrome");
    }

    
  }
}
  
