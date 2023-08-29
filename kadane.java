import java.util.*;

public class kadane{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the number of an array :");
        for(int i=0;i<num;i++){
            arr.add(sc.nextInt());
        }
        objkadane obj = new objkadane(arr,num);

    
    }
}