//package geeksforgeeks;

import java.util.*;

public class maths {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        List<Integer> arr = new ArrayList<Integer>();
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<num;i++){
            int num1 = sc.nextInt();
            arr.add(num1);
        }
        objclass obj = new objclass();
        obj.findSteps(num,arr);
        //System.out.println(arr);
        sc.close();
    }
    
}
