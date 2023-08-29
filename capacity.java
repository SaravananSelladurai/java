import java.util.*;

public class capacity {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int num = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("Enter the elements of an array : ");
        for(int i=0;i<num;i++){
            arr.add(sc.nextInt());
        }
        System.out.println("Enter the no.of days : ");
        int days = sc.nextInt();
        //System.out.println(arr);
        objcap obj =  new objcap(arr,days);
    }
}
