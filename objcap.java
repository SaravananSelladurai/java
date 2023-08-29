import java.util.*;

public class objcap {
    objcap(ArrayList<Integer> arr,int days){
        int size = arr.size();
        int diff = size/days;
        if(diff == 1 ){
            int maxi = Collections.max(arr);
            System.out.println("The max is : "+maxi);
        }
        else {
            int j=0;
            int rem = size%days;
            int sum=0;
            int great = 0;
            for(int i=0;i<size-rem;i++){
                sum += arr.get(i);
                j++;
                if(j==days && days!= 1){
                    if(great<sum){
                        great = sum;
                    }
                    sum =0;
                    j=0;
                }
                else{
                    great = sum;
                }
            }
            System.out.println("The maxi was : "+great);
        }
    }
}
