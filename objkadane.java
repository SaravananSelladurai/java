import java.util.*;

public class objkadane {
    /*int lar_num=0;
    int sum =0;
    objkadane(List<Integer> arr,int num){
        Collections.sort(arr);
        System.out.println(arr);
        lar_num = arr.get(num-1);
        for(int i=num-2;i>=0;i--){
            int temp = arr.get(i);
            sum = lar_num+temp;
            if(sum > lar_num){
                lar_num = sum;
            }
            else{
                break;
            }
        }
        System.out.println(lar_num);
    }  */

    //K count pairs divisible by k

    
     int count=0;
    objkadane(List<Integer>arr,int k){
        int size = arr.size();
        for(int i=0;i<size;i++){
            int sum =0;
            for(int j=i+1;j<size;j++){
                sum = arr.get(i)+arr.get(j);
                if(sum%k==0){
                    System.out.println(arr.get(i)+" "+arr.get(j));
                    count++;
                }
            }
        }
        System.out.println("The count is : "+count); 
    }
    


}
