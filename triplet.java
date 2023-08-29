import java.util.*;

//mport geeksforgeeks.objclass;

public class triplet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        System.out.println("Enter the number to get as output: ");
        int out = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of an array :");
        for(int i=0;i<num;i++){
            arr.add(sc.nextInt());
        }
        objclass obj = new objclass();
        obj.findtriplet(arr,out);
    }
}
