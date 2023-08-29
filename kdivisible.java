import java.util.*;

public class kdivisible {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Enter the elements of an array : ");
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<num;i++){
            arr.add(sc.nextInt());
        }
        System.out.println("Enter the number to be divisible : ");
        int k = sc.nextInt();
        objkadane obj = new objkadane(arr,k);
    }
}
