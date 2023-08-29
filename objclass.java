//package geeksforgeeks;

import java.util.*;

public class objclass {
    /*public void findSteps(int num,List<Integer> arr) {
        int steps=0;

        for(int i=0;i<num;i++){
            int a = (int) arr.get(i);
            System.out.println("The value of a :"+a);
            while(a!= 1 && a!= -1){
                if(a>0){
                    a--;
                    System.out.println("---");
                }
                else if(a<0){
                    a++;
                    System.out.println("++++");
                }
                steps++;
            }
            System.out.println("The count of steps in loops"+steps);
        }
        System.out.println("Total no.of steps :"+steps);
    }*/


    public void findtriplet(List<Integer> arr,int num){
        int step =0;
        int size = arr.size();
        System.out.println("The size is : "+size);
        for(int i=0;i<size;i++){
             int itr = i;
             int j=i+1;
             int k=i+2;
             int i_count=0;
             if(k>size-1){
                k=k-(size);
             }
             if(j> size-1){
                j = j-(size);
             }
             int summ =0;
             
             while(i_count != size-1){
                int val_1 = arr.get(i);
                int val_2 = arr.get(j);
                int val_3 = arr.get(k);
                summ = val_1+val_2+val_3;
                System.out.println("The values are : "+val_1 +" "+val_2 +" "+ val_3);
                System.out.println("The sum is : "+summ);
                if(summ == num){
                    step++;
                    break;
                }
                if(j==size-1){
                    j=-1;
                }
                if(k==size-1){
                    k=-1;
                }
                j++;
                k++;
                if(k==itr){
                   k++; 
                   if(k>size-1){
                    k=0;
                   }
                }
                else if(j==itr){
                    j++;
                    if(j>size-1){
                    j=0;
                   }
                }    
                i_count++;
            }
            System.out.println("The value of i and icount: "+i+" "+i_count);
        }
        System.out.println(step);
    }

    public void findSteps(int num, List<Integer> arr) {
    }

}
