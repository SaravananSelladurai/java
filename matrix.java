import java.util.*;

public class matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row :");
        int row = sc.nextInt();
        System.out.println("Enter the size of column :");
        int col = sc.nextInt();
        System.out.println("Enter the elements of an array : ");
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i=0;i<row;i++){
            arr.add(new ArrayList<>());
            }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr.get(i).add(sc.nextInt());
            }
        }
        int temp =0;
        int maxi=0;
        for(ArrayList<Integer> i : arr){
            temp = Collections.max(i);
            if(temp > maxi){
                maxi = temp;
            }
        }
        System.out.println("The max value is : "+maxi);
        int count =0;
        System.out.println("Enter the position :");
        int pos = sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                count++;
                if(count==pos){
                    System.out.println("The value in the position : "+arr.get(i).get(j));
                }
            }
        }
    }
}
